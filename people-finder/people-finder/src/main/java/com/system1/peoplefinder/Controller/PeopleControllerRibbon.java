package com.system1.peoplefinder.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.system1.peoplefinder.Model.Person;
import com.system1.peoplefinder.Service.PeopleService;

//@RestController
//@RequestMapping("/ribbon/people")
public class PeopleControllerRibbon {

	@Autowired
    RestTemplate resttemplate;
    

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findAllPerson() {
        ResponseEntity<List<Person>> peopleResponse = this.resttemplate.exchange("http://PEOPLESERVICE/people", 
        							HttpMethod.GET,
        							null,
        							new ParameterizedTypeReference<List<Person>>() {});
        return peopleResponse.getBody();
    }

}
