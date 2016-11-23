package com.tbezdetnaya.app.classwork.lesson5;

/**
 * Created by ACER PC on 15.11.2016.
 */
public class Person {
    private int age,workingTime;
    private boolean workFlag, deedbackFlag;
    private double Salary;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }

    public boolean isWorkFlag() {
        return workFlag;
    }

    public void setWorkFlag(boolean workFlag) {
        this.workFlag = workFlag;
    }

    public boolean isFeedbackFlag() {
        return deedbackFlag;
    }

    public void setFeedbackFlag(boolean deedbackFlag) {
        this.deedbackFlag = deedbackFlag;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
