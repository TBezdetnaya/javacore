package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;


import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;
import com.tbezdetnaya.app.homework.lesson17.cardindex.service.SearchService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Tanya on 01.02.2017.
 */
public class SearchServiceImplTest {


    @Test
    public void testSearchPersonsBySurnameOrName() throws Exception {
        Employee professor = new Employee();
        Employee assistant = new Employee();
        Student bachelor = new Student();
        Student master = new Student();

        //employee
        professor.setId(1);
        professor.setName("Ivan");
        professor.setSurname("Ivanov");
        professor.setFaculty("engineering");
        professor.setPosition(EmployeePosition.PROFESSOR);

        assistant.setId(4);
        assistant.setName("Oleg");
        assistant.setSurname("Petrov");
        assistant.setFaculty("engineering");
        assistant.setPosition(EmployeePosition.ASSISTANT);

        //student
        bachelor .setId(2);
        bachelor .setName("Fedor");
        bachelor .setSurname("Fedorov");
        bachelor .setFaculty("medical");
        bachelor .setCourse(2);
        bachelor .setType(StudentType.BACHELOR);

        master.setId(3);
        master.setName("Petr");
        master.setSurname("Petrov");
        master.setFaculty("medical");
        master.setCourse(2);
        master.setType(StudentType.MASTER);

        List<Employee> employees = Arrays.asList(professor, assistant);
        List<Student> students = Arrays.asList(bachelor, master);

        CSVEmployeeDAO csvEmployeeDAO = new EmployeeDAOImpl(employees);
        CSVStudentDAO csvStudentDAO = new StudentDAOImpl(students);
        String data = "Petr";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(data);
        List<AbstractPerson> expectedPersons = Arrays.asList(master);
        Assert.assertEquals(expectedPersons, actualPersons);


    }
}