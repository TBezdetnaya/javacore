package com.tbezdetnaya.app.classWork.lesson7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ACER PC on 25.11.2016.
 */
public class PracticLoop {
    public static void main(String[] args) {

        int count = 0;

       for (int i = 0; i <= 20; i+=2 ) {

           count ++;
       }
        System.out.println(count);

       Scanner sc = new Scanner(System.in);


        int [] array = new int[3];
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();

        }


        int[]intArray = {1,2,3,};
        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(intArray[i]);

        }
        double[]doublesArray = {1,2,3,};
        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(doublesArray[i]);

        }

        long []longArray = {1,2,3,};
        for (int i = 0; i <longArray.length ; i++) {
            System.out.println(longArray[i]);

        }
        char []charArray = {'d','f','c',};
        for (int i = 0; i <intArray.length ; i++) {
            System.out.println(charArray[i]);

        }

        int[]intArray2 = {1,2,3,};
        for (int arrElement: intArray2){
            System.out.println(arrElement);
        }

        int [] intArray3 = {1,2,3};
        System.out.println(Arrays.toString(intArray3));

        

    }


}
