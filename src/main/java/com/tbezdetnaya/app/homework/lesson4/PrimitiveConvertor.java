package com.tbezdetnaya.app.homework.lesson4;

/**
 * Created by Tanya on 10.11.2016.
 */


public class PrimitiveConvertor {
    private int intVariable = 71;
    private float floatVariable = 71f;
    private char charVeriable = 'G';

    private char expectedCharResult = 'G';
    private int expectedIntResult = 12;

    public int getIntVariable(){
        return intVariable;
    }

    public int getExpectedIntResult (){
        return expectedIntResult;
    }
    public float getFloatVariable (){
        return floatVariable ;
    }

    public char getExpectedCharResult (){
        return expectedCharResult ;
    }
    public char getCharVeriable(){
        return charVeriable;
    }

    public char getFloatToChar(float floatVeriable) {
        char charVeriable = (char) floatVeriable;
        return charVeriable;
    }

    public int getCharToInt (char charVeriable) {
        int intVariable = (int) charVeriable;
        return intVariable;
    }

    public char getIntToChar(int intVariable) {
        char charVeriable = (char)intVariable;
        return charVeriable;
    }


    public double getLongToInt (long longVeriable){
        int intVeriable = (int) longVeriable;
        return intVeriable;
    }

}




