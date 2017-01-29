package com.tbezdetnaya.app.homework.lesson17_v2.service.impl;

import com.tbezdetnaya.app.homework.lesson17_v2.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.AbstractPerson;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.Student;
import com.tbezdetnaya.app.homework.lesson17_v2.service.SearchService;

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
        for (int i = 0; i <students.size() ; i++) {
            for(final Student student : students) {
                if (student.getSurname().equalsIgnoreCase(input)
                        || student.getName().equalsIgnoreCase(input)){
                    persons.add(student);
                }
            }

        }
        for (int i = 0; i <employees.size() ; i++) {
            for(final Employee employee : employees) {
                if(employee.getSurname().equalsIgnoreCase(input)
                        || employee.getName().equalsIgnoreCase(input)){
                    persons.add(employee);
                }
            }

        }

        return persons;
    }


}
