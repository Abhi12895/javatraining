package com.tcs.restclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day13BootRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day13BootRestClientApplication.class, args);
	}
    
	
	@Bean//it will produce one object
	protected RestTemplate build() {
		return new RestTemplate();
	}
}
