package com.tbezdetnaya.app.homework.lesson16;

/**
 * Created by tanya on 16.01.2017.
 */
public enum Person {
    PERSON1 ("Albert Einstein",138, "died"),
    PERSON2("Isaac Newton",375, "died"),
    PERSON3("Jim Carrey;",54, "alive"),
    PERSON4("Wolfgang Mozart",261, "died" ),
    PERSON5("Johann Sebastian Bach", 332, "died"),
    PERSON6("Ludwig van Beethoven", 247, "died"),
    PERSON7("Will Smith", 49, "alive"),
    PERSON8("Johne Depp", 54, "alive"),
    PERSON9("Sarah Michelle Gellar", 40, "alive"),
    PERSON10("Angelina Jolie",41,"alive");

    private  String fullName;
    private int age;
    private String isAlive;

    Person( String fullName, int age, String isAlive) {

        this.age = age;
        this.isAlive = isAlive;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public String isAlive() {
        return isAlive;
    }

    public String getFullName() {
        return fullName;
    }
}
