package com.tbezdetnaya.app.classWork.lesson18;
import java.util.ArrayList;
/**
 * Created by ACER PC on 17.01.2017.
 */
public class Practic {

    public String[] creatArrayList (String s){

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add(s);
        String[] arr = arrList.toArray( new String[arrList.size()]);


        return arr;

    }


}
