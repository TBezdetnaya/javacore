package com.tbezdetnaya.app.homework.lesson9;
import java.util.Arrays;

public class ArrayPrint {
   private OperationsWithArrays operationsWithArrays = new OperationsWithArrays();

    public  void printResultSortArrayAscend(){


        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        arr = operationsWithArrays.arraySortAscending(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();
    }
    public  void printResultSortArrayDecrease(){

        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        arr = operationsWithArrays.arraySortDecrease(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();
    }
    public void printResultSelectionSortArray(){
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        arr = operationsWithArrays.selectionSortArray(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();

    }

    public void printResultArraySortAscending(){
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("Sorted array:" + Arrays.toString(operationsWithArrays.sortArrayAscend(arr)));

    }
    public void printResultArraySortDecrease() {
        Integer arr[] = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array:" + Arrays.toString(operationsWithArrays.sortArrayDecrease(arr)));
    }

    /**
     * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
     * Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

     */

    public void printMultiDimentionalArray(){
        int arr [][] = new int[5][8];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = (int)(Math.random()*99) - 99;
                System.out.printf("%4d",arr[i][j]);

            }
            System.out.println();
        }
        System.out.println("Max number is: " + operationsWithArrays.searchMaxNumberArray(arr));
    }
}
