package com.tbezdetnaya.app.classwork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;


public class SeleniumBuilder {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void SeleniumBuilderTest() {
        wd.get("https://www.google.com.ua/");
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).clear();
        wd.findElement(By.id("lst-ib")).sendKeys("selenium");
        wd.findElement(By.id("_fZl")).click();
        wd.findElement(By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/h3/a")).click();
    }


    @After
    public void tearDown() {
        wd.quit();
    }


    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
