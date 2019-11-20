package com.cred_task;
import java.util.Scanner;
/** The purpose of this class to customize the Bowling Alley game like in problem statement we have given two
* strategies and set size 2 but by this class based on user's choice we can add more strategies and can change set size*/
public class CustomizeGame {
	
	Scanner sc = new Scanner(System.in);
	
	/** creating strategies object to add new strategies or initialize default strategies i.e spare and strike*/
	Strategies strategies = new Strategies();
	int maxSet=10; /** Default value of number of set */
	
	/** constructor to change set value based on user's choice*/
	CustomizeGame(int maxSet){
		this.maxSet = maxSet;
	}
	
	/** constructor to create and inialize the default Strategies*/
	CustomizeGame(){
		strategies.setStrategies(10,0,10,"strike");
		strategies.setStrategies(5,5,5,"spare");
	}
	
	/** method to customize the game based on the user's choice */
	public void getChoice(int choice) {
		switch(choice) {
			/** case to create new Strategies*/
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
				
			/** case to change set size */
			case 2:
				System.out.println("Enter number of set");
				maxSet = sc.nextInt();
				new CustomizeGame(maxSet);
				break;
				
			/** will take default values*/	
			default:
				System.out.println("will take default values");

		}
	}
}
