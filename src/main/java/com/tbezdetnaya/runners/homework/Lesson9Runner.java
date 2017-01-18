package com.tbezdetnaya.runners.homework;

import com.tbezdetnaya.app.homework.lesson16.MenuItem;
import com.tbezdetnaya.app.homework.lesson9.ArrayGenerator;
import com.tbezdetnaya.app.homework.lesson7.LoopArrays;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import com.tbezdetnaya.app.homework.lesson9.ArrayUtils;

import java.util.Scanner;

/**
 * Created by ACER PC on 03.12.2016.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        LoopArrays loopArrays = new LoopArrays();
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        ArrayUtils operationsWithArrays = new ArrayUtils();
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Welcome! This application executes several tasks. Enter a number to begin the work:");
            System.out.println("----------------------------------------------------");
            System.out.println(" Enter 1 - to create an array with all even numbers from 2 to 20");
            System.out.println("2 - to create an array with all not even numbers from 1 to 99");
            System.out.println("3 - to create an array with 15 random  numbers from a segment [0;9]");
            System.out.println("4 - to create an array with 15 random  numbers from a segment[0;999]");
            System.out.println("5 - to create a two-dimensional array with 8 lines for 5 columns from random whole numbers from a segment[10;99]");
            System.out.println("6 - to create a two-dimensional array with 8 lines for 5 columns from random whole numbers from a segment[1;999]");
            System.out.println("7 - to execute a task №7");
            System.out.println("8  - sorts the specified array into ascending numerical order.");
            System.out.println("9 - sorts the specified array into decrease number ");
            System.out.println("10 - selection sorts the specified array.");
            System.out.println("11 - to create a two-dimensional array from a segment [-99; 99].");
            System.out.println(">");
            MenuItem item = MenuItem.valueOf((sc.nextLine().toUpperCase()));
            switch (item) {
                case TASK1:
                    loopArrays.showDimentionalArray();
                    break;
                case TASK2:
                    loopArrays.sortDimentionalArray();
                    break;
                case TASK3:
                    loopArrays.arrayEvenNumbers();
                    break;
                case TASK4:
                    loopArrays.arrayMinMaxNumbers();
                    break;
                case TASK5:
                    loopArrays.sortMultiDimentionalArray();
                    break;
                case TASK6:
                    loopArrays.sortMultiDimentionalArrayNew();
                    break;
                case TASK7:
                    loopArrays.sumOfNumbers();
                    break;

                case TASK8: {
                    double[] arr = arrayGenerator.createArray();
                    operationsWithArrays.arrayBubbleSortAscending(arr);
                }
                break;

                case TASK9: {
                    double[] arr = arrayGenerator.createArray();
                    operationsWithArrays.arrayBubbleSortDecrease(arr);
                }
                break;
                case TASK10: {
                    double[] arr = arrayGenerator.createArray();
                    operationsWithArrays.selectionSortArray(arr);
                }
                break;

                case TASK11: {
                    int[][] arr = arrayGenerator.createMultiDimentionalArray();
                    operationsWithArrays.searchMaxNumberArray(arr);
                }

                break;
                default:
                    System.out.println("Error: invalid value");

            }
        } while (Validation.needContinue());


    }
}
