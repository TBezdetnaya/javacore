package com.tbezdetnaya.app.classWork.lesson15;

/**
 * Created by ACER PC on 10.01.2017.
 */
public class Teacher  {
    private String university;

    public Teacher(String name, String university) {

        //super(name);

        this.university = university;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        return university != null ? university.equals(teacher.university) : teacher.university == null;

    }

    @Override
    public int hashCode() {
        return university != null ? university.hashCode() : 0;
    }

    public String lessonFinished() {

        return "Do not forget to make homework!";
    }


}
