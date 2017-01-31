package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage;

import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader.EmployeeReader;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader.StudentReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanya on 30.01.2017.
 */
public class CSVStorageTest {
    private String dataFileForTest = "src/test/resources/cardindex.csv";
    private String dataFileByEmployees ="src/test/resources/cardIndexForEmployees.csv";
    private String dataFileByStudents = "src/test/resources/cardIndexForStudents.csv";



    @Test
    public void testGetEmployees() throws Exception {
        CSVStorage csvStorage = new CSVStorage(dataFileForTest);
        List<Employee> employees = csvStorage.getEmployees();


        BufferedReader reader = new BufferedReader(new FileReader(dataFileByEmployees));
        List<Employee> employeesForCompare = new ArrayList<>();
        final EmployeeReader employeeReader = new EmployeeReader();
        String line;
        while ((line = reader.readLine()) != null) {
            final String[] personData = line.split(",");
            Employee employee = employeeReader.read(personData);
            employeesForCompare.add(employee);
        }
        Assert.assertEquals(employeesForCompare,employees);


    }

    @Test
    public void testGetStudents() throws Exception {
        CSVStorage csvStorage = new CSVStorage(dataFileForTest);
        List<Student>  students = csvStorage.getStudents();

        BufferedReader reader = new BufferedReader(new FileReader(dataFileByStudents));
        List<Student> studentsForCompare = new ArrayList<>();
        final StudentReader studentReader = new StudentReader();
        String line;
        while ((line = reader.readLine()) != null) {
            final String[] personData = line.split(",");
            Student student = studentReader.read(personData);
            studentsForCompare.add(student);
        }
        Assert.assertEquals(studentsForCompare,students);

    }
}