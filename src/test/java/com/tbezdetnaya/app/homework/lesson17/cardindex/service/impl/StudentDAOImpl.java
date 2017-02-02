package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;

import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;
import java.util.List;

/**
 * Created by Tanya on 02.02.2017.
 */
public class StudentDAOImpl implements CSVStudentDAO {
    private List<Student> students;

    public StudentDAOImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> getStudents() {

        return students;
    }
}
