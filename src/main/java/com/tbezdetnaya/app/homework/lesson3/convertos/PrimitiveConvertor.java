package com.tbezdetnaya.app.homework.lesson3.convertos;

/**
 * Created by Tanya on 10.11.2016.
 */


public class PrimitiveConvertor {

    private int intVariable = 164;
    private float floatVariable = 56f;
    private char charVeriable = 'F';

    public int getIntVariable(){
        return intVariable;
    }

    public  float getFloatVariable(){
        return floatVariable;
    }
    public  char  getCharVariable(){
        return charVeriable;
    }


    public void floatToChar(float floatVeriable) {
        char charVeriable = (char) floatVeriable;
        System.out.println("Input float value is: " + floatVeriable + ". Output char value is: " + charVeriable);
    }

    public void charToInt (char charVeriable) {
        int intVariable = (int) charVeriable;
        System.out.println("Input int value is: " + intVariable + ". Output char value is: " + charVeriable);

    }

    public void intToChar(int intVariable) {
        char charVeriable = (char)intVariable;
        System.out.println("Input char value is: " + charVeriable + ". Output int value is: " + intVariable);

    }
}




