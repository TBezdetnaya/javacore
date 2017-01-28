package com.tbezdetnaya.app.homework.lesson17_v2.storage;

import com.tbezdetnaya.app.homework.lesson17_v2.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVStorage {
    private String dataSourceFile = "resources/cardindex.csv";
    private List<Student> students;
    private List<Employee> employees;



    public List<Employee> getListEmployee() {
        return employees;
    }

    public List<Student> getListStudent() {
        return students;
    }
    public void init() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dataSourceFile));
        String line;
        employees = new ArrayList<>();
        students = new ArrayList<>();
        reader.readLine();
        while ((line = reader.readLine())!= null){
            String[] arrSplit = line.split(",");
           Student student = new Student(line);
            if(arrSplit[5].contains("STUDENT")){
               students.add(student);
            }else{
                Employee employee = new Employee(line);
                employees.add(employee);
            }
        }

        reader.close();

    }
}
