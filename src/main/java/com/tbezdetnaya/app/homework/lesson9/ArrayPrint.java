package com.tbezdetnaya.app.homework.lesson9;
import java.util.Arrays;

public class ArrayPrint {
    public void printMultiDimentionalArray(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);

            }
            System.out.println();
        }

    }
    public  void printArray ( Integer[] arr) {

        System.out.println("Source array" + Arrays.toString(arr));
    }

    public void printResultSearchMaxNumberArray(int max){
        System.out.println("Max number is: " + max);
    }

    public void printResultSortArray(Integer[] arr){
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }









}
