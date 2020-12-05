package com.System.peopleservice.Repo;

import com.System.peopleservice.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {

    List<Person> findByNameLikeIgnoreCase(String search);

    List<Person> findByAboutLikeIgnoreCase(String search);
}
