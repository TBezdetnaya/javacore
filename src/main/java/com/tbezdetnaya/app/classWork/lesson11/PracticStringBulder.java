package com.tbezdetnaya.app.classWork.lesson11;


/**
 * Created by ACER PC on 09.12.2016.
 */
public class PracticStringBulder {
    public static void main(String[] args) {

        char [] charToString = {'l','e','s','s','o','n' };
        StringBuilder builder = new StringBuilder();
        for (char value: charToString){
            builder.append(value);
        }
        System.out.println(charToString);



    }

    public static void stringBuilder(){
        StringBuilder builder = new StringBuilder("start");
        int startIncliusiv = 2;
        int endExclusive = 2;
        int indexOffset = 3;
        int startInclusive = 1;

        builder.replace(startInclusive, endExclusive, "replace");
        builder.delete(startIncliusiv, endExclusive);
        builder.insert(indexOffset," some sub string");
        System.out.println(builder.toString());
    }

}
