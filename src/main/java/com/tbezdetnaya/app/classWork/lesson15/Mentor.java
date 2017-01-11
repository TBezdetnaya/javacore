package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 10.01.2017.
 */
public class Mentor extends Teacher {

    public Mentor(String name, String university) {
        super(name, university);
    }



    @Override
    public String lessonFinished() {
        return super.lessonFinished();
    }

    public String lessonFinished(String name) {
        return name;
    }
    public void printLessonFinished(String name){
        System.out.println(name);

    }
}
