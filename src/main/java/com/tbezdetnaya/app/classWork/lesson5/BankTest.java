package com.tbezdetnaya.app.classWork.lesson5;

import org.junit.*;
import org.junit.runners.MethodSorters;


/**
 * Created by ACER PC on 18.11.2016.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankTest {

    static Bank privatbank;

    @BeforeClass

    public static void precondition(){
        privatbank = new Bank("Privatbank");
        System.out.println("Test ClASS was started.");
    }

    @Before
    public void messageStart(){
        System.out.println("\nTest started.");
    }
    @After
    public void messageEnd(){
        System.out.println("Test fihished.");
    }


    @Test
    public void testIsLoanBuUssed() throws Exception {
        Person student = new Person();
        student.setAge(19);
        student.setSalary(4200);
        student.setWorkFlag(true);
        student.setWorkingTime(2);


        Assert.assertTrue(privatbank.isLoanCanBeIssued(student));
    }
    @Ignore("rrrrrrr")
    @Test(timeout = 3000)
    public void checkPensioner(){
        Person pensioner = new Person();
        pensioner.setAge(45);
        pensioner.setSalary(7200);
        pensioner.setWorkingTime(25);


        Assert.assertTrue(privatbank.isLoanCanBeIssued(pensioner));



    }

}