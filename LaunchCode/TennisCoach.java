package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//registers this class as a bean with the container
@Component
public class TennisCoach implements Coach {
	
	/*@Autowired
	@Qualifier("randomFortuneService")*/
	FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside TennisCoach construtor");
	}
	
	/*@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	@Autowired
	public void setFortuneService(@Qualifier("databaseFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your back hand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside do my startup stuff");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside do my cleanup stuff");
	}

}
