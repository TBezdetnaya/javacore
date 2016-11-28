package com.tbezdetnaya.app.homework.lesson7;
import java.util.Scanner;

public class Validation {

    public static int getInt() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number");
        System.out.print("> ");
        return sc.nextInt();

    }

    public static boolean needContinue(){
        Scanner sc = new Scanner(System.in);
        boolean isInputValueCorrect;
        String answer = null;
        boolean res = false;


        do {
            isInputValueCorrect = false;
            System.out.println("-----------------------");
            System.out.println("Exit? (yes/no)");
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
