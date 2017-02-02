package com.tbezdetnaya.app.homework.lesson17.cardindex.service.impl;


import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVEmployeeDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.dao.CSVStudentDAO;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.*;
import com.tbezdetnaya.app.homework.lesson17.cardindex.service.SearchService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


/**
 * Created by Tanya on 01.02.2017.
 */
public class SearchServiceImplTest {
ParameterTest personsList = new ParameterTest();
    // search check for surname

    @Test
    public void testSearchPersonsBySurnameOrName() throws Exception {

        List<Employee> employees = personsList.listEmployee();
        List<Student> students = personsList.listStudent();

        CSVEmployeeDAO csvEmployeeDAO = new EmployeeDAOImpl(employees);
        CSVStudentDAO csvStudentDAO = new StudentDAOImpl(students);
        String data = "Petrov";

        SearchService searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(data);
        List<AbstractPerson> expectedPersons = personsList.resultExpectedForSearchByPersons();
        Assert.assertEquals(expectedPersons, actualPersons);


    }
    // search person for name
    @Test
    public void testSearchPersonsBySurnameOrName1() throws Exception {

        List<Employee> employees = personsList.listEmployee();
        List<Student> students = personsList.listStudent();

        CSVEmployeeDAO csvEmployeeDAO = new EmployeeDAOImpl(employees);
        CSVStudentDAO csvStudentDAO = new StudentDAOImpl(students);
        String data = "Petr";

        SearchService searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(data);
        List<AbstractPerson> expectedPersons = personsList.resultExpectedForSearchByPersons1();
        Assert.assertEquals(expectedPersons, actualPersons);

    }


    // search student for surname
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse() throws Exception {
        String data = "Petrov";
        List<Student> students = personsList.listStudent();
        List<Employee> employees = personsList.listEmployee();
        CSVStudentDAO csvStudentDAO = new StudentDAOImpl(students);
        CSVEmployeeDAO csvEmployeeDAO = new EmployeeDAOImpl(employees);

        SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(data);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testSearchEmploeessBySurnameOrNameOrFaculty() throws Exception {

    }
}