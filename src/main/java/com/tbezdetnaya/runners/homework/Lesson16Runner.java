package com.tbezdetnaya.runners.homework;
import com.tbezdetnaya.app.homework.lesson16.MenuItem;
import com.tbezdetnaya.app.homework.lesson16.PersonUtils;
import java.util.Scanner;

/**
 * Created by tanya on 16.01.2017.
 */
public class Lesson16Runner {
    public static void main(String[] args) {
        PersonUtils utils = new PersonUtils();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the game of \"Guess the age of the famous person\". Enter text \"TASK[number]\" to begin the work:");
            try {
                MenuItem item = MenuItem.valueOf((sc.nextLine().toUpperCase()));
                switch (item){
                    case TASK1:
                        utils.guessPersonData();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: invalid value");
            }

    }
}
