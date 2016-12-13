package com.tbezdetnaya.app.homework.lesson7;
import java.util.Scanner;

public class Validation {
    private static Scanner sc = new Scanner(System.in);

    public static int getInt() {


        System.out.println("Input number");
        System.out.print("> ");
        return sc.nextInt();

    }

    public static boolean needContinue() {
        boolean isInputValueCorrect;
        String answer;
        boolean res = false;
        do {
            isInputValueCorrect = false;
            System.out.println("\n" + "-----------------------");
            System.out.println("Exit the program? (yes/no)");
            System.out.println("> ");

            answer = sc.next();
            if (answer.equals("yes") || answer.equals("no")) {
                isInputValueCorrect = true;
            } else {
                System.out.println("Error: invalid value");

            }

            if (answer.equals("no")) {
                sc.nextLine();
                res = true;
            }

        } while (!isInputValueCorrect);
        return res;
    }

    public static boolean checkDelemiter(){
        String operator;
        boolean isInputValueCorrect;
        do {
            isInputValueCorrect = false;
            System.out.println("Specify separator:");
            System.out.print("> ");
            operator = sc.next();
            if(operator.equals(",")||operator.equals(";")){
                isInputValueCorrect = true;
            }else{
                System.out.println("ERROR. Incorrect input value for delimiter.");
            }

        }while (!isInputValueCorrect);
         return isInputValueCorrect;

    }


}



