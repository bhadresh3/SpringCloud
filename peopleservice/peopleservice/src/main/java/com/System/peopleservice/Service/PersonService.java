package com.System.peopleservice.Service;
import com.System.peopleservice.Model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person addPerson(Person person);

    List<Person> findByNameLike(String search);

    List<Person> findByAboutLike(String search);
}
