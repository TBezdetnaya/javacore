package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson10.PalindrameSearch;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import java.util.Scanner;

/**
 * Created by tanya on 08.12.2016.
 */
public class Lesson10Runner {
    public static void main(String[] args) {
        PalindrameSearch palindrameSearch = new PalindrameSearch();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome! This application checks the line to palindrome. Enter a number to begin the work:");
            try {
                switch (sc.nextInt()) {
                    case 1:

                        System.out.println("Input some string");
                        palindrameSearch.isPalindromeEven(sc.next());
                        break;
                    case 2:
                        System.out.println("Input some string");
                        palindrameSearch.isPalindromeEvenOdd(sc.next());
                        break;
                    case 3:
                        System.out.println("Input some string");
                      palindrameSearch.isPalindromeReverseString(sc.next());
                        break;
                    case 4:
                        System.out.println("Input some string");
                        palindrameSearch.isPalindrameArray(sc.next());
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: invalid value");
            }

        } while (Validation.needContinue());


    }
}