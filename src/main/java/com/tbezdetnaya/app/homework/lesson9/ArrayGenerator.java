package com.tbezdetnaya.app.homework.lesson9;

/**
 * Created by tanya on 05.12.2016.
 */
public class ArrayGenerator {

    public int[][] createMultiDimentionalArray(){
        int arr[][] = new int[5][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 199) - 99;
            }
        }
        return arr;
    }
    public Integer[] creatRandomArray (){
        Integer arr[] = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

}
