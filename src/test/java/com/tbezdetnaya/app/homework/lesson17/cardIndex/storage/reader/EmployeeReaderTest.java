package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tanya on 30.01.2017.
 */
public class EmployeeReaderTest {
    @Test
    public void readTest() {
        EmployeeReader employeeReader = new EmployeeReader();
        String[] data = {"1", "Ivan", "Ivanov", "engineering", "-", "PROFESSOR", "EMPLOYEE"};
        employeeReader.read(data);
        Assert.assertNotNull(employeeReader);

    }

}