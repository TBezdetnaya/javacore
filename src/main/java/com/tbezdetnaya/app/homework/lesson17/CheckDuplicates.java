package com.tbezdetnaya.app.homework.lesson17;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Написать класс который
 считывает набор слов с клавиатуры - каждое слово разделяется новой строкой (Enter).
 Если был ввод пустой строки - программа прекращает считывание строк с клавиатуры,
 убирает дубликаты строк (если они есть) и
 сортирует список строк в алфавитном порядке, после чего
 выводит на экран список строк в столбик.
 * Created by tanya on 26.01.2017.
 */
public class CheckDuplicates {
    public void readWordConcole(String input) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> list = new TreeSet<>();
        while (true) {
             input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        for (String result : list) {
            System.out.println(result);
        }
    }
}
