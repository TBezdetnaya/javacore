package com.tbezdetnaya.runners.homework;

import com.tbezdetnaya.app.homework.lesson9.ArrayPrint;
import com.tbezdetnaya.app.homework.lesson7.LoopArrays;
import com.tbezdetnaya.app.homework.lesson7.Validation;

import java.util.Scanner;

/**
 * Created by ACER PC on 03.12.2016.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        LoopArrays loopArrays = new LoopArrays();
        ArrayPrint arrayPrint = new ArrayPrint();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Привет! данное приложение выполняет несколько задач, выбирете число");
            System.out.println("----------------------------------------------------");
            System.out.println("1 - для cоздания массива из всех чётных чисел от 2 до 20");
            System.out.println("2 - для создания из всех не чётных чисел от 1 до 99");
            System.out.println("3 - для создания массива из 15 случайных целых чисел из отрезка [0;9]");
            System.out.println("4 - для создания массива из 15 случайных целых чисел из отрезка [0;999]");
            System.out.println("5 - для вывода двумерного массива из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]");
            System.out.println("6 - для вывода двумерного массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [1;999]");
            System.out.println("7 - для выполнения задачи №7");
            System.out.println("8 или 9 - для сортировки массива из случайных чисел по возростанию.");
            System.out.println("10 или 11 - для сортировки массива из случыйных чисел по убыванию.");
            System.out.println("12 - для сортировки выбором, массива из случайных чисел.");
            System.out.println(">");

            switch (sc.nextInt()) {
                case 1: loopArrays.showDimentionalArray();
                    break;
                case 2: loopArrays.sortDimentionalArray();
                    break;
                case 3: loopArrays.arrayEvenNumbers();
                    break;
                case 4: loopArrays.arrayMinMaxNumbers();
                    break;
                case 5: loopArrays.sortMultiDimentionalArray();
                    break;
                case 6: loopArrays.sortMultiDimentionalArrayNew();
                    break;
                case 7: loopArrays.sumOfumbers();
                    break;
                case 8: arrayPrint.printResultSortArrayAscend();
                    break;
                case 9: arrayPrint.printResultArraySortAscend();
                    break;
                case 10: arrayPrint.printResultArraySortDecrease();
                    break;
                case 11: arrayPrint.printResultSortArrayDecrease();
                    break;
                case 12: arrayPrint.printResultSelectionSortArray();
                    break;
                default:
                    System.out.println("Error: invalid value");

            }
        } while (Validation.needContinue());



    }
}
