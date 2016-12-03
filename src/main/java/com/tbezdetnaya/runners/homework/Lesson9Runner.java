package com.tbezdetnaya.runners.homework;

import com.tbezdetnaya.app.homework.lesson7.LoopArrays;
import com.tbezdetnaya.app.homework.lesson7.Validation;

import java.util.Scanner;

/**
 * Created by ACER PC on 03.12.2016.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        LoopArrays loopArrays = new LoopArrays();
        Scanner sc = new Scanner(System.in);
        try{
            do{
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
                try{
                    switch (sc.nextInt()){
                        case  1: loopArrays.showDimentionalArray();
                            break;
                        case 2: loopArrays.sortDimentionalArray();
                            break;
                        case  3: loopArrays.arrayEvenNumbers();
                            break;
                        case 4: loopArrays.arrayMinMaxNumbers();
                            break;
                        case 5: loopArrays.sortMultiDimentionalArray();
                            break;
                        case 6: loopArrays.sortMultiDimentionalArrayNew();
                            break;
                        case 7: loopArrays.sumOfumbers();
                            break;

                    }

                }catch (Exception e){
                    System.out.println("Error: invalide value");
                }
            }while (Validation.needContinue());

        }catch (Exception e){
            System.out.println("Error: invalide value");
        }

    }
}
