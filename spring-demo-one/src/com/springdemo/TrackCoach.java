package com.springdemo;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 mins on batting pratice";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it"+fortuneService.getFortune();
	}

}
