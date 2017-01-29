package com.tbezdetnaya.app.homework.lesson17_v2.service.impl;

import com.tbezdetnaya.app.homework.lesson17_v2.dao.EmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.StudentDAO;
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
    private final StudentDAO studentDAO;
    private final EmployeeDAO employeeDAO;

    public SearchServiceImpl(StudentDAO studentDAO, EmployeeDAO employeeDAO) {
        this.studentDAO = studentDAO;
        this.employeeDAO = employeeDAO;

    }


    @Override
    public List<AbstractPerson> searchSurnameOrName(String input) {

        List<Student> students = studentDAO.getStudents();
        List<Employee> employees = employeeDAO.getEmployees();
        List<AbstractPerson> result = new ArrayList<>();
        for (int i = 0; i <students.size() ; i++) {
            Student student = students.get(i);
            if (student.getName().toLowerCase().contains(input)
                    ||student.getSurname().toLowerCase().contains(input)){
                result.add(student);
            }
        }
        for (int i = 0; i <employees.size() ; i++) {
            Employee employee = employees.get(i);
            if(employee.getName().toLowerCase().contains(input)
                    ||employee.getSurname().toLowerCase().contains(input)){
                result.add(employee);
            }

        }
        return result;
    }
}
