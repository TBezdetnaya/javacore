package com.tbezdetnaya.app.homework.lesson15;

/**
 * Created by Tanya on 05.01.2017.
 */
public abstract class  Bicycle {
    public void ride(){
        System.out.println("Wroom!");
    }
    public abstract int setSpeed(int speed);
    public abstract int setGear(int gear);


}
