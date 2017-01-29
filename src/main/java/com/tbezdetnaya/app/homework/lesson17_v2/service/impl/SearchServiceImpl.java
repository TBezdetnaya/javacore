package com.tbezdetnaya.app.homework.lesson17_v2.service.impl;

import com.tbezdetnaya.app.homework.lesson17_v2.dao.EmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.StudentDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.AbstractPerson;
import com.tbezdetnaya.app.homework.lesson17_v2.service.SearchService;


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



        return null;
    }
}
