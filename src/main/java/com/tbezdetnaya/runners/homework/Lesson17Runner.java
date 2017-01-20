package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson11.ArrayParse;
import com.tbezdetnaya.app.homework.lesson16.MenuItem;
import com.tbezdetnaya.app.homework.lesson17.ArraySorterGenerics;
import com.tbezdetnaya.app.homework.lesson7.Validation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tanya on 18.01.2017.
 */
public class Lesson17Runner {

    public static void main(String[] args) {
        ArrayParse arrayParse = new ArrayParse();


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! This application executes several tasks. Enter text \"TASK[number]\" to begin the work:");
        do{
            try{
                System.out.println("1 - sorts the specified arrayDouble into  decrease number");
                System.out.println("2 - sorts the specified arrayInteger into  decrease number.");
                System.out.println("3 - sorts the specified arrayFloat into decrease number");
                MenuItem item = MenuItem.valueOf((sc.next().toUpperCase()));
                switch (item){
                    case TASK1:{
                        System.out.println("Specify a string using the numbers via delimiter (,) or (;)");
                        Double[] arr = arrayParse.getArrayDouble(sc.next());
                        ArraySorterGenerics<Double> arrayDouble = new ArraySorterGenerics<>(arr);
                        arrayDouble.sort();
                        System.out.println(Arrays.toString(arrayDouble.getArr()));
                    }
                    break;
                    case TASK2:{
                        System.out.println("Specify a string using the numbers via delimiter (,) or (;)");
                        Integer[] arr = arrayParse.getArrayInt(sc.next());
                        ArraySorterGenerics<Integer> arrayInteger = new ArraySorterGenerics<>(arr);
                        arrayInteger.sort();
                        System.out.println(Arrays.toString(arrayInteger.getArr()));
                    }
                    break;
                    case TASK3:{
                        System.out.println("Specify a string using the numbers via delimiter (,) or (;)");
                        Float[] arr = arrayParse.getArrayFloet(sc.next());
                        ArraySorterGenerics<Float> arrayFloat = new ArraySorterGenerics<>(arr);
                        arrayFloat.sort();
                        System.out.println(Arrays.toString(arrayFloat.getArr()));
                    }
                    break;
                }

            }catch (Exception e){
                System.out.println("Error: invalid value");
            }

        }while (Validation.needContinue());
    }
}
