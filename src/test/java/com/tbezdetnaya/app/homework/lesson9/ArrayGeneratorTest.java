package com.tbezdetnaya.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Test;


public class ArrayGeneratorTest {

    ArrayGenerator arrayGenerator = new ArrayGenerator();
    ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    public void testVerifyMultiDimentionalArrayLength() throws Exception {
        int expected = 40;
        int result = arrayUtils.countArray(arrayGenerator.createMultiDimentionalArray());
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testVerifyArrayLength() throws Exception {
        int expected = 10;
        double []arr = arrayGenerator.createArray();
        int result = arr.length;
        Assert.assertEquals(expected, result);

    }
    @Test
    public void testVerifyArrayNotNull()throws Exception{
        Assert.assertNotNull(arrayGenerator.createArray());
    }
    @Test
    public void testVerifyMultiDimentionalArrayNotNull()throws Exception{
        Assert.assertNotNull(arrayGenerator.createMultiDimentionalArray());
    }
}