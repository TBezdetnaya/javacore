package com.tbezdetnaya.app.homework.lesson9;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Tanya on 03.12.2016.
 */
public class BubbleSort {
    public  int[] arraySortAscend (int [] sourceArr) {
        int[] arr = sourceArr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        return arr;
    }

    public  int[] arraySortDecrease (int [] sourceArr) {
        int[] arr = sourceArr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        return arr;
    }
    public  int[] selectionSortArray(int []sourseArr){
        int[] arr = sourseArr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;


                }

            }
        }
        return arr;
    }

    // сортировка средствами Java

    public int[] sortArrayAscend (int [] sourceArr){
        int [] arr = sourceArr.clone();
        Arrays.sort(arr);
        return arr;

    }
    public  Integer[] sortArrayDecrease (Integer [] sourceArr){
        Integer arr [] = sourceArr.clone();
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

}
