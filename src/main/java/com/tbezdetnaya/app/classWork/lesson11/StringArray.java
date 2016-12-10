package com.tbezdetnaya.app.classWork.lesson11;

import java.util.Scanner;

/**
 * Created by ACER PC on 10.12.2016.
 */
public class StringArray {
    public static void main(String[] args) {
        System.out.println("Enter numbers using comma delimiter");
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++){
            stringBuilder.insert(i, inputString.charAt(i));
            System.out.println(inputString.charAt(i));
        }
    }
}
