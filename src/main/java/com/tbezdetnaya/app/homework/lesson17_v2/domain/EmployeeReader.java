package com.tbezdetnaya.app.homework.lesson17_v2.domain;

/**
 * Created by Tanya on 28.01.2017.
 */
public class EmployeeReader extends AbstractPersonReader<Employee> {

    @Override
    public Employee read(final String[] data) {
        final Employee employee = new Employee();
        fillPerson(data, employee);
        employee.setPosition(EmployeePosition.valueOf(data[4]));

        return employee;
    }
}