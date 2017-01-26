package com.tbezdetnaya.app.homework.lesson17;

/**
 * Created by tanya on 26.01.2017.
 */
public class Person {

    private String name;
    private String surname;
    private String faculty;
    private String course;
    private String status;
    private boolean isTitle;

    public Person(String line) {
        String [] values = line.split(",");
        this.name = values[0];
        this.surname = values[1];
        this.faculty = values[2];
        this.course = values[3];
        this.status = values[4];
        this.isTitle = Boolean.parseBoolean(values[5]);
    }
    public  Person(){

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }


    public boolean isTitle() {
        return isTitle;
    }
}
