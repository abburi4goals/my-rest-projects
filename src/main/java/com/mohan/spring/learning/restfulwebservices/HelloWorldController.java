package com.mohan.spring.learning.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

	//GET - Method
	//URI
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Helloo World Mohan Version 1";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("This is Helloworld Bean ");
	}
	
	@GetMapping(path = "/hello-world/{name}")
	public String helloWorkdBeanPathVariable(@PathVariable String name){
		return "This is Path Variable";
	}
}
