package com.tbezdetnaya.app.homework.lesson17_v2.service.impl;

import com.tbezdetnaya.app.homework.lesson17_v2.dao.EmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.StudentDAO;

/**
 * Created by Tanya on 28.01.2017.
 */
public class SearchServiceImpl {
    private final StudentDAO studentDAO;
    private final EmployeeDAO employeeDAO;

    public SearchServiceImpl(StudentDAO studentDAO, EmployeeDAO employeeDAO) {
        this.studentDAO = studentDAO;
        this.employeeDAO = employeeDAO;
    }
}
