package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;

import org.junit.Assert;
import org.junit.Test;



/**
 * Created by tanya on 30.01.2017.
 */
public class StudentReaderTest {
    @Test
    public  void readTest (){
        StudentReader studentReader = new StudentReader();
        String [] data = {"1","Ivan","Ivanov","engineering","2","BACHELOR","STUDENT"};
        studentReader.read(data);
        Assert.assertNotNull(studentReader);
    }


}