package com.cred_task;

import java.util.Scanner;

public class CustomizeGame {
	
	Scanner sc = new Scanner(System.in);
	Strategies strategies = new Strategies();
	int maxSet=10;
	CustomizeGame(int maxSet){
		this.maxSet = maxSet;
	}
	CustomizeGame(){
		strategies.setStrategies(10,0,10,"strike");
		strategies.setStrategies(5,5,5,"spare");
	}
	public void getChoice(int choice) {
		switch(choice) {
			case 1:
				System.out.println("Enter inputs to create stratgy");
				System.out.println("Enter first value");
				int input1 = sc.nextInt();
				System.out.println("Enter second value");
				int input2 = sc.nextInt();
				System.out.println("Enter bonus");
				int bonus = sc.nextInt();
				System.out.println("Enter strategie name");
				sc.nextLine();
				String strategie_name = sc.nextLine();
				strategies.setStrategies(input1,input2,bonus,strategie_name);
				break;
			case 2:
				System.out.println("Enter number of set");
				maxSet = sc.nextInt();
				new CustomizeGame(maxSet);
				break;
			default:
				System.out.println("will take default values");

		}
	}
}
