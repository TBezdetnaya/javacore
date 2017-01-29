package com.tbezdetnaya.app.homework.lesson17_v2;



import com.tbezdetnaya.app.homework.lesson17_v2.controller.ApplicationController;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.impl.CSVEmployeeDAOImpl;
import com.tbezdetnaya.app.homework.lesson17_v2.dao.impl.CSVStudentDAOImpl;
import com.tbezdetnaya.app.homework.lesson17_v2.service.SearchService;
import com.tbezdetnaya.app.homework.lesson17_v2.service.impl.SearchServiceImpl;
import com.tbezdetnaya.app.homework.lesson17_v2.storage.CSVStorage;

import java.io.IOException;



/**
 * Created by Tanya on 28.01.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CSVStorage csvStorage = new CSVStorage("resources/cardindex.csv");
        CSVEmployeeDAO csvEmployeeDAO = new CSVEmployeeDAOImpl(csvStorage);
        CSVStudentDAO csvStudentDAO = new CSVStudentDAOImpl(csvStorage);
        SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
        ApplicationController applicationController = new ApplicationController(searchService);
        applicationController.start();







    }
}
