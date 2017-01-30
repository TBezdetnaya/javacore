package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.Student;
import org.junit.Test;



/**
 * Created by tanya on 30.01.2017.
 */
public class StudentReaderTest {
    @Test
    public  void readTest (){
        StudentReader studentReader = new StudentReader();
        String[] data = new String[]{"1", "Ivan", "Ivanov", "engineering", "2", "BACHELOR", "STUDENT"};
        Student student = studentReader.read(data);
        


    }


}