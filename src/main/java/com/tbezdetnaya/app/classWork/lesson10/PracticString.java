package com.tbezdetnaya.app.classWork.lesson10;

import java.util.Arrays;

/**
 * Created by ACER PC on 06.12.2016.
 */
public class PracticString {
    public static void main(String[] args) {

        String stringName = "";
        char [] arrayCharToString = {'c','a','t'};

        for (int i = 0; i <arrayCharToString.length ; i++) {
            stringName += arrayCharToString[i];

        }
        System.out.println(stringName);

        char [] charToString = {'c','a','t'};
        stringName = Arrays.toString(charToString)
                .replaceAll(" ","")
                .replaceAll(",","")
                .replace("]","")
                .replace("[", "");

        System.out.println(stringName);
        Car car = new Car();
        car.carModifier(car);

        System.out.println(car.name);
        double dot = 0.0003;
        String doubleValue = String.valueOf(dot);
        System.out.println(doubleValue);

        String toFloat = "0.48f";
        String floatValue = String.valueOf(toFloat);
        System.out.println(floatValue);
        float a = Float.parseFloat(floatValue);
        System.out.println(a);

        double c = Double.parseDouble(doubleValue);
        System.out.println(c);





    }
}
