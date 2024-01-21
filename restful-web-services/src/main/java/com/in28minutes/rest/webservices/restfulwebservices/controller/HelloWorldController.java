package com.in28minutes.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.beans.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";

	}

//	@GetMapping(path="/hello-world-bean")
//	public HelloWorldBean helloWorldBean() {
//		return new HelloWorldBean ("Hello World!!");}
	
	//Path variable
	// /user/{id}/todos/{id} => /users/2/todos/200
	// /hello-world/path-variable-/{name}
	//hello-world/path-variable/Jonty
	
		
//	@GetMapping(path="/hello-world-bean/path-variable/{name}")
//	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {		
//		return new HelloWorldBean(String.format("Hello world, %s",name)); //another way using string format
//		//return new HelloWorldBean("Hello World!!" + name);// one way of using name in path variable

	}


