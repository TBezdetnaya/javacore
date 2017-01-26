package com.tbezdetnaya.app.homework.lesson17;

import java.util.Scanner;
import java.util.TreeSet;

/**
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
