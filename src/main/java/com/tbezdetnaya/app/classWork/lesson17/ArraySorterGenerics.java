package com.tbezdetnaya.app.classWork.lesson17;

import java.util.Arrays;

/**
 * Created by ACER PC on 17.01.2017.
 */
public class ArraySorterGenerics<T> {

    public <U extends Comparable<U>> U[] arrayBubbleSortAscending(U[] arr) {
        U temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if ( arr[j + 1].compareTo(arr[j])>0) {
                     temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        // System.out.println("Sorted array:" + Arrays.toString(arr));
        return arr;
    }


}


