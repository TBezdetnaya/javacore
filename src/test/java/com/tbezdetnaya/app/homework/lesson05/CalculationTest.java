package com.tbezdetnaya.app.homework.lesson05;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculationTest {
    Calculation calculation = new Calculation();

    @Test
    @FileParameters(value = "src/test/resources/FileData_1.csv", mapper = CsvWithHeaderMapper.class)//мапер пропускает первую строку в csv файле (заголовки)
    public void testCalculatorCirclArea( double expected, double radius) throws Exception {
        Assert.assertEquals(expected, calculation.calculatorCirclArea(radius),0.001);

    }

    @Test
    @FileParameters(value = "src/test/resources/FileData_3.csv", mapper = CsvWithHeaderMapper.class)
    public void testIsEvenOrOdd(double a) throws Exception {
        Assert.assertTrue(calculation.isEvenOrOdd(a));


    }

    @Test
    @FileParameters(value = "src/test/resources/FileData_2.csv", mapper = CsvWithHeaderMapper.class)
    public void testEqualsNumber(double a, double b) throws Exception {
        Assert.assertTrue("Numbers are equal", calculation.equalsNumber(a, b));


    }

    @Test
    @FileParameters(value = "src/test/resources/FileData_4.csv", mapper = CsvWithHeaderMapper.class)
    public void testAngledTriangle(double a, double b, double c) throws Exception {
        Assert.assertTrue(calculation.angledTriangle(a, b, c));

    }
}