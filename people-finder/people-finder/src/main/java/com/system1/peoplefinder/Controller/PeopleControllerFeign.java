package com.system1.peoplefinder.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.system1.peoplefinder.Model.Person;
import com.system1.peoplefinder.Service.PeopleService;

@RestController
@RequestMapping("/feign/people")
public class PeopleControllerFeign {
	@Autowired
	PeopleService peopleservice;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Person> getAll(){
		
		return this.peopleservice.findAll();
		
	}
	

}
