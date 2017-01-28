package com.tbezdetnaya.app.homework.lesson17_v2.dao.impl;

import com.tbezdetnaya.app.homework.lesson17_v2.dao.StudentDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVSturentDAOImpl implements StudentDAO {
    private final CSVStorage storage;

    public CSVSturentDAOImpl(CSVStorage storage) {
        this.storage = storage;
    }


    @Override
    public List<StudentDAO> getStudents() {
        return getStudents();
    }
}
