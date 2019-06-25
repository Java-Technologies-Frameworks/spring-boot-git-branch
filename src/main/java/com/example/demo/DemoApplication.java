package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main1(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public void amain()
	{
		System.out.println("Test a main method for new branch");
	}

}
