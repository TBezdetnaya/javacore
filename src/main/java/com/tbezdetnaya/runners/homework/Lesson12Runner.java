package com.tbezdetnaya.runners.homework;


import com.tbezdetnaya.app.homework.lesson12.FileUtils;
import com.tbezdetnaya.app.homework.lesson16.MenuItem;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import com.tbezdetnaya.app.homework.lesson9.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Tanya on 16.12.2016.
 */
public class Lesson12Runner {
    public static void main(String[] args)throws IOException {
        FileUtils file = new FileUtils();
        ArrayUtils arrayUtils = new ArrayUtils();

        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Welcome!This application works with files. Enter text \"TASK[number]\" to begin your work:");
                System.out.println("1 - read string with an array of numbers from file. Sort out and write the result into the file.");
                System.out.println("2 - to read a list of words from file, to put the words with the palindrome feature in the other file");
                System.out.println("3 - prompt the user for the file name, text. Save the specified strings in the file after entering the \"exit\"");
                System.out.println("4 - The program creates a file, reads the input values separated by commas. After entering an empty string, all data is written into the file.");
                MenuItem item = MenuItem.valueOf((sc.nextLine().toUpperCase()));
                switch (item){
                    case TASK1:
                    {
                        double[]arr = arrayUtils.arrayBubbleSortAscending(file.readFileNumber());
                        file.writeFileNumber(arr);
                    }
                    break;
                    case TASK2:{
                        String [] arr = file.readFileWord();
                        file.writeFileWord(arr);
                    }
                    break;
                    case TASK3:
                        System.out.println("Specify file name ....txt");
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        String s = reader.readLine();
                        file.writeFile(file.creatFile(s));

                        break;
                    case  TASK4:
                        file.readerWriteKeyValue();
                        break;

                }
            }catch (Exception e){
                System.out.println("Error: invalid value");
            }

        }while (Validation.needContinue());

    }
}
