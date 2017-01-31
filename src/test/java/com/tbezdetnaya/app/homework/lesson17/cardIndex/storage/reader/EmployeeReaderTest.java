package com.tbezdetnaya.app.homework.lesson17.cardindex.storage.reader;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

/**
 * Created by tanya on 30.01.2017.
 */
public class EmployeeReaderTest {

    @Test
    public void testRead() throws IOException {
        EmployeeReader employeeReader = new EmployeeReader();
        Employee expectedEmployee = new Employee();
        String[] data = new String[]{"4","Oleg","Petrov","engineering","-","PROFESSOR","EMPLOYEE"};
        Employee actualEmployee = employeeReader.read(data);
        expectedEmployee.setId(4);
        expectedEmployee.setName("Oleg");
        expectedEmployee.setSurname("Petrov");
        expectedEmployee.setFaculty("engineering");
        expectedEmployee.setPosition(EmployeePosition.PROFESSOR);
        Assert.assertEquals(expectedEmployee,actualEmployee);


    }

}