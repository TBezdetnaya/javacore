package com.tbezdetnaya.app.homework.lesson10;

import org.junit.Assert;
import org.junit.Test;

public class PalindrameSearchTest {
    PalindrameSearch palindrameSearch = new PalindrameSearch();
    String positive = "1221";
    String b = "Moom,noon";
    String negative = "dsdsjo";

    boolean expected = true;
    boolean expected1 = false;



    @Test
    public void testIsPalindromeEven() throws Exception {
        boolean result = palindrameSearch.isPalindromeEven(positive);
        Assert.assertEquals(expected,result);

    }
    @Test
    public void testIsPalindromeEven01() throws Exception {
        boolean result = palindrameSearch.isPalindromeEven(negative);
        Assert.assertEquals(expected1,result);

    }

    @Test
    public void testIsPalindromeEvenOdd() throws Exception {
        boolean result = palindrameSearch.isPalindromeEvenOdd(positive);
        Assert.assertEquals(expected,result);

    }
    @Test
    public void testIsPalindromeEvenOdd01() throws Exception {
        boolean result = palindrameSearch.isPalindromeEvenOdd(negative);
        Assert.assertEquals(expected1,result);

    }

    @Test
    public void testIsPalindromeReverseString() throws Exception {
        boolean result = palindrameSearch.isPalindromeReverseString(positive);
        Assert.assertEquals(expected,result);

    }
    @Test
    public void testIsPalindromeReverseString01() throws Exception {
        boolean result = palindrameSearch.isPalindromeReverseString(negative);
        Assert.assertEquals(expected1,result);

    }
    @Test
    public void testIsPalindrameArray()throws Exception{
        boolean result = palindrameSearch.isPalindrameArray(b);
        Assert.assertEquals(expected,result);

    }



}