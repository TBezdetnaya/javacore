package com.tbezdetnaya.app.utils.convertors;

/**
 * Created by Tanya on 10.11.2016.
 */
public class PrimitiveConvertor {
    private float floatVeriable = 56F;
    private int intVariable = 9451;
    private char charVeriable;
    private char charVeriable2 = 'f';


    public void floatToChar() {
        charVeriable = (char) floatVeriable;
        System.out.println("Input float value is: " + floatVeriable + ". Output char value is: " + charVeriable);
    }

    public void intToChar() {
        charVeriable = (char) intVariable;
        System.out.println("Input int value is: " + intVariable + ". Output char value is: " + charVeriable);
    }

    public void charToInt() {
        intVariable = charVeriable2;
        System.out.println("Input char value is: " + charVeriable2 + ". Output int value is: " + intVariable);
    }

}
