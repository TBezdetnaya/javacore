package com.tbezdetnaya.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by ACER PC on 18.11.2016.
 */
public class CircleArea {
    private Scanner sc = new Scanner(System.in);
    private double radius;

    public double getRadius (){
        return radius;
    }


    public  void getInputNumber() {

        System.out.println("Please enter circle radius");
        System.out.print("> ");

        if (sc.hasNextDouble()) {
            radius = sc.nextDouble();
        } else {
            System.out.println("Error: invalid value");

        }
    }

    public double calculatorCirclArea(double radius){

        double circleArea = Math.pow(radius, 2) * Math.PI;
        return circleArea;


    }
}
