package com.tbezdetnaya.app.homework.lesson11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tanya on 13.12.2016.
 */
public class ArrayParseTest {
    private ArrayParse arrayParse = new ArrayParse();
    private String a = "12,4,45.6";
    private double[] expected = {12,4,45.6};
    private String b = "asd, dd 7 d";
    private String[] expectedString = {"asd","dd","d"};
    private String keyWord = " ";
    private String c = "word test key";
    private String [] expectedStr = {"word", "test", "key"};
    private String keyWord1 = "test";
    private String[] expectedNotWord = {"word "," key"};



    @Test
    public void testGetArray() throws Exception {
        double [] result = arrayParse.getArray(a);
        Assert.assertArrayEquals(expected,result,0);

    }

    @Test
    public void testGetArrayOnlyLetters() throws Exception {
        String[] result = arrayParse.getArrayOnlyLetters(b);
        Assert.assertArrayEquals(expectedString,result);

    }

    @Test
    public void testGetArrayString() throws Exception {
        String [] result = arrayParse.getArrayString(c, keyWord);
        Assert.assertArrayEquals(expectedStr, result);

    }
    @Test
    public void testGetArrayString01() throws Exception {

        String [] result = arrayParse.getArrayString(c, keyWord1);
        Assert.assertArrayEquals(expectedNotWord,result);


    }
}