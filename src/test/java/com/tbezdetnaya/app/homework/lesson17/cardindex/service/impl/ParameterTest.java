package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tanya on 02.02.2017.
 */
public class ParameterTest {
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

    public List<Student> resultExpectedForSearchByStudents (){
        Student master = new Student();

        master.setId(3);
        master.setName("Petr");
        master.setSurname("Petrov");
        master.setFaculty("medical");
        master.setCourse(2);
        master.setType(StudentType.MASTER);
        List<Student> students = new ArrayList<>();
        students.add(master);
        return students;

    }
    public List<AbstractPerson> resultExpectedForSearchByPersons(){
        Employee assistant = new Employee();
        Student master = new Student();
        assistant.setId(4);
        assistant.setName("Oleg");
        assistant.setSurname("Petrov");
        assistant.setFaculty("engineering");
        assistant.setPosition(EmployeePosition.ASSISTANT);

        master.setId(3);
        master.setName("Petr");
        master.setSurname("Petrov");
        master.setFaculty("medical");
        master.setCourse(2);
        master.setType(StudentType.MASTER);

        List<AbstractPerson> persons = Arrays.asList(master, assistant);
        return persons;

    }
    public List<AbstractPerson> resultExpectedForSearchByPersons1(){

        Student master = new Student();
        master.setId(3);
        master.setName("Petr");
        master.setSurname("Petrov");
        master.setFaculty("medical");
        master.setCourse(2);
        master.setType(StudentType.MASTER);

        List<AbstractPerson> persons = Arrays.asList(master);
        return persons;

    }

}
