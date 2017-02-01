package com.tbezdetnaya.app.homework.lesson17.cardindex2.controller;

import com.tbezdetnaya.app.homework.lesson17.cardindex2.domain.AbstractPerson;
import com.tbezdetnaya.app.homework.lesson17.cardindex2.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex2.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardindex2.service.SearchService;
import java.io.IOException;
import java.util.List;
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
            System.out.println("SEARCH_PERSON");
            System.out.println("SEARCH_EMPLOYEES");
            System.out.println("SEARCH_STUDENTS");
            MenuItem item = MenuItem.valueOf((sc.next().toUpperCase()));
            switch (item){
                case SEARCH_PERSON: {
                    System.out.println("Enter one of the values: name or surname");
                    List<AbstractPerson> persons = searchService.searchPersonsBySurnameOrName(sc.next());
                    printPersonsBySurnameOrName(persons);
                }
                    break;
                case SEARCH_EMPLOYEES: {
                    System.out.println("Enter one of the values: name, surname, or faculty");
                    List<AbstractPerson> persons = searchService.searchEmploeessBySurnameOrNameOrFaculty(sc.next());
                    printEmployeesBySurnameOrNameOrFaculty(persons);
                }
                    break;
                case SEARCH_STUDENTS: {
                    System.out.println("Enter one of the values: name, surname, faculty or course");
                    List<AbstractPerson> persons = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(sc.next());
                    printStudentsBySurnameOrNameOrFacultyOrCourse(persons);
                }
                break;
            }
        }catch (Exception e){
            System.out.println("Error: invalid value");
        }


    }

    private void printPersonsBySurnameOrName(List<AbstractPerson> persons) {
        if(persons.isEmpty()) {
            System.out.println("Not found");
        }else{
            for (final AbstractPerson person : persons) {
                System.out.println(person.getName()+ " " + person.getSurname());
            }
        }
   }
    private void printStudentsBySurnameOrNameOrFacultyOrCourse(List<AbstractPerson> persons){
        Student student = new Student();
        if(persons.isEmpty()) {
            System.out.println("Not found");
        }else{
            for (final AbstractPerson person : persons) {
                System.out.println(person.getName()+ " " + person.getSurname() + ", faculty - "
                        + person.getFaculty() + "; course is " + student.getCourse() + ", type - " + student.getType());

            }
        }
    }
    private void printEmployeesBySurnameOrNameOrFaculty(List<AbstractPerson> persons){
        Employee employee = new Employee();
        if(persons.isEmpty()) {
            System.out.println("Not found");
        }else{
            for (final AbstractPerson person : persons) {
                System.out.println(person.getName()+ " " + person.getSurname() + ", faculty - "
                        + person.getFaculty()  + ", position - " + employee.getPosition()); //не выводит должность

            }
        }
    }
}
