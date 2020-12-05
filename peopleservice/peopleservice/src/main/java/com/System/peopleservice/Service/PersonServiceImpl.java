package com.System.peopleservice.Service;
import com.System.peopleservice.Model.Person;
import com.System.peopleservice.Repo.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
	
    private final PersonRepo personRepo;
	
	
	@Autowired
	public PersonServiceImpl(PersonRepo personRepo){
	  this.personRepo = personRepo;
	}

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepo.findAll();
    }

    @Override
    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    @Override
    public List<Person> findByNameLike(String search) {
        return personRepo.findByNameLikeIgnoreCase(search);
    }

    @Override
    public List<Person> findByAboutLike(String search) {
        return personRepo.findByAboutLikeIgnoreCase(search);
    }
}
