package com.tbezdetnaya.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by ACER PC on 18.11.2016.
 */
public class SideTriangle {
    private int a;
    private int b;
    private int c;

    public int getA (){
        return a;
    }
    public int getB (){
        return b;
    }
    public int getC (){
        return c;
    }


    public void getNumberForTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        System.out.print("> ");

        if (sc.hasNextInt()) {
            a = sc.nextInt();

        } else {
            System.out.println("Error: invalid value");
            return;
        }

        System.out.println("Please enter second number ");
        System.out.print("> ");

        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Error: invalid value");
            return;
        }

        System.out.println("Please enter last number ");
        System.out.print("> ");
        if (sc.hasNextInt()) {
            c = sc.nextInt();
        } else {
            System.out.println("Error: invalid value");
            return;
        }

    }


    public boolean calculatorForTraingle(int a, int b, int c) {
        a *= a;
        b *= b;
        c *= c;
        return ((a + b == c) || (b + c == a) || (c + a == b));



    }
}
