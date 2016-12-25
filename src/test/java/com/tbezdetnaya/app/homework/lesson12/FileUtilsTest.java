package com.tbezdetnaya.app.homework.lesson12;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by tanya on 23.12.2016.
 */
public class FileUtilsTest {
    FileUtils fileUtils = new FileUtils();
    private String arrayData = "src/test/resources/standard.txt";
    private String writeFileData = "resources/ArrayWrite.txt";
    private String readFileWord = "src/test/resources/standardFileWord.txt";
    private String writeFileWord = "resources/ArrayWrite_word.txt";

    private  double [] arr = {12.0, 4.0, 67.8, 6.0, 45.0, 5.0, 2.3, 1.0, 0.0};
    private double [] expected = {12, 4, 67.8, 6, 45, 5, 2.3, 1, 0};
    private String [] array = {"moom", "word", "noon", "ere"};



    @Test
    public void testReadFileNumber() throws Exception {
        double[] result = fileUtils.readFileNumber();
        Assert.assertArrayEquals(expected,result,0);

    }


    @Test
    public void testReadFileWord() throws Exception {

        String [] result = fileUtils.readFileWord();
        Assert.assertArrayEquals(array,result);

    }


    @Test
    public void testWriteFileNumber() throws Exception {

        fileUtils.writeFileNumber(arr);
        BufferedReader readStandard = new BufferedReader(new FileReader(arrayData));
        String expected = readStandard.readLine();
        BufferedReader readResult = new BufferedReader(new FileReader(writeFileData));
        String result = readResult.readLine();
        Assert.assertEquals(expected,result);

    }

    @Test
    public void testWriteFileWord() throws Exception {
        fileUtils.writeFileWord(array);
        BufferedReader readerStandard = new BufferedReader(new FileReader(readFileWord));
        String expectedWord = readerStandard.readLine();
        BufferedReader readResult = new BufferedReader(new FileReader(writeFileWord));
        String result = readResult.readLine();

        Assert.assertEquals(expectedWord,result);


    }
}