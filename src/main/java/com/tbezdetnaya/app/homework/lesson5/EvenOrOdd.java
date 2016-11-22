package com.tbezdetnaya.app.homework.lesson5;

import java.util.Scanner;

/**
 * Created by ACER PC on 18.11.2016.
 */
public class EvenOrOdd {
    private int number;

    public int getNumber() {
        return number;
    }

    public void isEvenNumberOrOddNumber() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number ");
        System.out.print("> ");

        if (sc.hasNextInt()) {
            number = sc.nextInt();

        } else {
            System.out.println("Error: invalid value");
        }
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);

    }
}
