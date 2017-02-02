package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;


import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;
import com.tbezdetnaya.app.homework.lesson17.cardindex.service.SearchService;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


/**
 * Created by Tanya on 01.02.2017.
 */
public class SearchServiceImplTest {
PersonsList personsList = new PersonsList();

    @Test
    public void testSearchPersonsBySurnameOrName() throws Exception {
        Employee assistant = new Employee();
        Student master = new Student();

        //employee
        assistant.setId(4);
        assistant.setName("Oleg");
        assistant.setSurname("Petrov");
        assistant.setFaculty("engineering");
        assistant.setPosition(EmployeePosition.ASSISTANT);

        //student
        master.setId(3);
        master.setName("Petr");
        master.setSurname("Petrov");
        master.setFaculty("medical");
        master.setCourse(2);
        master.setType(StudentType.MASTER);

        List<Employee> employees = personsList.listEmployee();
        List<Student> students = personsList.listStudent();

        CSVEmployeeDAO csvEmployeeDAO = new EmployeeDAOImpl(employees);
        CSVStudentDAO csvStudentDAO = new StudentDAOImpl(students);
        String data = "Petrov";

        SearchService searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(data);
        List<AbstractPerson> expectedPersons = Arrays.asList(master,assistant);
        Assert.assertEquals(expectedPersons, actualPersons);


    }

    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse() throws Exception {

    }

    @Test
    public void testSearchEmploeessBySurnameOrNameOrFaculty() throws Exception {

    }
}