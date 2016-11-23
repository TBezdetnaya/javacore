package com.tbezdetnaya.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tanya on 17.11.2016.
 */
public class EvenOrOddTest {
    @Test
    public void testEqualsNumber (){
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        boolean result = evenOrOdd.isEven(25);
        boolean expected = true;
        Assert.assertEquals( expected, result);

    }
}
