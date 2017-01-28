package com.tbezdetnaya.app.homework.lesson17_v2.domain;

/**
 * Created by Tanya on 27.01.2017.
 */
public class Student extends AbstractPerson {
    private int course;
    private StudentType type;

    public Student(String line) {

    }

    public Student() {

    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return type == student.type;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + course;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
