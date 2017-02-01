package com.tbezdetnaya.app.homework.lesson17.cardindex.storage;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
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

        employee.setId(1);
        employee.setName("Ivan");
        employee.setSurname("Ivanov");
        employee.setFaculty("engineering");
        employee.setPosition(EmployeePosition.PROFESSOR);

        employee1.setId(4);
        employee1.setName("Oleg");
        employee1.setSurname("Petrov");
        employee1.setFaculty("engineering");
        employee1.setPosition(EmployeePosition.ASSISTANT);
        List<Employee> expectedEmployees = Arrays.asList(employee,employee1);

        Assert.assertEquals(expectedEmployees,actualEmployees);


    }


    @Test
    public void testGetStudents() throws Exception {
        CSVStorage csvStorage = new CSVStorage(dataFileForTest);
        List<Student>  actualStudents = csvStorage.getStudents();

        Student student = new Student();
        Student student1 = new Student();

        student.setId(2);
        student.setName("Fedor");
        student.setSurname("Fedorov");
        student.setFaculty("medical");
        student.setCourse(2);
        student.setType(StudentType.BACHELOR);

        student1.setId(3);
        student1.setName("Petr");
        student1.setSurname("Petrov");
        student1.setFaculty("medical");
        student1.setCourse(2);
        student1.setType(StudentType.MASTER);
        List<Student> expectedStudents = Arrays.asList(student,student1);
        Assert.assertEquals(expectedStudents,actualStudents);

    }
}