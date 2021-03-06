package com.tbezdetnaya.app.homework.lesson17.cardindex.controller;

import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.AbstractPerson;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;
import com.tbezdetnaya.app.homework.lesson17.cardindex.service.SearchService;
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
            System.out.println("SEARCH_PERSONS");
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
                    List<Employee> persons = searchService.searchEmploeessBySurnameOrNameOrFaculty(sc.next());
                    printEmployeesBySurnameOrNameOrFaculty(persons);
                }
                    break;
                case SEARCH_STUDENTS: {
                    System.out.println("Enter one of the values: name, surname, faculty or course");
                    List<Student> persons = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(sc.next());
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
    private void printStudentsBySurnameOrNameOrFacultyOrCourse(List<Student> students){
        if(students.isEmpty()) {
            System.out.println("Not found");
        }else{
            for (final Student student: students) {
                System.out.println(student.getName()+ " " + student.getSurname() + ", faculty - "
                        + student.getFaculty() + "; course is " + student.getCourse() + ", type - " + student.getType());

            }
        }
    }
    private void printEmployeesBySurnameOrNameOrFaculty(List<Employee> employees){
        if(employees.isEmpty()) {
            System.out.println("Not found");
        }else{
            for (final Employee employee: employees) {
                System.out.println(employee.getName()+ " " + employee.getSurname() + ", faculty - "
                        + employee.getFaculty()  + ", position - " + employee.getPosition());

            }
        }
    }
}
