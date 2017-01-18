package com.tbezdetnaya.app.classWork.lesson17;



/**
 * Created by ACER PC on 17.01.2017.
 */
public class ArraySorterGenerics<U extends Number> {
    private U []arr;
    public ArraySorterGenerics(U[]arr) {
        this.arr = arr;

    }

    public <U extends Comparable  > U[] arrayBubbleSortAscending(U[] arr) {
        U temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if ( arr[j + 1].compareTo(arr[j])<0) {
                     temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        return arr;
    }



}


