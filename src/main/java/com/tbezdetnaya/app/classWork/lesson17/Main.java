package com.tbezdetnaya.app.classWork.lesson17;

/**
 * Created by ACER PC on 13.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));

        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");

        System.out.println(value2);
        BoxPrinter<Double> value3 = new BoxPrinter<>(new Double(33));
        System.out.println(value3);


      // Here we fixed it

        String intValue2 = value2.getValue();
    }
}
