package com.System.peopleservice.Controller;
import com.System.peopleservice.Model.Person;
import com.System.peopleservice.Service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
@RefreshScope
public class PersonController {

    private final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService){
	  this.personService = personService;
	}

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findAllPerson() {
        return personService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/find")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> search(@RequestParam("category") String category, @RequestParam("search") String search){
        if(category.equals("name")){
            return personService.findByNameLike("%" + search + "%");
        } else {
            return personService.findByAboutLike("%" + search + "%");
        }
    }

    @Value("${message}")
    private String name;

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    @ResponseStatus(HttpStatus.OK)
    public String returnName(){
        return name;
    }


}