package com.system1.peoplefinder.Service;

import com.system1.peoplefinder.Model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value="peopleservice", fallback=PersonServiceFallback.class)
public interface PeopleService {

    @GetMapping("/people")
    List<Person> findAll();
}
