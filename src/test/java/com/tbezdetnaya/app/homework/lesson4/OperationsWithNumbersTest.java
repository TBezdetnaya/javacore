package com.tbezdetnaya.app.homework.lesson4; /**
 * Created by tanya on 14.11.2016.
 */

import org.junit.Assert;
import org.junit.Test;

public class OperationsWithNumbersTest {
    OperationsWithNumbers number = new OperationsWithNumbers();

    @Test
    public void dividingByTwoTest06(){
        //check the number is divisible by 2
        int actualResult = number.getDividingByTwo();
        Assert.assertEquals(number.getIntVeriable2(), actualResult);

    }

    @Test
    //sum of numbers
    public void sumOfNumbersTest07(){
        int actualResult = number.getSumOfNumbers();
        Assert.assertEquals (number.getExpectedNumber(),actualResult);
    }

    @Test
    //division numbers
    public void divisionOfNumbersTest08 (){
        int actualResult = number.getDivisionOfNumbers();
        Assert.assertEquals(number.getExpectedNumber(),actualResult);
    }

    @Test
    //the difference of numbers
    public void differenceOfNumbersTest09(){
        int actualResult = number.getSubtractOfNumbers();
        Assert.assertEquals(number.getExpectedNumber(),actualResult);


    }

    @Test
    public void multiplyExactTest010 (){
        int actualResult = number.getMultiplyExact();
        Assert.assertEquals(number.getExpectedNumber(),actualResult);

    }


}
