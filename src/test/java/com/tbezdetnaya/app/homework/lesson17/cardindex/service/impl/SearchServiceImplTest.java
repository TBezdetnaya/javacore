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
    private ParameterTest personsList = new ParameterTest();
    private List<Employee> employees = personsList.listEmployee();
    private List<Student> students = personsList.listStudent();
    private CSVEmployeeDAO csvEmployeeDAO = new EmployeeDAOImpl(employees);
    private CSVStudentDAO csvStudentDAO = new StudentDAOImpl(students);

    // search check for surname

    @Test
    public void testSearchPersonsBySurnameOrName() throws Exception {

        String data = "Petrov";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(data);
        List<AbstractPerson> expectedPersons = personsList.resultExpectedForSearchByPersons();
        Assert.assertEquals(expectedPersons, actualPersons);


    }
    // search person for name
    @Test
    public void testSearchPersonsBySurnameOrName1() throws Exception {

        String data = "Petr";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO,csvEmployeeDAO);
        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(data);
        List<AbstractPerson> expectedPersons = personsList.resultExpectedForSearchByPersons1();
        Assert.assertEquals(expectedPersons, actualPersons);

    }
    // search student for name
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse() throws Exception {
        String data = "Petr";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(data);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    // search student for surname
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse1() throws Exception {
        String data = "Petrov";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(data);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }
    // search student for faculty
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse2() throws Exception {
        String data = "Economic";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(data);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }
    // search student for course
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse3() throws Exception {
        String data = "3";
        SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(data);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    @Test
    public void testSearchEmploeessBySurnameOrNameOrFaculty() throws Exception {

    }
}