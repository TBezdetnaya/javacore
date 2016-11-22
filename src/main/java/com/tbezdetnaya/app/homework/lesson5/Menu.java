package com.tbezdetnaya.app.homework.lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ACER PC on 18.11.2016.
 */
public class Menu {
    private int number;
    private boolean isInputValueCorrect = true;
    private String answer;
    private boolean isTryAgain = true;

    SideTriangle sideTriangle = new SideTriangle();
    EvenOrOdd evenOrOdd = new EvenOrOdd();
    MaxNumber maxNumber = new MaxNumber();
    CircleArea circleArea = new CircleArea();

    Scanner sc = new Scanner(System.in);

    public void startMenu() {

        while (isTryAgain == true) {
            isInputValueCorrect = false;
            while (isInputValueCorrect == false) {
                System.out.println("Welcome to the app. Choose the Menu number");
                System.out.println("-----------------------");
                System.out.println("If (1) - enter right-angled triangle program;");
                System.out.println("If (2) - define if number is even or odd;");
                System.out.println("If (3) - User enters 2 numbers from keyboard, define what number is bigger;");
                System.out.println("If (4) - enter calculate circle area program");
                System.out.print("> ");
                try {
                    number = sc.nextInt();
                    if (number == 1) {

                        sideTriangle.getNumberForTriangle();

                        if (sideTriangle.calculatorForTraingle(sideTriangle.getA(), sideTriangle.getB(), sideTriangle.getC())) {
                            System.out.println("The triangle can be built using three mentioned numbers");
                        } else {
                            System.out.println("The triangle can not be built using three mentioned numbers");
                        }

                    } else if (number == 2) {
                        evenOrOdd.isEvenNumberOrOddNumber();
                        if (evenOrOdd.isEven(evenOrOdd.getNumber())) {
                            System.out.println("Entered value is even number!");
                        } else {
                            System.out.println("Entered value is odd number!");
                        }
                    } else if (number == 3) {
                        maxNumber.getTwoNumber();
                        maxNumber.equalsNumber(maxNumber.getA(), maxNumber.getB());

                        if (maxNumber.getA() > maxNumber.getB()) {
                            System.out.println("The first number is bigger than the second number: " + maxNumber.getA() + " > " + maxNumber.getB());
                        } else {
                            System.out.println("The second number is bigger than the first number: " + maxNumber.getB() + " > " + maxNumber.getA());
                        }

                    } else if ((number == 4)) {
                        circleArea.getInputNumber();
                        System.out.println("Area is " + circleArea.calculatorCirclArea(circleArea.getRadius()));
                    }

                } catch(InputMismatchException ex){
                    System.out.println("Error: invalid value");
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
                        sc.nextLine();
                    }
                    if (answer.equals("yes")) {
                        isTryAgain = true;
                        startMenu();

                    } else {
                        isTryAgain = false;
                    }

                }


            }
        }










    }
}
