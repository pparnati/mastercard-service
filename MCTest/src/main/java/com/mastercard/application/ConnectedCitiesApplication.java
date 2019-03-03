package com.mastercard.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.mastercard"})
public class ConnectedCitiesApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ConnectedCitiesApplication.class, args);
	}

}
