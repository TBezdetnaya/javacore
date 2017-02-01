package com.tbezdetnaya.app.homework.lesson17.cardindex.storage.reader;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.StudentType;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by tanya on 30.01.2017.
 */
public class StudentReaderTest {

    @Test
    public  void testRead (){
        StudentReader studentReader = new StudentReader();
        Student expectedStudent = new Student();
        String[] data = new String[]{"1", "Ivan", "Ivanov", "engineering", "2", "BACHELOR", "STUDENT"};

        expectedStudent.setId(1);
        expectedStudent.setName("Ivan");
        expectedStudent.setSurname("Ivanov");
        expectedStudent.setFaculty("engineering");
        expectedStudent.setCourse(2);
        expectedStudent.setType(StudentType.BACHELOR);

        Student actualStudent = studentReader.read(data);
        Assert.assertEquals(expectedStudent,actualStudent);


    }


}