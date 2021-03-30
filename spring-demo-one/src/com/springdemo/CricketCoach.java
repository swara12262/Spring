package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("Inside cricket no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside cricket setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 1 hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "InCricket " + fortuneService.getFortune();
	}

}
