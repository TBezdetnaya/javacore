package com.tbezdetnaya.app.classwork.lesson19;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ACER PC on 24.01.2017.
 */
public class RozetkaTest {
    FirefoxDriver driver;
    private String text = "Интернет-магазин ROZETKA™: фототехника, видеотехника, аудиотехника, компьютеры и компьютерные комплектующие";
    private String searchText = "Apple iPhone 6s";
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://rozetka.com.ua/");
    }


    @Test
    public void checkTitleTest(){
        Assert.assertTrue(driver.getTitle().contains(text));
       // Assert.assertTrue(driver.findElement(By.cssSelector("title")).getText().contains(text));//вариант 2


    }



    @Test
    public void test2(){
        driver.findElement(By.xpath(".//*[@id='rz-search']/form/div[1]/div[2]/input")).sendKeys("iphone 6s");
        driver.findElement(By.xpath(".//*[@id='rz-search']/form/span/span/button")).click();
        Assert.assertTrue(driver.getPageSource().contains(searchText));// не работает в селениуме 3.0.1,FireFox 50.1
        //Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='block_with_search']/div/div[5]/div/div/div/div/div[2]/a")).getText().contains(searchText));


    }



    @After
    public void tearDown() {
        driver.quit();
    }



}
