package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson3.convertos.PrimitiveConvertor;

/**
 * Created by Tanya on 10.11.2016.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor = new PrimitiveConvertor();
        convertor.floatToChar(convertor.getFloatVariable());
        convertor.charToInt(convertor.getCharVariable());
        convertor.intToChar(convertor.getIntVariable());
    }
}



