package com.tbezdetnaya.app.homework.lesson17.cardindex.dao.impl;
import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex.storage.CSVStorage;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVEmployeeDAOImpl implements CSVEmployeeDAO {
    private final CSVStorage storage;

    public CSVEmployeeDAOImpl(CSVStorage storage) {
        this.storage = storage;
    }


    @Override
    public List<Employee> getEmployees() {

        return storage.getEmployees();
    }
}
