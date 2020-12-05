package com.system1.peoplefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@RefreshScope
@EnableDiscoveryClient
@EnableCircuitBreaker
public class PeopleFinderApplication {
	
	@LoadBalanced
	@Bean
	public RestTemplate getTemplate() { 
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(PeopleFinderApplication.class, args);
	}

}
