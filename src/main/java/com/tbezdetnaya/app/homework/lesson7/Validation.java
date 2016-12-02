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
        boolean res = false;
        String answer = null;


        do {
            isInputValueCorrect = false;
            System.out.println("-----------------------");
            System.out.println("Exit the program? (yes/no)");
            System.out.print("> ");

            if (sc.hasNext()) {
                answer = sc.next();
                if (answer.equals("yes") || answer.equals("no")) {
                    isInputValueCorrect = true;
                } else {
                    System.out.println("Error: invalid value");
                }
            }
            if (answer.equals("no")) {
                sc.nextLine();
                res = true;
            }
        } while (!isInputValueCorrect);
        return res;
    }

}



