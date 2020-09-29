package com.example.mvc_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MvcDemoApplication {
	public static void main(String[] args) {
		System.out.println("::::::::::MAIN CLASS:::::::");
		SpringApplication.run(MvcDemoApplication.class, args);
	}

}
