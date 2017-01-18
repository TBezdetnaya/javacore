package com.tbezdetnaya.app.classWork.lesson17;

import java.util.Arrays;

/**
 * Created by ACER PC on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        Integer[] arrayInteger = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49};
        Float[] arrF = {2f, 10f, 72f, 2f, 9f, 40f, 48f, 5f, 5f, 49f };
        Double[] arrD = {34.0, 45.6, 4.6, 7.0, 56.7};
        ArraySorterGenerics <Integer> arrInt = new ArraySorterGenerics<>(arrayInteger);
        ArraySorterGenerics <Float> arrFloat = new ArraySorterGenerics<>(arrF);
        ArraySorterGenerics <Double> arrDouble = new ArraySorterGenerics<>(arrD);


        System.out.println(Arrays.toString(arrInt.arrayBubbleSortAscending(arrayInteger)));
        System.out.println(Arrays.toString(arrFloat.arrayBubbleSortAscending(arrF)));
        System.out.println(Arrays.toString(arrDouble.arrayBubbleSortAscending(arrD)));



        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));

        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");

        System.out.println(value2);
        BoxPrinter<Double> value3 = new BoxPrinter<>(new Double(33));
        System.out.println(value3);


      // Here we fixed it

        String intValue2 = value2.getValue();

    }
}
