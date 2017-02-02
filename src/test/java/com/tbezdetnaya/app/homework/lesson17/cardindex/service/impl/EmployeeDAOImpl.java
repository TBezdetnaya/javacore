package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;

import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import java.util.List;

/**
 * Created by Tanya on 02.02.2017.
 */
public class EmployeeDAOImpl implements CSVEmployeeDAO {
    private List<Employee> employees;

    public EmployeeDAOImpl(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> getEmployees() {

        return employees;
    }

}
