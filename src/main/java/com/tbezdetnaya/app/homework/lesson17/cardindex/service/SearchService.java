package com.tbezdetnaya.app.homework.lesson17.cardindex.service;
import com.tbezdetnaya.app.homework.lesson17.cardindex.domain.AbstractPerson;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public interface SearchService {
  List<AbstractPerson> searchPersonsBySurnameOrName(String input);
  List<AbstractPerson> searchStudentsBySurnameOrNameOrFacultyOrCourse(String input);
  List<AbstractPerson> searchEmploeessBySurnameOrNameOrFaculty(String input);


}
