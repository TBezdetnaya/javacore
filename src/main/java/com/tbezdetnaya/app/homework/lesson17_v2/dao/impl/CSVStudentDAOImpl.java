package com.tbezdetnaya.app.homework.lesson17_v2.dao.impl;

import com.tbezdetnaya.app.homework.lesson17_v2.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.Student;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

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
