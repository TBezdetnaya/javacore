package com.tbezdetnaya.app.homework.lesson17.cardIndex.dao;

import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.Student;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public interface CSVStudentDAO {
    List<Student> getStudents();

}