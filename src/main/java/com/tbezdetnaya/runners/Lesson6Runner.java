package com.tbezdetnaya.runners;

import com.tbezdetnaya.app.homework.lesson6.Calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * переделанное домашнее задание по уроку 5
 */
public class Lesson6Runner {
    public static void main(String[] args) {
        boolean isInputValueCorrect;
        boolean isTryAgain = true;
        String answer = null;
        Calculation calculation = new Calculation();

        Scanner sc = new Scanner(System.in);
        while (isTryAgain == true) {
            try {
                System.out.println("Welcome to the app. Choose the Menu number");
                System.out.println("-----------------------");
                System.out.println("If (1) - enter right-angled triangle program;");
                System.out.println("If (2) - define if number is even or odd;");
                System.out.println("If (3) - user enters 2 numbers from keyboard, define what number is bigger;");
                System.out.println("If (4) - enter calculate circle area program");
                System.out.print("> ");
                int inputData = sc.nextInt();
                isInputValueCorrect = false;
                while (isInputValueCorrect == false) {
                    try{
                        switch (inputData) {
                            case 1:
                                System.out.println("Input first number");
                                double a = sc.nextDouble();
                                System.out.println("Input second number");
                                double b = sc.nextDouble();
                                System.out.println("Input last number");
                                double c = sc.nextDouble();
                                System.out.println(calculation.angledTriangle(a, b, c));
                                break;
                            case 2:
                                System.out.println("Input number");
                                a = sc.nextDouble();
                                System.out.println(calculation.isEvenOrOdd(a));
                                break;
                            case 3:
                                System.out.println("Input first number");
                                a = sc.nextDouble();
                                System.out.println("Input second number");
                                b = sc.nextDouble();
                                System.out.println(calculation.equalsNumber(a, b));
                                break;
                            case 4:
                                System.out.println("Input radius");
                                double radius = sc.nextDouble();
                                System.out.println(calculation.calculatorCirclArea(radius));
                                break;
                        }
                    }catch(InputMismatchException exception){
                        System.out.println("Error: invalid value");
                        System.out.println("-----------------------");
                        sc.next();
                    }

                    isInputValueCorrect = false;
                    while (isInputValueCorrect == false) {
                        System.out.println("-----------------------");
                        System.out.println("Back to the menu? (yes/no)");
                        System.out.print("> ");

                        if (sc.hasNext()) {
                            answer = sc.next();
                            if (answer.equals("yes") || answer.equals("no")) {
                                isInputValueCorrect = true;
                            } else {
                                isInputValueCorrect = false;
                                System.out.println("Error: invalid value");
                                System.out.println("-----------------------");
                            }
                        } else {
                            sc.next();
                        }
                        if (answer.equals("yes")) {
                            isTryAgain = true;
                        } else {
                            isTryAgain = false;
                        }
                    }
                }
            }catch(InputMismatchException exception){
                System.out.println("Error: invalid value");
                System.out.println("-----------------------");
                sc.next();
            }
        }
    }
}
