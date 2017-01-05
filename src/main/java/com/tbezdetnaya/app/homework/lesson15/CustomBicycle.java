package com.tbezdetnaya.app.homework.lesson15;

/**
 * Created by Tanya on 05.01.2017.
 */
public class CustomBicycle  extends Bicycle  {
    @Override
    public void ride() {
        super.ride();
        System.out.println("Wshhhh!");
    }

    @Override
    public int setSpeed(int speed) {
        return speed;

    }

    @Override
    public int setGear(int gear) {
        return gear;

    }
    public void printSpeed (int speed){
        System.out.println("Speed: "+ speed);
    }
    public void printGear (int gear){
        System.out.println("Gear: " + gear);
    }
}

