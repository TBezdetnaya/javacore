package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 29.12.2016.
 */
public class BMW  {
    private Engine bmwEngine;

    public BMW(String typeOfCylinder) {
       this.bmwEngine = new Engine();
        bmwEngine.setTypeOfCylinder(typeOfCylinder);

    }
    public String getTypeOfCylinder(){
        return bmwEngine.getTypeOfCylinder();
    }

    void drive(){
        System.out.println("90 emissions");
    }

    @Override
    public String toString() {
        return "BMW{" + "Engine " + getTypeOfCylinder() + '}';
    }
}
