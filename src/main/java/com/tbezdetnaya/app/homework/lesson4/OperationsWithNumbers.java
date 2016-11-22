package com.tbezdetnaya.app.homework.lesson4;

/**
 * Class serves for storing the objects with properties
 * <b> intVeriable </b>,
 * <b> intVeriable2 </b>,
 * <b> expectedNumber  </b>,
 * @author Tanya
 * @version 1.0
 */
public class OperationsWithNumbers {
   private int intVeriable = 14;
    private int intVeriable2 = 2;
    private int expectedNumber = 12;


    public int getIntVeriable2 (){
        return intVeriable2;
    }
    public int getExpectedNumber (){
        return expectedNumber;
    }

    /**
     * The value of property intVeriable2, intVeriable  is being set or with the method {@link #getDividingByTwo}
     * @return the value of property is being returned intVeriable2, intVeriable
     */

    public int getDividingByTwo () {

        if (intVeriable % intVeriable2  == 0) {
            System.out.println("Very well! Number is divisible by 2!");
            return intVeriable2 ;
        } else {
            System.out.println("This number is not divisible by 2!");
        }
        return intVeriable;

    }
    /**
     * The value of property intVeriable is being set or with the method {@link # getSumOfNumbers}
     * @return the value of property is being returned intVeriable
     */

    public int getSumOfNumbers (){
        intVeriable= (Math.addExact(intVeriable,intVeriable2));
        return intVeriable;

    }
    /**
     * The value of property intVeriable is being set or with the method {@link #getDivisionOfNumbers}
     * @return the value of property is being returned intVeriable
     */

    public int getDivisionOfNumbers (){
        intVeriable = (Math.floorDiv(intVeriable, intVeriable2));
        return intVeriable;

    }
    /**
     * The value of property intVeriable is being set or with the method {@link #getSubtractOfNumbers}
     * @return the value of property is being returned intVeriable
     */

    public int getSubtractOfNumbers(){
        intVeriable = (Math.subtractExact(intVeriable, intVeriable2));
        return intVeriable;
    }

    public int getMultiplyExact(){
        intVeriable = (Math.multiplyExact(intVeriable, intVeriable2));
        return intVeriable;

    }
}


