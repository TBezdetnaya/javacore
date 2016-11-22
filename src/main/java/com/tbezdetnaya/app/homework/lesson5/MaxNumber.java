package com.tbezdetnaya.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by ACER PC on 18.11.2016.
 */
public class MaxNumber {
    private double a;
    private double b;


    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }

    public void getTwoNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number ");
        System.out.print("> ");

        if (sc.hasNextInt()) {
            a = sc.nextDouble();
        } else {
            System.out.println("Error: invalid value ");
            return;
        }

        System.out.println("Please enter second number ");
        System.out.print("> ");

        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        } else {
            System.out.println("Error: invalid value ");
            return;
        }
    }

    public double equalsNumber(double a, double b) {
        return (Math.max(a,b));



    }
}
