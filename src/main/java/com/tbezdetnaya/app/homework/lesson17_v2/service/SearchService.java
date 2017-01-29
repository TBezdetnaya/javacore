package com.tbezdetnaya.app.homework.lesson17_v2.service;
import com.tbezdetnaya.app.homework.lesson17_v2.domain.AbstractPerson;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public interface SearchService {
  List<AbstractPerson> searchPersonsBySurnameOrName(String input);
}
