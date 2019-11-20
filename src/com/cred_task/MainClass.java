package com.cred_task;
import java.util.ArrayList;
import java.util.Scanner;
public class MainClass {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		CustomizeGame customizeGame = new CustomizeGame();
		Player player = new Player();
		System.out.println("Enter 1 to add new strategie,enter 2 to change no. of rounds, 3 for default");
		int choice = sc.nextInt();
		customizeGame.getChoice(choice);
		ArrayList<Strategies> array = Strategies.getStrategies();
		for(Strategies strategie : array) {
			System.out.println("Array is "+ strategie.bonus);
		}
		
		ArrayList<Player> players = Player.getPlayerDetails();
		player.startGame(players);
		player.getWinner(players);
		System.out.println("Do you want see each player's each set score (Yes/No)");
		sc.nextLine();
		String user_choice = sc.nextLine();
		System.out.println(user_choice);
		if(user_choice.equalsIgnoreCase("Yes")) {
			Player.getEachSetScore();
		}
		else{
			System.exit(0);
		}
//		strategies.mapping(8,2);
	}
}
