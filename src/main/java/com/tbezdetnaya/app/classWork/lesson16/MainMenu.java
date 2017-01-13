package com.tbezdetnaya.app.classWork.lesson16;

import com.tbezdetnaya.app.homework.lesson10.PalindrameSearch;
import com.tbezdetnaya.app.homework.lesson7.Validation;

import java.util.Scanner;

/**
 * Created by ACER PC on 13.01.2017.
 */
public class MainMenu {

    public static void main(String[] args) {

        PalindrameSearch palindrameSearch = new PalindrameSearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! This application checks the line to palindrome. Enter a number to begin the work:");


        do {

            try {
                Lesson16Enum lesson16Enum = Lesson16Enum.valueOf(sc.nextLine().toUpperCase());
                switch (lesson16Enum) {
                    case TASK1:
                        System.out.println("Type a string");
                        palindrameSearch.isPalindromeEven(sc.next());
                        break;

                    case TASK2:
                        System.out.println("Type a string");
                        palindrameSearch.isPalindromeEvenOdd(sc.next());
                        break;
                    case TASK3:
                        System.out.println("Type a string");
                        palindrameSearch.isPalindromeReverseString(sc.next());
                        break;
                    case TASK4:
                        System.out.println("Type a few words separated by commas");
                        palindrameSearch.isPalindrameArray(sc.next());
                        break;
                    case TASK5:
                        sc.useDelimiter("\n"); //установим разделителем символ перехода на новую строку
                        System.out.println("Type a few words separated by commas");
                        palindrameSearch.isPalindrameArrayString(sc.next());
                        break;

                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: invalid value");
            }

        } while (Validation.needContinue());

    }
}
