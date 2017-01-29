package com.tbezdetnaya.app.homework.lesson17_v2.controller;

import com.tbezdetnaya.app.homework.lesson16.MenuItem;
import com.tbezdetnaya.app.homework.lesson17_v2.service.SearchService;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tanya on 29.01.2017.
 */
public class ApplicationController {
    private final  SearchService searchService;

    public ApplicationController(SearchService searchService) {
        this.searchService = searchService;
    }
    public void start() throws IOException {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Choose search category:");
            System.out.println("Task1 - Search all cards");
            System.out.println("Task2 - Search employees");
            System.out.println("Task3 - Search students");
            MenuItem item = MenuItem.valueOf((sc.next().toUpperCase()));
            switch (item){
                case TASK1:
                    System.out.println("Enter one of the values: name or surname");
                    searchService.searchPersonsBySurnameOrName(sc.next());
                    break;
                case TASK2:
                    System.out.println("Enter one of the values: name or surname or faculty");
                    break;
                case TASK3:
                    System.out.println("Enter one of the values: name or surname or faculty or course");
                    break;


            }
        }catch (Exception e){
            System.out.println();
        }


    }



    private void printPersonsBySurnameOrName() {
    }
}
