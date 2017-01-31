package com.tbezdetnaya.app.homework.lesson17.cardindex.storage;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanya on 30.01.2017.
 */
public class CSVStorageTest {
    private String dataFileForTest = "src/test/resources/cardindex.csv";


    @Test
    public void testGetEmployees() throws Exception {
        CSVStorage csvStorage = new CSVStorage(dataFileForTest);
        List<Employee> actualEmployees = csvStorage.getEmployees();

        Employee employee = new Employee();
        Employee employee1 = new Employee();
        List<Employee> expectedEmployees = new ArrayList<>();
        employee.setId(1);
        employee.setName("Ivan");
        employee.setSurname("Ivanov");
        employee.setFaculty("engineering");
        employee.setPosition(EmployeePosition.PROFESSOR);

        expectedEmployees.add(employee);


        employee1.setId(4);
        employee1.setName("Oleg");
        employee1.setSurname("Petrov");
        employee1.setFaculty("engineering");
        employee1.setPosition(EmployeePosition.ASSISTANT);
        expectedEmployees.add(employee1);

        Assert.assertEquals(expectedEmployees,actualEmployees);


    }


    @Test
    public void testGetStudents() throws Exception {
        CSVStorage csvStorage = new CSVStorage(dataFileForTest);
        List<Student>  actualStudents = csvStorage.getStudents();

        Student student = new Student();
        Student student1 = new Student();
        List<Student> expectedStudents = new ArrayList<>();
        student.setId(2);
        student.setName("Fedor");
        student.setSurname("Fedorov");
        student.setFaculty("medical");
        student.setCourse(2);
        student.setType(StudentType.BACHELOR);

        expectedStudents.add(student);


        student1.setId(3);
        student1.setName("Petr");
        student1.setSurname("Petrov");
        student1.setFaculty("medical");
        student1.setCourse(2);
        student1.setType(StudentType.MASTER);

        expectedStudents.add(student1);


        Assert.assertEquals(expectedStudents,actualStudents);

    }
}