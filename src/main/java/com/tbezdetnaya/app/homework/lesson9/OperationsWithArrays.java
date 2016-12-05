package com.tbezdetnaya.app.homework.lesson9;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Tanya on 03.12.2016.
 */
public class OperationsWithArrays {
    public Integer[] arraySortAscending(Integer[] sourceArr) {
        Integer[] arr = sourceArr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        } return arr;
    }

    public Integer[] arraySortDecrease(Integer[] sourceArr) {
        Integer[] arr = sourceArr.clone();
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

    public Integer[] selectionSortArray(Integer[] sourseArr) {
        Integer[]arr = sourseArr.clone();
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

    public int searchMaxNumberArray(int[][] sourseArr) {
        int[][] arr = sourseArr.clone();
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;

    }

    // сортировка средствами Java

    public Integer[]sortArrayAscending(Integer[] sourceArr) {
        Integer[] arr = sourceArr.clone();
        Arrays.sort(arr);
        return arr;
    }

    public Integer[] sortIntegerArrayDecrease(Integer[] sourceArr) {
        Integer arr[] = sourceArr.clone();
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

}
