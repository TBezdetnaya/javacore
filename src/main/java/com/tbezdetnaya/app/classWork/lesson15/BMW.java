package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 29.12.2016.
 */
public class BMW  {
    private Engine bmwEngine;
    public BMW(String name) {
        bmwEngine = new Engine();
        bmwEngine.setTypeOfCylinder(name);

    }

    void drive(){
        System.out.println("90 emissions");
    }
}
