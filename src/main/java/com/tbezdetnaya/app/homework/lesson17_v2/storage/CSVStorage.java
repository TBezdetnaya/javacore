package com.tbezdetnaya.app.homework.lesson17_v2.storage;

import com.tbezdetnaya.app.homework.lesson17_v2.domain.*;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.reader.EmployeeReader;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.reader.StudentReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVStorage {
    
    private final List<Student> students;



    private final List<Employee> employees;


    public CSVStorage(String dataSourceFilePath ) throws IOException {
        this.students = new ArrayList<>();
        this.employees = new ArrayList<>();
        init(dataSourceFilePath);
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Student> getStudents() {
        return students;
    }
    private void init(String dataSourceFilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dataSourceFilePath));
        String dataSourceFileLine;
        reader.readLine();
        while ((dataSourceFileLine = reader.readLine()) != null) {
            final String[] personData = dataSourceFileLine.split(",");
            final PersonType personType = PersonType.valueOf(personData[5]);
            final EmployeeReader employeeReader = new EmployeeReader();
            final StudentReader studentReader = new StudentReader();
            switch (personType) {
                case EMPLOYEE:
                    final Employee employee = employeeReader.read(personData);
                    employees.add(employee);
                    break;
                case STUDENT:
                    final Student student = studentReader.read(personData);
                    students.add(student);
                    break;
                default:
                    throw new IllegalStateException("Unsupported personType = " + personType);
            }
        }

        reader.close();

    }
}
