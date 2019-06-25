package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoadsTest() {
		
		System.out.println("test one line added");
	}
	
	@Test
	 public void addNewMethod()
	 {
		System.out.println("A new method addNewMethod added");
	 }

}
