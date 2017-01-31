package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.StudentType;
import org.junit.Assert;
import org.junit.Test;



/**
 * Created by tanya on 30.01.2017.
 */
public class StudentReaderTest {

    @Test
    public  void testRead (){
        StudentReader studentReader = new StudentReader();
        Student studentForCompare = new Student();
        String[] data = new String[]{"1", "Ivan", "Ivanov", "engineering", "2", "BACHELOR", "STUDENT"};
        Student student = studentReader.read(data);
        studentForCompare.setId(1);
        studentForCompare.setName("Ivan");
        studentForCompare.setSurname("Ivanov");
        studentForCompare.setFaculty("engineering");
        studentForCompare.setCourse(2);
        studentForCompare.setType(StudentType.BACHELOR);
        Assert.assertEquals(studentForCompare,student);


    }


}