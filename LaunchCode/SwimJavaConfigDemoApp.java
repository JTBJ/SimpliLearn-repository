package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration java file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);	
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods... has the props values injected
		System.out.println("Email: " + theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
				
		//close context
		context.close();

	}

}
