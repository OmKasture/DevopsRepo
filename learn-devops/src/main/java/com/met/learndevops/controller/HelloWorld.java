package com.met.learndevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	
	
	
//	public   HelloWorld(MessageSource messageSource) {
//		this.messageSource=messageSource;
//	}
	
	@GetMapping( path = "/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping( path = "/hello-world")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean ("Hello World");
	}

}
