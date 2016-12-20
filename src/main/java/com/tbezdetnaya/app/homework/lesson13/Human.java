package com.tbezdetnaya.app.homework.lesson13;

/**
 * Created by Tanya on 17.12.2016.
 */
public class Human {
    private String name;
    private int age;
    public Human(String name, int age){

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public boolean checkAge () {
       if (getAge() >= 1 && getAge() < 120){
           System.out.println("New age setted");
           return true;
       }else {
           System.out.println("Age invalid");
           return false;
       }

   }
}
