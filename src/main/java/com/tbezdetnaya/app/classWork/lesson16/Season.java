package com.tbezdetnaya.app.classWork.lesson16;

/**
 * Created by ACER PC on 13.01.2017.
 */
public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public static void main(String args[]) {

        Season season = Season.SPRING;

        if (season == Season.SPRING){
            season = Season.SUMMER;

        }
        //enum uses "==" because it compile-time checked
        System.out.println(season);
    }
}

