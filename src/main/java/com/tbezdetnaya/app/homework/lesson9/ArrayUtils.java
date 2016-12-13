package com.tbezdetnaya.app.homework.lesson9;
import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Tanya on 03.12.2016.
 */
public class ArrayUtils {
    public double[] arrayBubbleSortAscending(double[] sourceArr) {
        double[] arr = sourceArr.clone();
        System.out.println("Source array" + Arrays.toString(arr) + "\n" + "will be sorted using bubble sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }
        System.out.println("Sorted array:" + Arrays.toString(arr));
        return arr;
    }

    public double[] arrayBubbleSortDecrease(double[] sourceArr) {
        double[] arr = sourceArr.clone();
        System.out.println("Source array" + Arrays.toString(arr) + "\n" + "will be sorted using bubble sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array:" + Arrays.toString(arr));
        return arr;
    }

    public double[] selectionSortArray(double[] sourseArr) {
        double[] arr = sourseArr.clone();
        System.out.println("Source array" + Arrays.toString(arr)+ "\n" + "will be sorted using selection sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    double temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted array:" + Arrays.toString(arr));
        return arr;
    }

    public int searchMaxNumberArray(int[][] sourseArr) {
        int[][] arr = sourseArr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);

            }
            System.out.println();
        }
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max number is: " + max);
        return max;

    }
    public int countArray (int[][] sourseArr){
        int countArray = 0;
        int[][] arr = sourseArr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                countArray++;
            }
        }
        System.out.println(countArray);
        return countArray;
    }

    // сортировка средствами Java

    public Integer[] sortArrayAscending(Integer[] sourceArr) {
        Integer[] arr = sourceArr.clone();
        Arrays.sort(arr);
        return arr;
    }

    public Integer[] sortArrayDecrease(Integer[] sourceArr) {
        Integer arr[] = sourceArr.clone();
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }



}
