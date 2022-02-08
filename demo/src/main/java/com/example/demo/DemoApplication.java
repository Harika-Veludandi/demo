package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.Person;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // bootstraps the spring application
	}

	private Person person;

	@Autowired
	public DemoApplication(Person person) {
		this.person = person;
	}

	@GetMapping("/person")
	public String getDetails() {
		return person.getName();
	}
}
