package com.tbezdetnaya.app.homework.lesson17_v2;



import com.tbezdetnaya.app.homework.lesson17_v2.dao.impl.CSVEmployeeDAOImpl;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.impl.CSVStudentDAOImpl;
import com.tbezdetnaya.app.homework.lesson17_v2.service.impl.SearchServiceImpl;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Tanya on 28.01.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        CSVStorage csvStorage = new CSVStorage("resources/cardindex.csv");
        CSVStudentDAOImpl csvStudentDAO = new CSVStudentDAOImpl(csvStorage);
        CSVEmployeeDAOImpl csvEmployeeDAO = new CSVEmployeeDAOImpl(csvStorage);
        SearchServiceImpl searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        System.out.println("Enter one of the values: name or surname");
        searchService.searchSurnameOrName(sc.next());




    }
}
