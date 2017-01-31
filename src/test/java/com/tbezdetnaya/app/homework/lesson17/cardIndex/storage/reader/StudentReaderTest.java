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
        Student studentCompare = new Student();
        String[] data = new String[]{"1", "Ivan", "Ivanov", "engineering", "2", "BACHELOR", "STUDENT"};
        Student student = studentReader.read(data);
        studentCompare.setId(1);
        studentCompare.setName("Ivan");
        studentCompare.setSurname("Ivanov");
        studentCompare.setFaculty("engineering");
        studentCompare.setCourse(2);
        studentCompare.setType(StudentType.BACHELOR);
        Assert.assertEquals(studentCompare,student);


    }


}