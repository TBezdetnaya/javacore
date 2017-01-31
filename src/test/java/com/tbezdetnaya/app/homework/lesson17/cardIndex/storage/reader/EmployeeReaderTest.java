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
        Employee employeeCompare = new Employee();
        String[] data = new String[]{"4","Oleg","Petrov","engineering","-","PROFESSOR","EMPLOYEE"};
        Employee employee = employeeReader.read(data);
        employeeCompare.setId(4);
        employeeCompare.setName("Oleg");
        employeeCompare.setSurname("Petrov");
        employeeCompare.setFaculty("engineering");
        employeeCompare.setPosition(EmployeePosition.PROFESSOR);
        Assert.assertEquals(employeeCompare,employee);


    }

}