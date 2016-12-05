package com.tbezdetnaya.app.homework.lesson9;
import com.tbezdetnaya.app.homework.lesson9.BubbleSort;
import java.util.Arrays;

public class ArrayPrint {
   private BubbleSort bubbleSort = new BubbleSort();

    public  void printResultSortArrayAscend(){


        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        arr = bubbleSort.arraySortAscend(arr);
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
        arr = bubbleSort.arraySortDecrease(arr);
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
        arr = bubbleSort.selectionSortArray(arr);
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }
        System.out.println();

    }

    public void printResultArraySortAscend(){
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("Sorted array:" + Arrays.toString(bubbleSort.sortArrayAscend(arr)));

    }
    public void printResultArraySortDecrease() {
        Integer arr[] = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array:" + Arrays.toString(bubbleSort.sortArrayDecrease(arr)));
    }


}
