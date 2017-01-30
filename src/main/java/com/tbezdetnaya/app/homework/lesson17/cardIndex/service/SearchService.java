package com.tbezdetnaya.app.homework.lesson17.cardIndex.service;
import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.AbstractPerson;

import java.util.List;

/**
 * Created by Tanya on 28.01.2017.
 */
public interface SearchService {
  List<AbstractPerson> searchPersonsBySurnameOrName(String input);


}
