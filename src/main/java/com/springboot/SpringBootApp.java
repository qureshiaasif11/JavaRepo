package com.springboot;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.*;
@SpringBootApplication
@ComponentScan(basePackages="com.springboot.controller")
public class SpringBootApp {
	public static void main(String[] args) 
        {
		System.out.println("it is woring");
		 SpringApplication.run(SpringBootApp.class, args);
	}
}
