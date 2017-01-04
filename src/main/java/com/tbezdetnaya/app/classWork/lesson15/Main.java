package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car bmw = new BMW();
        Car audi = new Audi();
        printEmissions(bmw);
        printEmissions(audi);



    }
    public static void printEmissions (Car car){
        car.drive();
    }
}
