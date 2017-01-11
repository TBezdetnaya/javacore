package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 29.12.2016.
 */
public abstract class Car {
    public String name = "Car";

    public Car(String name) {
        this.name = name;
    }

    protected int openDoors (){
        return 3;
    }
    abstract void  drive();

}
