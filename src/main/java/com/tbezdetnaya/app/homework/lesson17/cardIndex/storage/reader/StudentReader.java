package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;

import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.StudentType;

/**
 * Created by Tanya on 28.01.2017.
 */
public class StudentReader extends AbstractPersonReader<Student> {

    @Override
    public Student read(final String[] data) {
        final Student student = new Student();
        fillPerson(data, student);
        student.setCourse(Integer.valueOf(data[4]));
        student.setType(StudentType.valueOf(data[5]));

        return student;
    }
}
