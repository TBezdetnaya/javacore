package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson7.LoopArrays;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Tanya on 26.11.2016.
 */
public class LoopArraysRunner {
    public static void main(String[] args) {
        LoopArrays loopArrays = new LoopArrays();
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.println("Привет! данное приложение выполняет несколько задач");
                System.out.println("----------------------------------------------------");
                System.out.println("Нажмите 1 - для cоздания массива из всех чётных чисел от 2 до 20");
                System.out.println("Нажмите 2 - для создания из всех не чётных чисел от 1 до 99");
                System.out.println("Нажмите 3 - для создания массива из 15 случайных целых чисел из отрезка [0;9]");
                System.out.println("Нажмите 4 - для создания массива из 15 случайных целых чисел из отрезка [0;999]");
                System.out.println("Нажмите 5 - для вывода двумерного массива из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]");
                System.out.println("Нажмите 6 - для вывода двумерного массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [1;999]");
                System.out.println("Нажмите 7 - для выполнения задачи №7");
                System.out.println(">");

                try {
                    int number = sc.nextInt();
                    if (number == 1) {
                        loopArrays.showDimentionalArray();
                    }
                    if (number == 2) {
                        loopArrays.sortDimentionalArray();
                    }
                    if (number == 3) {
                        loopArrays.arrayEvenNumbers();
                    }
                    if (number == 4) {
                        loopArrays.arrayMinMaxNumbers();
                    }
                    if (number == 5) {
                        loopArrays.sortMultiDimentionalArray();
                    }
                    if (number == 6) {
                        loopArrays.sortMultiDimentionalArrayNew();
                    }
                    if (number == 7) {
                        loopArrays.sumOfNumbers();
                    }
                } catch (InputMismatchException exception) {
                    System.out.println("Error: invalid value");
                    System.out.println("-----------------------");
                }
            }
            while (Validation.needContinue());
        } catch (InputMismatchException exception) {
            System.out.println("Error: invalid value");
            System.out.println("-----------------------");
        }

    }
}











