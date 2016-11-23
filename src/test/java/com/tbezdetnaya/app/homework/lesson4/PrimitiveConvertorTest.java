package com.tbezdetnaya.app.homework.lesson4; /**
 * Created by Tanya on 13.11.2016.
 */

import org.junit.Assert;
import org.junit.Test;

public class PrimitiveConvertorTest {

    PrimitiveConvertor convertor = new PrimitiveConvertor();

    @Test

    public void unitTest01 (){

        int intVariable  = convertor.getIntVariable();
        char expectedResult = convertor.getExpectedCharResult();
        char actualResult = convertor.getIntToChar(intVariable);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void unitTest02(){

        float floatVariable = convertor.getFloatVariable();
        char expectedResult = convertor.getExpectedCharResult();
        char actualResult = convertor.getFloatToChar(floatVariable);
        Assert.assertEquals(expectedResult, actualResult);


    }

    @Test

    public void unitTest03(){
        char charVeriable = convertor.getCharVeriable();
        int expectedResult = convertor.getExpectedIntResult();
        int actualResult = convertor.getCharToInt(charVeriable);
        Assert.assertNotEquals(expectedResult, actualResult);

    }


    @Test

    public void unitTest04 (){

        long longVeriable = 922337203L;
        int expectedResult = 2147483647;
        int actualResult = (int)convertor.getLongToInt(longVeriable);
        Assert.assertNotEquals( expectedResult, actualResult);



    }


}



