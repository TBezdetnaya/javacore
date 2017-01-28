package com.tbezdetnaya.app.homework.lesson17_v2.domain;

/**
 * Created by Tanya on 27.01.2017.
 */
public class Employee extends AbstractPerson {
    private EmployeePosition position;

    public Employee(String line) {

    }

    public Employee() {

    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Employee employee = (Employee) o;

        return position == employee.position;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
