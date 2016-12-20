package com.tbezdetnaya.app.homework.lesson11;
/**
 * Created by Tanya on 10.12.2016.
 */
public class ArrayParse {

    public double[] getArray(String a) {
        StringBuilder builder = new StringBuilder(a);
        String[] splitStringArray = builder.toString().split("[,;| |]");
        double[] arr = new double[splitStringArray.length];
        for (int i = 0; i < splitStringArray.length; i++) {
          arr[i] = Double.parseDouble(splitStringArray[i]);
            System.out.println(splitStringArray);
        }
        return arr;

    }
    public String[] getArrayOnlyLetters (String a){
        StringBuilder builder = new StringBuilder(a);
        String[] splitStringArray = builder.toString().split("[\\d,;.| |/]");
        for (int i = 0; i <splitStringArray.length ; i++) {
            System.out.print( splitStringArray[i]);
        }
        String temp = String.join( " ", splitStringArray);

        return temp.split("\\s+");
    }

    public String[] getArrayString(String a, String keyWord){
        StringBuilder builder = new StringBuilder(a);
        String [] splitStringArray = new String[1];
        if (!keyWord.equals("")){
            splitStringArray = builder.toString().split(keyWord);
        } else {
            splitStringArray[0] = a;
        }
        for (int i = 0; i < splitStringArray.length ; i++) {
            System.out.println(splitStringArray[i]);
        }

        return splitStringArray;

    }


}
