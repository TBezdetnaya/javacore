package com.tbezdetnaya.app.homework.lesson17_v2.storage;

import com.tbezdetnaya.app.homework.lesson17_v2.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tanya on 28.01.2017.
 */
public class CSVStorage {
    private String arrayData ="resources/card.csv";
    private BufferedReader reader;
    private ArrayList<Student> listStudent;
    private ArrayList<Employee> listEmployee;


    public  CSVStorage() throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(arrayData));
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }
    public void init() throws IOException {
        String line;
        listEmployee = new ArrayList<>();
        listStudent = new ArrayList<>();
        reader.readLine();
        while ((line = reader.readLine())!= null){
            String[] arrSplit = line.split(",");
           Student student = new Student(line);
            if(arrSplit[5].contains("STUDENT")){
               listStudent.add(student);
            }else{
                Employee employee = new Employee(line);
                listEmployee.add(employee);
            }
        }

        reader.close();

    }
}
