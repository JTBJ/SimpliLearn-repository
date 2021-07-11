package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionCoach implements Coach {
	
	/*@Autowired*/
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Custom build class to work with field injection";
	}

	@Override
	public String getDailyFortune() {
		return "You will be a full stack developer in no time at this paste";
	}

}
