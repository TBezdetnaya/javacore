package com.tbezdetnaya.app.homework.lesson05;

/**
 * Created by ACER PC on 22.11.2016.
 */
public class Calculation {
    public double calculatorCirclArea(double a){

        double circleArea = Math.pow(a, 2) * Math.PI;
        return circleArea;


    }
    public boolean isEvenOrOdd(double a) {
        if (a % 2 == 0){
            System.out.println("Entered value is even number!");
            return true;
        }else{
            System.out.println("Entered value is odd number!");
            return false;
        }
    }

    public boolean equalsNumber(double a, double b) {
        if (a > b){
            System.out.println("The first number is bigger than the second number: " + a + " > " + b);
            return true;
        }else if (b > a){
            System.out.println("The second number is bigger than the first number: " + b + " > " + a);
            return true;

        }else{

        }
        return false;
    }

    public boolean angledTriangle(double a, double b, double c) {

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        c = Math.pow(c, 2);

        if (((a + b == c) || (b + c == a) || (c + a == b)) ) {
            System.out.println("The triangle can be built using three mentioned numbers");
            return true;
        } else {
            System.out.println("The triangle can not be built using three mentioned numbers");
            return false;
        }

    }
}
