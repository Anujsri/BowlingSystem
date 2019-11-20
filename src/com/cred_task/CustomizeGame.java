package com.cred_task;

import java.util.Scanner;

public class CustomizeGame {
	
	Scanner sc = new Scanner(System.in);
	Strategies strategie,strategie1;
	static int maxSet=10;
	
	CustomizeGame(){
		strategie = new Strategies();
		strategie.setStrategies("try1 + try2 == 10","spare",5);
		strategie.setStrategies("try1 == 10","strike",10);
	}
	CustomizeGame(int maxSet){
		this.maxSet = maxSet;
	}
	public void getChoice(int choice) {
		switch(choice) {
			case 1:
				System.out.println("Enter strategie name");
				String strategie_name = sc.nextLine();
				System.out.println("Enter rule eg. try1 + try2 == 10");
				String rule = sc.nextLine();
				System.out.println("Enter bonus");
				int bonus = sc.nextInt();
				strategie1.setStrategies(rule,strategie_name,bonus);
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
