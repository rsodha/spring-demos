package com.rsodha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
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
