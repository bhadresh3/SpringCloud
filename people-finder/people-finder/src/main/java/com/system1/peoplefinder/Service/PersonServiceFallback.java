package com.system1.peoplefinder.Service;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.system1.peoplefinder.Model.Person;

@Component
public class PersonServiceFallback implements PeopleService{

	public List<Person> findAll(){
		Person p = new Person(1, "default user",0,0,"nothing");
		return Collections.singletonList(p);
	}
}
