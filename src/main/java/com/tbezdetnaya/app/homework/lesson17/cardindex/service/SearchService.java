package com.tbezdetnaya.app.homework.lesson17.cardindex.service;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.AbstractPerson;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Employee;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.Student;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public interface SearchService {
  List<AbstractPerson> searchPersonsBySurnameOrName(String input);
  List<Student> searchStudentsBySurnameOrNameOrFacultyOrCourse(String input);
  List<Employee> searchEmploeessBySurnameOrNameOrFaculty(String input);


}
