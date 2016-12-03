package com.tbezdetnaya.app.classWork.lesson9;
import java.util.Arrays;

public class PracticSortArray {
    public static void main(String[] args) {

        // Bubble
        boolean flag = true;
        int count;

        int [] array = new int [20];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        while (flag ){
            flag = false;
            for (int j = 0; j <array.length - 1 ; j++) {
                if (array[j] > array [j + 1]){
                    count = array[j];
                    array[j] = array[j + 1];
                    array [j + 1]= count;
                    flag = true;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        array();
        sortArray();






    }

    public static void array (){
        int [] array = {50, 100,500, 2};
        bubbleSort(array);

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

    public static void bubbleSort (int [] array){

        int temp;
        int n = array.length;
        for (int i = 0; i < n; i ++){
            for (int j = 1; j < (n-i); j++){
                if (array [j - 1]> array[j]){
                    temp = array [j-1];
                    array [j-1] = array[j];
                    array[j] = temp;
                }
            }
        }


    }

    public static void sortArray (){
        int [] someArray = {344, 76, 66, 5454, 4};
        Arrays.sort(someArray);
        System.out.println("Sorted aaray: " + Arrays.toString(someArray));

    }
}
