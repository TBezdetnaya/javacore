package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 29.12.2016.
 */
public class Audi extends Car {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audi audi = (Audi) o;

        return name != null ? name.equals(audi.name) : audi.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    private String name;
    public Audi(String name) {
        super(name);
    }

    void drive(){
        System.out.println("94 emissions");
    }
}
