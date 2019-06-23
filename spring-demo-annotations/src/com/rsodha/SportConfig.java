package com.rsodha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	@Bean
	public FortuneService sadFortuneService() {
		return new HappyFortuneService2();
	}

	@Bean
	public Coach swimCoach() {
		return new TennisCoach(sadFortuneService());
	}
}
