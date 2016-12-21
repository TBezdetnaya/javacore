package com.tbezdetnaya.app.homework.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tanya on 17.12.2016.
 */
public class WhiteCollar extends Human {
    private String company;


    public WhiteCollar( String name, int age, String company) {
        super(name, age);
        this.company = company;
       checkNameCompany(company);


    }

    public boolean checkNameCompany(String company){
        Pattern pattern =  Pattern.compile("([a-zA-Z| |,-])*");
        Matcher matcher = pattern.matcher(company);
        String result = (matcher.matches()) ? "It is name company: " + company : "Company name is invalid";
        System.out.println(result);

        return false;

    }


    public void setCompany(String company) {
        if (checkNameCompany (company)){
            this.company = company;
        }

    }

}
