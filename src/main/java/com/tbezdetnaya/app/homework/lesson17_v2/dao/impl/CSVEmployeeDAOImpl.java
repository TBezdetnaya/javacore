package com.tbezdetnaya.app.homework.lesson17_v2.dao.impl;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.EmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVEmployeeDAOImpl implements EmployeeDAO {
    private final CSVStorage storage;

    public CSVEmployeeDAOImpl(CSVStorage storage) {
        this.storage = storage;
    }


    @Override
    public List<EmployeeDAO> getEmployees() {
        return getEmployees();
    }
}
