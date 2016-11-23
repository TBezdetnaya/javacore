package com.tbezdetnaya.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tanya on 18.11.2016.
 */
public class SideTriangleTest {
    @Test
    public void testCalculatorForTraingle (){
        SideTriangle sideTriangle = new SideTriangle();
        boolean result = sideTriangle.calculatorForTraingle(4,3,5);
        boolean expected = true;
        Assert.assertEquals(expected, result);
    }
}
