package com.tbezdetnaya.app.homework.lesson17;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tanya on 26.01.2017.
 */
public class Search {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Person> listSearch (ArrayList<Person> list)throws IOException {

        ArrayList<Person> result = new ArrayList<>();
        String value = sc.next();
        for (int i = 0; i <list.size(); i++) {
            Person person = list.get(i);
            if (person.getName().toLowerCase().contains(value)
                    || person.getSurname().toLowerCase().contains(value)
                    || person.getFaculty().toLowerCase().contains(value)
                    || person.getCourse().contains(value)){
                result.add(person);
            }
        }
        return result;

    }

    public void printResultSearchStudent(ArrayList<Person> list) {
        if(list.isEmpty()){
            System.out.println("Not found");

        }else{
            for (int i = 0; i <list.size() ; i++) {
                Person p = list.get(i);
                System.out.println( p.getName() + " " + p.getSurname()+ ", faculty - " + p.getFaculty()+ "; course is " + p.getCourse() + "; status - " + p.getStatus());
            }
        }


    }
    public void  printResultSearchEmployee(ArrayList<Person> list){
        if(list.isEmpty()){
            System.out.println("Not found");
        }else{
            for (int i = 0; i < list.size(); i++) {
                Person p = list.get(i);
                System.out.println( p.getName() + " " + p.getSurname()+ ", faculty - " + p.getFaculty()+ "; course is " + p.getStatus());
            }
        }


    }
    public void  printResultSearchListAll (ArrayList<Person> list){
        if(list.isEmpty()){
            System.out.println("Not found");
        }else{
            for (int i = 0; i < list.size(); i++) {
                Person p = list.get(i);
                System.out.println( p.getName() + " " + p.getSurname());
            }
        }


    }
}
