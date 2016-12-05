package com.tbezdetnaya.app.homework.lesson9;

import java.util.Arrays;

public class ArrayPrint {

    public  void printArray ( int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();
    }
    public void printMultiDimentionalArray(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);

            }
            System.out.println();
        }

    }
    public void printResultSearchMaxNumberArray(int max){
        System.out.println("Max number is: " + max);
    }

    public void printResultSortArrayAscending(int [] arr){
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }
    public  void printIntegerArray ( Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();
    }

    public void printResultSortIntegerArrayDecrease ( Integer [] arr){
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }






}
