package com.tbezdetnaya.runners.classwork;
import com.tbezdetnaya.app.classWork.lesson14.Person;
import com.tbezdetnaya.app.classWork.lesson14.Student;

import java.util.ArrayList;


/**
 * Created by ACER PC on 20.12.2016.
 */
public class Lesson14Runner {
    public static void main(String[] args) {
        Student student = new Student("Kenji Kawaii", "University Vaseda");
        System.out.println(student);
        Person person = new Student("Yoko", "University Vaseda");
        Person person2 = new Student("Kenji Kawaii", "University Vaseda");
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add(person.toString());
        arrList.add(person2.toString());

        System.out.println(arrList.toString().replace("[", "").replace("]",""));



    }
}
