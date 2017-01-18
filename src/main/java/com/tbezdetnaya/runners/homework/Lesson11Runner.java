package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson11.ArrayParse;
import com.tbezdetnaya.app.homework.lesson16.MenuItem;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import com.tbezdetnaya.app.homework.lesson9.ArrayUtils;

import java.util.Scanner;

/**
 * Created by Tanya on 10.12.2016.
 */
public class Lesson11Runner {

    public static void main(String[] args) {
        ArrayParse arrayParse = new ArrayParse();
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner sc = new Scanner(System.in);


        do {

            try {
                System.out.println("Welcome!This application work to strings. Enter text \"TASK[number]\" to begin the work:");
                System.out.println("1 - to create array of several numbers and sort  them descending or ascending");
                System.out.println("2 - extract from  array only alphabet  characters (large and small ones)");
                System.out.println("3 - output of specified text from different lines");
                MenuItem item = MenuItem.valueOf((sc.nextLine().toUpperCase()));
                switch (item) {

                    case TASK1:
                        Validation.checkDelemiter();
                        System.out.println("Specify a string using the numbers via delimiter or space");
                        double arr[] = arrayParse.getArray(sc.next());
                        System.out.println("Select sorting 1- ascending or 2 - descending");
                        int number = sc.nextInt();

                        if (number == 1) {
                            arrayUtils.arrayBubbleSortAscending(arr);
                        }
                        if (number == 2) {
                            arrayUtils.arrayBubbleSortDecrease(arr);
                        }
                        break;
                    case TASK2:
                        sc.useDelimiter("\n");
                        System.out.println("Specify a string using the letters and numbers via delimiter or space");
                        arrayParse.getArrayOnlyLetters(sc.next());

                        break;
                    case TASK3:
                        sc.useDelimiter("\n"); // для вывода всей строки
                        System.out.println("Specify a string using the letters and numbers via delimiter or space");
                        String str = sc.next();
                        System.out.println("Specify key word");
                        String key = sc.next();
                        arrayParse.getArrayString(str, key);
                        break;

                }

            } catch (Exception e) {
                System.out.println("Error: invalid value");
            }


        } while (Validation.needContinue());


    }
}
