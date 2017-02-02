package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;

import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.AbstractPerson;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardindex.service.SearchService;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Tanya on 28.01.2017.
 */
public class SearchServiceImpl implements SearchService {
    private final CSVStudentDAO studentDAO;
    private final CSVEmployeeDAO employeeDAO;

    public SearchServiceImpl(CSVStudentDAO studentDAO, CSVEmployeeDAO employeeDAO) {
        this.studentDAO = studentDAO;
        this.employeeDAO = employeeDAO;

    }


    @Override
    public List<AbstractPerson> searchPersonsBySurnameOrName(String input) {
        List<Student> students = studentDAO.getStudents();
        List<Employee> employees = employeeDAO.getEmployees();
        List<AbstractPerson> persons = new ArrayList<>();
        for (final Student student : students) {
            if (student.getSurname().equalsIgnoreCase(input)
                    || student.getName().equalsIgnoreCase(input)) {
                persons.add(student);
            }
        }

        for (final Employee employee : employees) {
            if (employee.getSurname().equalsIgnoreCase(input)
                    || employee.getName().equalsIgnoreCase(input)) {
                persons.add(employee);
            }
        }
        return persons;
    }

    @Override
    public List<Student> searchStudentsBySurnameOrNameOrFacultyOrCourse(String input) {
        List<Student> students = studentDAO.getStudents();
        List<Student> studentList = new ArrayList<>();
        for (final Student student : students){
            if (student.getSurname().toLowerCase().contains(input.toLowerCase())
                    ||student.getName().toLowerCase().contains(input.toLowerCase())
                    ||student.getFaculty().toLowerCase().contains(input.toLowerCase())
                    ||String.valueOf(student.getCourse()).contains(input.toLowerCase())){
                studentList.add(student);
            }
        }
        return studentList;
    }


    @Override
    public List<Employee> searchEmploeessBySurnameOrNameOrFaculty(String input) {
        List<Employee> employees = employeeDAO.getEmployees();
        List<Employee> employeeList = new ArrayList<>();
        for (final Employee employee : employees) {
            if (employee.getSurname().toLowerCase().contains(input.toLowerCase())
                    ||employee.getName().toLowerCase().contains(input.toLowerCase())
                    ||employee.getFaculty().toLowerCase().contains(input.toLowerCase())) {
                employeeList.add(employee);
            }
        }
        return employeeList ;

    }

}
