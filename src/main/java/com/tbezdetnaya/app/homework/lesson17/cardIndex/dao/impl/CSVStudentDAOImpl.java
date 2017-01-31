package com.tbezdetnaya.app.homework.lesson17.cardindex.dao.impl;

import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardindex.storage.CSVStorage;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVStudentDAOImpl implements CSVStudentDAO {
    private final CSVStorage storage;

    public CSVStudentDAOImpl(CSVStorage storage) {
        this.storage = storage;
    }


    @Override
    public List<Student> getStudents() {
        return storage.getStudents();
    }
}
