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
        Employee professor = new Employee();
        Employee assistant = new Employee();

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

        List<Employee> expectedEmployees = Arrays.asList(professor, assistant);
        List<Employee> actualEmployees = csvStorage.getEmployees();
        Assert.assertEquals(expectedEmployees, actualEmployees);


    }


    @Test
    public void testGetStudents() throws Exception {
        CSVStorage csvStorage = new CSVStorage(dataFileForTest);
        Student bachelor = new Student();
        Student master = new Student();

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

        List<Student> expectedStudents = Arrays.asList(bachelor, master);
        List<Student>  actualStudents = csvStorage.getStudents();
        Assert.assertEquals(expectedStudents,actualStudents);

    }
}