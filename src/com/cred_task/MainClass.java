package com.cred_task;
import java.util.ArrayList;
import java.util.Scanner;
public class MainClass {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		//Creating customizeGame object to customize the game
		CustomizeGame customizeGame = new CustomizeGame();
		System.out.println("Enter 1 to add new strategie,enter 2 to change no. of rounds, 3 for default");
		int choice = sc.nextInt();
		// depend upon user's choice it will customize the game by using getChoice method of CustomizeGame class
		customizeGame.getChoice(choice);
		
		//Creating ArrayList and getting the information of players
		ArrayList<Player> players = Player.getPlayerDetails();
		//create player object to start the game
		Player player = new Player();
		player.startGame(players);
		player.getWinner(players);
		
		//for more details view of each players score
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
	}
}
