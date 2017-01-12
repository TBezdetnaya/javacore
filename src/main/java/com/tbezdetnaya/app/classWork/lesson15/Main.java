package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("X6");
        System.out.println(bmw);

        Car audi = new Audi("X5");
      //  System.out.println(bmw.name);
      //  printEmissions(bmw);
        printEmissions(audi);
        Mentor mentor = new Mentor(" "," ");
        mentor.printLessonFinished(mentor.lessonFinished("lesson15 finished"));



    }
    public static void printEmissions (Car car){
        car.drive();
    }
}
