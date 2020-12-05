package com.System.peopleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class PeopleserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleserviceApplication.class, args);
	}
	

}
