package com.tbezdetnaya.app.classWork.lesson18;

import java.util.*;

/**
 * Created by ACER PC on 17.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        Practic practic = new Practic();
        HashSet hs = new HashSet();
        Map map = new HashMap();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Arrays.toString(practic.creatArrayList(s)));
        hs.add(s);
        map.put("key",hs);
        System.out.println(map.get("key"));

    }


}
