package com.tbezdetnaya.app.classWork.lesson17;

/**
 * Created by ACER PC on 13.01.2017.
 */
public class BoxPrinter<T> {
    private T val;

// T stands for "Type" – this is placeholder

    public BoxPrinter(T arg) { val = arg; }

    public String toString() {

        return "{" + val + "}";

    }

    public T getValue() { return val; }
}
