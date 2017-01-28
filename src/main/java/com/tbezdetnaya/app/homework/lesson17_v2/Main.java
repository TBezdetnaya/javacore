package com.tbezdetnaya.app.homework.lesson17_v2;


import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

import java.io.IOException;

/**
 * Created by Tanya on 28.01.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CSVStorage csvStorage = new CSVStorage("resources/cardindex.csv");
        csvStorage.getEmployees();
        csvStorage.getStudents();

    }
}
