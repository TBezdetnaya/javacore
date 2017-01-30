package com.tbezdetnaya.app.homework.lesson17.cardIndex.storage.reader;

import com.tbezdetnaya.app.homework.lesson17.cardIndex.domain.AbstractPerson;

/**
 * Created by Tanya on 28.01.2017.
 */
public abstract class AbstractPersonReader<T extends AbstractPerson>{
    protected void fillPerson (String []data, T person) {

        person.setName(data[1]);
        person.setSurname(data[2]);
        person.setFaculty(data[3]);


    }

    public abstract T read(String[] data);
}

