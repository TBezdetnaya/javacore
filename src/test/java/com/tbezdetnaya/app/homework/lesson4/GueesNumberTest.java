package com.tbezdetnaya.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tanya on 13.11.2016.
 */
public class GueesNumberTest {

    GuessNumber guessNumber = new GuessNumber();

    @Test

    public void equalsNumberTest(){

        int actualResult = guessNumber.getEqualsNumber();
        Assert.assertNotEquals(guessNumber.getExpectedResult(), actualResult);
        System.out.println("Congratulations! You guessed number " + guessNumber.getExpectedResult());


    }



}
