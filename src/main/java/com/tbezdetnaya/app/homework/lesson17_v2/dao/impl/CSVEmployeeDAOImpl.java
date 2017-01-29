package com.tbezdetnaya.app.homework.lesson17_v2.dao.impl;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

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
