package com.tbezdetnaya.runners.homework;

import com.tbezdetnaya.app.homework.lesson9.ArrayGenerator;
import com.tbezdetnaya.app.homework.lesson9.ArrayPrint;
import com.tbezdetnaya.app.homework.lesson7.LoopArrays;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import com.tbezdetnaya.app.homework.lesson9.OperationsWithArrays;

import java.util.Scanner;

/**
 * Created by ACER PC on 03.12.2016.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        LoopArrays loopArrays = new LoopArrays();
        ArrayPrint arrayPrint = new ArrayPrint();
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        OperationsWithArrays operationsWithArrays = new OperationsWithArrays();
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
            System.out.println("8 or 9 - sorts the specified array into ascending numerical order.");
            System.out.println("10 or 11 - sorts the specified array into decrease number ");
            System.out.println("12 - selection sorts the specified array.");
            System.out.println("13 - to create a two-dimensional array from a segment [-99; 99].");
            System.out.println(">");

            switch (sc.nextInt()) {
                case 1:
                    loopArrays.showDimentionalArray();
                    break;
                case 2:
                    loopArrays.sortDimentionalArray();
                    break;
                case 3:
                    loopArrays.arrayEvenNumbers();
                    break;
                case 4:
                    loopArrays.arrayMinMaxNumbers();
                    break;
                case 5:
                    loopArrays.sortMultiDimentionalArray();
                    break;
                case 6:
                    loopArrays.sortMultiDimentionalArrayNew();
                    break;
                case 7:
                    loopArrays.sumOfNumbers();
                    break;
                case 8: {
                    int[] arr = arrayGenerator.createRandomArray();
                    arrayPrint.printArray(arr);
                    int[] arr2 = operationsWithArrays.arraySortAscending(arr);
                    arrayPrint.printArray(arr2);
                }
                break;
                case 9: {
                    int[] arr = arrayGenerator.createRandomArray();
                    arrayPrint.printArray(arr);
                    int[] arr2 = operationsWithArrays.sortArrayAscending(arr);
                    arrayPrint.printResultSortArrayAscending(arr2);
                }
                break;

                case 10: {
                    Integer[] arr = arrayGenerator.creatIntegerRandomArray();
                    arrayPrint.printIntegerArray(arr);
                    Integer[] arr2 = operationsWithArrays.sortIntegerArrayDecrease(arr);
                    arrayPrint.printResultSortIntegerArrayDecrease(arr2);
                }
                break;
                case 11: {
                    int[] arr = arrayGenerator.createRandomArray();
                    arrayPrint.printArray(arr);
                    int[] arr2 = operationsWithArrays.arraySortDecrease(arr);
                    arrayPrint.printArray(arr2);
                }
                break;
                case 12: {
                    int[] arr = arrayGenerator.createRandomArray();
                    arrayPrint.printArray(arr);
                    int[] arr2 = operationsWithArrays.selectionSortArray(arr);
                    arrayPrint.printArray(arr2);
                }
                break;
                case 13: {
                    int[][] arr = arrayGenerator.createMultiDimentionalArray();
                    arrayPrint.printMultiDimentionalArray(arr);
                    int max = operationsWithArrays.searchMaxNumberArray(arr);
                    arrayPrint.printResultSearchMaxNumberArray(max);
                }
                break;
                default:
                    System.out.println("Error: invalid value");

            }
        } while (Validation.needContinue());


    }
}
