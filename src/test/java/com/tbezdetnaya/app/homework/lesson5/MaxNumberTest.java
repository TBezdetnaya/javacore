package com.tbezdetnaya.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tanya on 17.11.2016.
 */
public class MaxNumberTest {

    @Test
    public void testEqualsNumber(){
        MaxNumber biggerNumber = new MaxNumber();
        double result = biggerNumber.equalsNumber(5,7);
        double expected = 9;
        Assert.assertNotEquals(expected, result, 0);

    }

    @Test
    public void testEqualsNumber01(){
        MaxNumber biggerNumber = new MaxNumber();
        double result = biggerNumber.equalsNumber(5,7);
        double expected = 7;
        Assert.assertEquals(expected, result, 0);

    }


}
