package com.tbezdetnaya.app.homework.lesson17_v2.storage;

import com.tbezdetnaya.app.homework.lesson17_v2.domain.AbstractPerson;

/**
 * Created by Tanya on 28.01.2017.
 */
public abstract class AbstractPersonReader<T extends AbstractPerson>{
    protected void fillPerson (String []data, T person) {

        person.setName(data[0]);
        person.setSurname(data[1]);
        person.setFaculty(data[2]);


    }

    public abstract T read(String[] data);
}

