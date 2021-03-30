package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from container
		Coach ch  = context.getBean("myCoach",Coach.class);
		
		//call methods on bean
		System.out.print(ch.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
