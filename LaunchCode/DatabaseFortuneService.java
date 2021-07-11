package com.luv2code.springdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	
	String[] stringArr;
	String temp = "";
	
	public DatabaseFortuneService() {
		
		System.out.println("Inside DatabaseFortuneService");
		
	}

	@Override
	public String getFortune() {
		
		File file = new File("randomFortunes.txt");
		
		try (Scanner console = new Scanner(new FileReader(file))){
			while(console.hasNextLine()) {
//				temp = temp + console.nextLine() + "\n";
//				stringArr = temp.split("\n");
				System.out.println(console.nextLine());
			}
		}catch(IOException e) {
			e.toString();
		}
		
		Random myRandom = new Random();
//		stringArr = temp.split("\n");
//		String value = stringArr[myRandom.nextInt(stringArr.length)];
		return "";
	}

}
