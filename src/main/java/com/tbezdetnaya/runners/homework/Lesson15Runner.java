package com.tbezdetnaya.runners.homework;

import com.tbezdetnaya.app.homework.lesson15.Bicycle;
import com.tbezdetnaya.app.homework.lesson15.BicycleWithRing;
import com.tbezdetnaya.app.homework.lesson15.BicycleWithRingInterface;
import com.tbezdetnaya.app.homework.lesson15.CustomBicycle;

/**
 * Created by Tanya on 05.01.2017.
 */
public class Lesson15Runner {
    public static void main(String[] args) {
        Bicycle someBicycle = new CustomBicycle();

        CustomBicycle customBicycle = new CustomBicycle();
        BicycleWithRingInterface ring = new BicycleWithRing();
        someBicycle.ride();
        customBicycle.printSpeed(someBicycle.setSpeed(27));
        customBicycle.printGear(someBicycle.setGear(9));
        ring.ring();
    }
}
