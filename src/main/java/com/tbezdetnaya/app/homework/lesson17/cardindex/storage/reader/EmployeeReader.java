package com.tbezdetnaya.app.homework.lesson17.cardindex.storage.reader;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.EmployeePosition;

/**
 * Created by Tanya on 28.01.2017.
 */
public class EmployeeReader extends AbstractPersonReader<Employee> {

    @Override
    public Employee read(final String[] data) {
        final Employee employee = new Employee();
        fillPerson(data, employee);
        employee.setPosition(EmployeePosition.valueOf(data[5]));

        return employee;
    }
}