package com.tbezdetnaya.app.homework.lesson12;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * Created by tanya on 23.12.2016.
 */
public class FileUtilsTest {
    FileUtils fileUtils = new FileUtils();



    @Test
    public void testReadFileNumber() throws Exception {
        double [] expected = {12, 4, 67.8, 6, 45, 5, 2.3, 1, 0};
        double[] result = fileUtils.readFileNumber();
        Assert.assertArrayEquals(expected,result,0);

    }


    @Test
    public void testReadFileWord() throws Exception {
        String [] expected = {"moom", "word", "noon", "ere"};
        String [] result = fileUtils.readFileWord();
        Assert.assertArrayEquals(expected,result);

    }


}