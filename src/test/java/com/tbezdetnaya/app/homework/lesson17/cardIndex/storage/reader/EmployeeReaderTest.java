package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;

import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.*;
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
        Employee employeeForCompare = new Employee();
        String[] data = new String[]{"4","Oleg","Petrov","engineering","-","PROFESSOR","EMPLOYEE"};
        Employee employee = employeeReader.read(data);
        employeeForCompare.setId(4);
        employeeForCompare.setName("Oleg");
        employeeForCompare.setSurname("Petrov");
        employeeForCompare.setFaculty("engineering");
        employeeForCompare.setPosition(EmployeePosition.PROFESSOR);
        Assert.assertEquals(employeeForCompare,employee);


    }

}