package com.tbezdetnaya.app.homework.lesson17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by tanya on 26.01.2017.
 */
public class FileUtils {
    private String arrayData ="resources/card.csv";
    private BufferedReader reader;
    private ArrayList<Person> listStudent;
    private ArrayList<Person>listEmployee;

    public FileUtils() throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(arrayData));
    }


    public ArrayList<Person> getListEmployee() {
        return listEmployee;
    }

    public ArrayList<Person> getListStudent() {
        return listStudent;
    }

    public  void readFileWord()throws IOException {
        String line;
        boolean firstLine = true;
        listEmployee = new ArrayList<>();
        listStudent = new ArrayList<>();
        while ((line = reader.readLine())!= null){
            Person person = new Person(line);
            if(firstLine){
                firstLine = false;
                continue;
            }
            if (person.isTitle()){
                listEmployee.add(person);
            }else{
                listStudent.add(person);
            }
        }
        reader.close();

    }
    public static ArrayList<Person> joinLists(ArrayList<Person> a, ArrayList<Person> b){
        ArrayList<Person> listAll = new ArrayList(a.size()+ b.size());
        listAll.addAll(a);
        listAll.addAll(b);
        return listAll;

    }


}
