package com.tbezdetnaya.app.homework.lesson7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Tanya on 26.11.2016.
 */
public class LoopArrays {
    private int a = 0;
    /**
     * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
     * отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
     * Перед созданием массива подумайте, какого он будет размера.
     */
    public void task01(){

        for (int i = 2; i < 22 ; i+=2) {
            a++;
        }
        int [] array = new int[a];
        for (int i = 2,  b = 0; i < 22 ; i+=2){
            array[b]= i;

            System.out.print(array[b] + " ");
        }
        System.out.println();
        for (int i = 2, b = 0; i < 22 ; i+=2){
            array[b]= i;
            System.out.println(array[b] + " ");
        }


    }

    public void task02(){
        /**
         * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
         * а затем этот же массив выведите на экран в другую строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
         */

        for (int i = 1; i <= 99 ; i++) {
            if (i % 2 != 0){
                a++;
            }
        }
        int[] array = new int[a];
        for (int i = 0, b = 0; i <= 99 ; i++) {
            if (i % 2 != 0){
                array[b] = i;
                System.out.print(array[b]+ " ");
                b++;
            }
        }
        System.out.println();
        for (int i = array.length -1; i >= 0; --i) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }

    /**
     * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
     * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
     */

    public void task03(){
        int [] array = new int [15];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i]>0 & array[i] % 2==0)a++;


        }
        System.out.println();
        System.out.println("Всего в массиве " + a + " четных элементов" );

    }

    /**
     * Создайте массив из 15 случайных целых чисел из отрезка [0;999].
     * Выведите массив на экран. Выведите минимальное и максимальное значение элементов массива
     */
    public void task04(){
        int [] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()* 1000);
            System.out.print(array[i] + " ");

        }


        System.out.println();
        int[] res = searchMinMaxNumber( array );
        System.out.println("Минимальное число:  " + res[0]);
        System.out.println("Максимальное число: " + res[1]);

    }
    public int [] searchMinMaxNumber(int [] array){
        int min = array [0];
        int max = array [0];
        int[] result = new int[2];
        result [0] = min;
        result [1] = max;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        result [0] = min;
        result[1] = max;
        return result;
    }

    /**
     * Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
     */
    public void task05(){
        int [][] array = new int [8][5];
        int min = 10;
        int max = 99;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array [i].length; j++){
                array [i][j] = (int)(Math.random() * (max - min + 1) + min);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [1;999].
     * Вывести массив на экран в виде матрицы, где в каждом столбце числа должны быть выравнены по правому краю столбца
     */


    public void task06(){
        int[][] array = new int[8][5];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 1000);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

    }

    /**
     * Запросить у пользователя ввести ряд чисел c вводом по одному через Enter (запрашиваем число - ввел число - Enter - запрашиваем следующее).
     * Ввод должен прерываться словом “exit”, о чем нужно сообщить пользователю. После этого вывести сумму всех введенных пользователем чисел.
     */
    // реализовано без массива
    // public void task07(){

    //    int sum = 0;
    //    do{
    //         sum = sum + Validation.getInt();
    //    }
    //    while (Validation.needContinue());
    //   System.out.println(sum);
    //}
    public void task7(){
        Scanner sc = new Scanner(System.in);
        boolean isInputValueCorrect;
        String answer;
        int sum = 0;

        System.out.println("Укажите ряд чисел через энтер, по завершению указать Exit");
        System.out.print("> ");

        do {
            isInputValueCorrect = false;

            if (sc.hasNext()) {
                answer = sc.next();
                try {
                    if (answer.equals("Exit")) {
                        isInputValueCorrect = true;
                    } else {
                        int number = Integer.parseInt(answer);
                        ArrayList arrayList = new ArrayList();

                        arrayList.add(number);
                        sum = sum + number;
                    }

                } catch (Exception e) {
                    System.out.println("Error: invalid value");
                }
            }
        } while (!isInputValueCorrect);

        System.out.println(sum);

    }
}
