package com.tbezdetnaya.app.homework.lesson10;

/**
 * Created by tanya on 08.12.2016.
 */
public class PalindrameSearch {

    public boolean isPalindromeEven(String palindrome) {

        String s = palindrome.toLowerCase().substring(0, palindrome.length() / 2);
        String s1 = palindrome.toLowerCase().substring(palindrome.length() / 2);
        String reserve = new StringBuffer(s1).reverse().toString();
        if (reserve.equals(s)) {
            System.out.println("It is palindrome " + "- " + palindrome);
            return true;
        }
        System.out.println("Is Not palindrome " + "- " + palindrome);
        return false;

    }

    public boolean isPalindromeEvenOdd(String s) {

        String palindrome = s.toLowerCase();
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                System.out.println("Is not palindrome " + "- " + palindrome);
                return false;
            }
        }
        System.out.println("It is palindrome " + "- "+ palindrome);
        return true;
    }

    public boolean isPalindromeReverseString(String s) {
        String palindrome = s.toLowerCase();
        String reserve = new StringBuffer(palindrome).reverse().toString();
        if (reserve.equals(palindrome)) {
            System.out.println("It is palindrome " + "- " + palindrome);
            return true;
        }
        System.out.println("Is Not palindrome " + "- " + palindrome);
        return false;
    }

    public boolean isPalindrameArray(String s) {
        String[] palindrome = s.split(",");
        for (int i = 0; i < palindrome.length; i++) {
            isPalindromeEvenOdd(palindrome[i]);

        }
        return true;

    }
}




