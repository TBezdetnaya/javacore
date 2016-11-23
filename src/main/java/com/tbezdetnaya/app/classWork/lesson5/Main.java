package com.tbezdetnaya.app.classwork.lesson5;

/**
 * Created by ACER PC on 15.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bank oshadbank = new Bank("Oshadbank");
        Bank privatbank = new Bank("Privatbank");
        Bank pumb = new Bank("pumb");


        Person richMan = new Person();
        richMan.setAge(72);
        richMan.setFeedbackFlag(false);
        richMan.setSalary(30000);
        richMan.setWorkFlag(false);
        richMan.setWorkingTime(0);

        Person nishebrod = new Person();
        nishebrod.setAge(28);
        nishebrod.setFeedbackFlag(false);
        nishebrod.setSalary(100);
        nishebrod.setWorkFlag(false);
        nishebrod.setWorkingTime(1);

        Person teenager = new Person();
        teenager.setAge(16);

        Person pensioner = new Person();
        pensioner.setAge(75);
        pensioner.setSalary(1200);
        pensioner.setWorkingTime(25);

        Person student = new Person();
        student.setAge(19);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);

        System.out.println("Loan accepted: " + privatbank.isLoanCanBeIssued(richMan));
    }
}
