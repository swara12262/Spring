package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach ch = context.getBean("cricketCoach",Coach.class);
		System.out.println(ch.getDailyWorkout());
		System.out.println(ch.getDailyFortune());
		context.close();

	}

}
