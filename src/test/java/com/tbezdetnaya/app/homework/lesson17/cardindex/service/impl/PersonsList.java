package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.EmployeePosition;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.StudentType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tanya on 02.02.2017.
 */
public class PersonsList {
    public List<Student> listStudent(){
        Student bachelor = new Student();
        Student master = new Student();
        //student
        bachelor .setId(2);
        bachelor .setName("Fedor");
        bachelor .setSurname("Fedorov");
        bachelor .setFaculty("medical");
        bachelor .setCourse(2);
        bachelor .setType(StudentType.BACHELOR);

        master.setId(3);
        master.setName("Petr");
        master.setSurname("Petrov");
        master.setFaculty("medical");
        master.setCourse(2);
        master.setType(StudentType.MASTER);
        List<Student> students = Arrays.asList(bachelor, master);
        return students;
    }
    public List<Employee> listEmployee(){
        Employee professor = new Employee();
        Employee assistant = new Employee();
        //employee
        professor.setId(1);
        professor.setName("Ivan");
        professor.setSurname("Ivanov");
        professor.setFaculty("engineering");
        professor.setPosition(EmployeePosition.PROFESSOR);

        assistant.setId(4);
        assistant.setName("Oleg");
        assistant.setSurname("Petrov");
        assistant.setFaculty("engineering");
        assistant.setPosition(EmployeePosition.ASSISTANT);
        List<Employee> employees = Arrays.asList(professor, assistant);
        return employees;
    }

}
