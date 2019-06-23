package com.rsodha;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Track coach workout";
	}

	@Override
	public String getDailyFortune() {
		return "Track coach - " + fortuneService.getFortune();
	}
}
