package com.tbezdetnaya.app.classWork.lesson13;

/**
 * Created by ACER PC on 15.12.2016.
 */
public class Lesson13Runner {
    public static void main(String[] args) {
        /**
        Car car = new Car();
        System.out.println(car);
         */
        Student student = new Student();
        student.setName("Tanaka Rie");
        student.setAge(20);
        String name = student.getName();
        int age = student.getAge();
        System.out.println(name + " - " + age);




    }
}
