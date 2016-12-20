package com.tbezdetnaya.runners.homework;


import com.tbezdetnaya.app.homework.lesson12.FileUtils;
import com.tbezdetnaya.app.homework.lesson7.Validation;
import com.tbezdetnaya.app.homework.lesson9.ArrayUtils;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tanya on 16.12.2016.
 */
public class Lesson12Runner {
    public static void main(String[] args)throws IOException {
        FileUtils file = new FileUtils();
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner sc = new Scanner(System.in);
        do {

                switch (sc.nextInt()){
                    case 1:{
                        double[]arr = arrayUtils.arrayBubbleSortAscending(file.readFileNumber());
                        file.writeFileNumber(arr);

                    }
                    break;

                    case 2:{
                        String [] arr = file.readFileWord();
                        file.writeFileWord(arr);
                    }
                    break;
                }



        }while (Validation.needContinue());

    }
}
