package com.tbezdetnaya.app.homework.lesson17_v2.domain;

/**
 * Created by Tanya on 28.01.2017.
 */
public class StudentReader extends AbstractPersonReader<Student>{

    @Override
    public Student read(final String[] data) {
        final Student student = new Student();
        fillPerson(data, student);
        student.setCourse(Integer.valueOf(data[3]));
        student.setType(StudentType.valueOf(data[4]));

        return student;
    }
}
