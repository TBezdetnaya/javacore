package com.tbezdetnaya.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tanya on 17.11.2016.
 */
public class TestCircleArea {
    @Test
    public void testCalculatorCirclArea (){
        CircleArea circleArea = new CircleArea();
        double result = circleArea.calculatorCirclArea(6);
        double expected = 113.09733552923255;
        Assert.assertEquals(expected, result, 0);



    }
    @Test
    public void testCalculatorCirclArea2 (){
        CircleArea circleArea = new CircleArea();
        double result = circleArea.calculatorCirclArea(8);
        double expected = 113.09733552923255;
        Assert.assertEquals(expected, result, 0);



    }
    @Test
    public void testCalculatorCirclArea3 (){
        CircleArea circleArea = new CircleArea();
        double result = circleArea.calculatorCirclArea(7);
        double expected = 113.09733552923255;
        Assert.assertEquals(expected, result, 0);



    }
}
