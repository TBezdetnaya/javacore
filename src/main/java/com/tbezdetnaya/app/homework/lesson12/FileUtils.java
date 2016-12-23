package com.tbezdetnaya.app.homework.lesson12;

import com.tbezdetnaya.app.homework.lesson10.PalindrameSearch;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tanya on 16.12.2016.
 */
public class FileUtils {
    PalindrameSearch palindrome = new PalindrameSearch();


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
        String[] arr = arrList.toArray( new String[arrList.size()]);

        return arr;

    }
    public String[] writeFileWord(String[] sourceArr) throws IOException{
        String[] arr = sourceArr.clone();
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Project\\javacore\\src\\main\\resources\\ArrayWrite_word.txt"));
        for (int i = 0; i < arr.length; i++) {
            String result = palindrome.isPalindrameArrayString(arr[i])? "It is palindrome " + arr[i]: "It is not palindrome " + arr[i];
            writer.write(result);
            writer.write(System.lineSeparator());

        }
        writer.close();
        return arr;

    }
    public String readerWriteConcole () throws IOException{
        System.out.println("Specify file name ....txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        File file = new File("D:/Project/javacore/src/main/resources/",  s);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        System.out.println("Specify strings via enter button . On completion select the word \"exit\" ");

        while (true){
            String answer = reader.readLine();
            if (answer.equals("exit")){
                break;
            }

            writer.write(answer);
            writer.write(System.lineSeparator());
        }
        writer.close();
        return s;
    }
    public boolean readerWriteKeyValue ()throws IOException{
        System.out.println("Specify the key and its value, separated by commas. On completion enter an empty string.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:/Project/javacore/src/main/resources/properties file.txt"));

        ArrayList<String> arrayKey = new ArrayList<>();
        ArrayList<String> arrayValue = new ArrayList<>();

        String answer = reader.readLine();
        while (!answer.equals("")){
            String key =  answer.substring(0,answer.indexOf(','));
            String value = answer.substring(answer.indexOf(','), answer.length() );

            if (arrayKey.contains(key)){ // contains проверяет содержится ли key в массиве arrayKey
                int index = getIndex (arrayKey,key);
                arrayValue.set(index, value);
            }else {
                arrayKey.add(key);
                arrayValue.add(value);
            }
            answer = reader.readLine();
        }

        for (int i = 0; i < arrayKey.size(); i++) {
            writer.write(String.valueOf(arrayKey.get(i)));
            writer.append(" = ");
            writer.write(String.valueOf(arrayValue.get(i).replace(",", "")));
            writer.write(System.lineSeparator());

        }
        writer.close();
        return true;


    }

    public   int getIndex(ArrayList<String> mArrayList ,  String keyItem) {
        for (int i=0; i < mArrayList.size(); i++)
        {
            String key = mArrayList.get(i);
            if(key.equals(keyItem))
            {
                return i;
            }
        }
        return -1;
    }
}
