package com.tbezdetnaya.app.homework.lesson11;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tanya on 13.12.2016.
 */
public class ArrayParseTest {
    private ArrayParse arrayParse = new ArrayParse();

    @Test
    public void testGetArray() throws Exception {
        String a = "12,4,45.6";
        double[] expected = {12,4,45.6};
        double [] result = arrayParse.getArray(a);
        Assert.assertArrayEquals(expected,result,0);

    }

    @Test
    public void testGetArrayOnlyLetters() throws Exception {
        String a = "asd, dd 7 d";
        String[] expected = {"asd","dd","d"};
        String[] result = arrayParse.getArrayOnlyLetters(a);
        Assert.assertArrayEquals(expected,result);

    }

    @Test
    public void testGetArrayString() throws Exception {
        String keyWord = "";
        String a = "word test key";
        String [] result = arrayParse.getArrayString(a, keyWord);
        String [] expected = {"word test key"};
        Assert.assertArrayEquals(expected, result);

    }
    @Test
    public void testGetArrayString01() throws Exception {
        String keyWord = "test";
        String a = "word test key";
        String [] result = arrayParse.getArrayString(a, keyWord);
        String[] expected = {"word "," key"};
        Assert.assertArrayEquals(expected,result);


    }
}