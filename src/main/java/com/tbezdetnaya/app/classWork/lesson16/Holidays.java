package com.tbezdetnaya.app.classWork.lesson16;

/**
 * Created by ACER PC on 13.01.2017.
 */
public enum Holidays {
    NEW_YEAR (1, "January", "New Year"),  CHRISTMAS (7, "January", "Christmas" );
    private int value;
    private String month;
    private String name;

    Holidays(int value, String month, String name) {
        this.value = value;
        this.month= month;
        this.name = name;

    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMonth() {
        return month;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Holidays{"+ getValue()+ " " + getMonth()+" " + getName()+'}';

    }
}
