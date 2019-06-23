package com.rsodha;

public class TennisCoach implements Coach {
	private FortuneService fortuneService;

	public TennisCoach(FortuneService sadFortuneService) {
		this.fortuneService = sadFortuneService;
	}

	@Override
	public String getWO() {
		return "Practice tennis";
	}

	@Override
	public String getFn() {
		return fortuneService.getFn();
	}

}
