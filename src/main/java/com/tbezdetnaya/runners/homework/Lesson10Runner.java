package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson10.PalindrameSearch;
import com.tbezdetnaya.app.homework.lesson16.MenuItem;
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
            try {
                System.out.println("Welcome! This application checks the line to palindrome. Enter text \"TASK[number]\" to begin the work:");
                MenuItem item = MenuItem.valueOf((sc.nextLine().toUpperCase()));
                switch (item) {

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

            } catch (Exception e) {
                System.out.println("Error: invalid value");
            }

        } while (Validation.needContinue());

    }
}
