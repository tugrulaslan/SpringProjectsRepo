package com.tugrulaslan.dao;

import com.tugrulaslan.domain.Person;

import java.util.List;

/**
 * Created by Tugrul on 11.02.2014.
 */
public interface PersonDAO {

    public List<Person> getAllPersons();

    public List findUserByCommonName(String commonName);
}
