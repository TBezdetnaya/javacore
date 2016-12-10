package com.tbezdetnaya.app.homework.lesson10;

import org.junit.Assert;
import org.junit.Test;

public class PalindrameSearchTest {
    PalindrameSearch palindrameSearch = new PalindrameSearch();
    String positive = "1221";
    String b = "Moom,noon";
    String c = "Mo om";
    String negative = "dsdsjo";

    boolean expectedTrue = true;
    boolean expectedFalse = false;



    @Test
    public void testIsPalindromeEven() throws Exception {
        boolean result = palindrameSearch.isPalindromeEven(positive);
        Assert.assertEquals(expectedTrue,result);

    }
    @Test
    public void testIsPalindromeEven01() throws Exception {
        boolean result = palindrameSearch.isPalindromeEven(negative);
        Assert.assertEquals(expectedFalse,result);

    }

    @Test
    public void testIsPalindromeEvenOdd() throws Exception {
        boolean result = palindrameSearch.isPalindromeEvenOdd(positive);
        Assert.assertEquals(expectedTrue,result);

    }
    @Test
    public void testIsPalindromeEvenOdd01() throws Exception {
        boolean result = palindrameSearch.isPalindromeEvenOdd(negative);
        Assert.assertEquals(expectedFalse,result);

    }

    @Test
    public void testIsPalindromeReverseString() throws Exception {
        boolean result = palindrameSearch.isPalindromeReverseString(positive);
        Assert.assertEquals(expectedTrue,result);

    }
    @Test
    public void testIsPalindromeReverseString01() throws Exception {
        boolean result = palindrameSearch.isPalindromeReverseString(negative);
        Assert.assertEquals(expectedFalse,result);

    }
    @Test
    public void testIsPalindrameArray()throws Exception{
        boolean result = palindrameSearch.isPalindrameArray(b);
        Assert.assertEquals(expectedTrue,result);

    }
    @Test
    public void testIsPalindrameArrayString(){
        boolean result = palindrameSearch.isPalindrameArrayString(c);
        Assert.assertEquals(expectedTrue,result);

    }
    @Test
    public void testIsPalindrameArrayString01(){
        boolean result = palindrameSearch.isPalindrameArrayString(b);
        Assert.assertEquals(expectedFalse,result);

    }



}