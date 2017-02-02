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
    private SearchService searchService = new SearchServiceImpl(csvStudentDAO, csvEmployeeDAO);
    private static final String NAME_STUDENT = "Petr";
    private static final String SURNAME_STUDENT = "Petrov";
    private static final String FACULTY_STUDENT = "economic";
    private static final String COURSE = "3";
    private static final String NAME_EMPLOYEE = "Ivan";
    private static final String SURNAME_EMPLOYEE = "Ivanov";
    private static final String FACULTY_EMPLOYEE = "jurisprudence";
    // search check for name

    @Test
    public void testSearchPersonsBySurnameOrName() throws Exception {

        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(NAME_STUDENT);
        List<AbstractPerson> expectedPersons = personsList.resultExpectedForSearchByPersons1();
        Assert.assertEquals(expectedPersons, actualPersons);


    }
    // search person for surname
    @Test
    public void testSearchPersonsBySurnameOrName1() throws Exception {

        List<AbstractPerson> actualPersons = searchService.searchPersonsBySurnameOrName(SURNAME_STUDENT);
        List<AbstractPerson> expectedPersons = personsList.resultExpectedForSearchByPersons();
        Assert.assertEquals(expectedPersons, actualPersons);

    }
    // search student for name
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse() throws Exception {

        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(NAME_STUDENT);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    // search student for surname
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse1() throws Exception {

        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(SURNAME_STUDENT);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }
    // search student for faculty
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse2() throws Exception {

        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(FACULTY_STUDENT);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }
    // search student for course
    @Test
    public void testSearchStudentsBySurnameOrNameOrFacultyOrCourse3() throws Exception {

        List<Student> actualStudents = searchService.searchStudentsBySurnameOrNameOrFacultyOrCourse(COURSE);
        List<Student> expectedStudents = personsList.resultExpectedForSearchByStudents();
        Assert.assertEquals(expectedStudents, actualStudents);
    }

    // search employees for name
    @Test
    public void testSearchEmploeessBySurnameOrNameOrFaculty() throws Exception {
        List<Employee> actualEmeployees = searchService.searchEmploeessBySurnameOrNameOrFaculty(NAME_EMPLOYEE);
        List<Employee> expesctedEmployees = personsList.resultExpectedForSearchByEmolyee();
        Assert.assertEquals(expesctedEmployees, actualEmeployees);

    }
    //search employees for surname
    @Test
    public void testSearchEmploeessBySurnameOrNameOrFaculty1() throws Exception {

        List<Employee> actualEmeployees = searchService.searchEmploeessBySurnameOrNameOrFaculty(SURNAME_EMPLOYEE);
        List<Employee> expesctedEmployees = personsList.resultExpectedForSearchByEmolyee();
        Assert.assertEquals(expesctedEmployees, actualEmeployees);

    }
    //search employees for faculty
    @Test
    public void testSearchEmploeessBySurnameOrNameOrFaculty2() throws Exception {
        List<Employee> actualEmeployees = searchService.searchEmploeessBySurnameOrNameOrFaculty(FACULTY_EMPLOYEE);
        List<Employee> expesctedEmployees = personsList.resultExpectedForSearchByEmolyee();
        Assert.assertEquals(expesctedEmployees, actualEmeployees);

    }

}