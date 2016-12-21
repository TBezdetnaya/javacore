package com.tbezdetnaya.app.homework.lesson12;

import com.tbezdetnaya.app.homework.lesson10.PalindrameSearch;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tanya on 16.12.2016.
 */
public class FileUtils {
    PalindrameSearch palindrom = new PalindrameSearch();


    public double[] readFileNumber ()throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Project\\javacore\\src\\main\\resources\\ArrayData.txt"));
        String line;

        double[] arr = new double[0];
        while ((line = reader.readLine()) != null) {

            String[] arrSplit = line.split(",");
            arr = new double[arrSplit.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Double.parseDouble(arrSplit[i]);
            }

        }

        reader.close();

        return arr;

    }

    public double[] writeFileNumber(double[] sourceArr) throws IOException{
        double[] arr = sourceArr.clone();
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Project\\javacore\\src\\main\\resources\\ArrayWrite.txt"));
        writer.write(Arrays.toString(arr).replace("[","").replace("]", ""));

        writer.close();
        return arr;

    }
    public String[] readFileWord()throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Project\\javacore\\src\\main\\resources\\ArrayWordData.txt"));
        String line;
        ArrayList<String> arrList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {

            arrList.add(line);
        }
        reader.close();
        String[] arr = new String[arrList.size()];

        return arrList.toArray(arr);

    }
    public String[] writeFileWord(String[] sourceArr) throws IOException{
        String[] arr = sourceArr.clone();
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Project\\javacore\\src\\main\\resources\\ArrayWrite_word.txt"));
        for (int i = 0; i < arr.length; i++) {
            String result = palindrom.isPalindrameArrayString(arr[i])? "It is palindrome " + arr[i]: "It is not palindrome " + arr[i];
            writer.write(result);
            writer.write(System.lineSeparator());

        }
        writer.close();
        return arr;

    }


}
