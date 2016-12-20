package com.tbezdetnaya.app.classWork.lesson14;

/**
 * Created by ACER PC on 20.12.2016.
 */
public class Student extends Person {
    private String university;
    private String response = "Ehh, what was the question?";

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }
    public String getResponse (String question){
        return response;
    }
    public String toString (){
        return  getName()+ " " + university + "\n " + response ;
    }

}
