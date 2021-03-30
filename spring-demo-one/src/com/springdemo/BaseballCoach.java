package com.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 mins on batting pratice";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
