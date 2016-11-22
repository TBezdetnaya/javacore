package com.tbezdetnaya.app.homework.lesson4;


/**
 * Created by Tanya on 12.11.2016.
 */

public class GuessNumber {

    private int expectedResult  = (int)(Math.random()* 8);

    public int getExpectedResult (){
        return this.expectedResult;
    }

    public int getEqualsNumber() {
        Player  player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        player1.guess();
        player2.guess();
        player3.guess();

        if (player1.number == expectedResult) {
            return player1.number;
        }

        if (player2.number == expectedResult) {
           return player1.number;
        }

        if (player3.number == expectedResult) {

        }
        return player3.number;

    }

}








