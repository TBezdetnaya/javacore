package com.tbezdetnaya.app.homework.lesson17_v2.controller;

import com.tbezdetnaya.app.homework.lesson17_v2.domain.MenuItem;
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
            System.out.println("SEARCH_PERSONS");
            System.out.println("SEARCH_EMPLOYEE");
            System.out.println("SEARCH_STUDENT");
            MenuItem item = MenuItem.valueOf((sc.next().toUpperCase()));
            switch (item){
                case SEARCH_PERSONS:
                    System.out.println("Enter one of the values: name or surname");
                    searchService.searchPersonsBySurnameOrName(sc.next());
                    break;
                case SEARCH_EMPLOYEE:
                    System.out.println("Enter one of the values: name,surname, or faculty");
                    break;
                case SEARCH_STUDENT:
                    System.out.println("Enter one of the values: name,surname,faculty or course");
                    break;


            }
        }catch (Exception e){
            System.out.println();
        }


    }



    private void printPersonsBySurnameOrName() {
    }
}
