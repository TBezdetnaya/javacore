package com.tbezdetnaya.app.homework.lesson13;

/**
 * Created by Tanya on 17.12.2016.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        checkAge(age);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            this.age = age;
        }

    }

    public boolean checkAge(int age) {
        String result = (age >= 1 && age < 120) ? "New age setted: " + age : "Age invalid";
        System.out.println(result);
        return true;
    }

}
