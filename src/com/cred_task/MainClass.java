package com.cred_task;
import java.util.ArrayList;
import java.util.Scanner;
/**
* The program implements an application that
* will give us the winner of Bowling Alley Game.
*
* @author  Anuj Srivastava
* @version 1.0
* @since   2019-11-19
*/
public class MainClass {
	
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		/**Creating customizeGame object to customize the game */
		CustomizeGame customizeGame = new CustomizeGame();
		
		/** depend upon user's choice it will customize the game by using getChoice method of CustomizeGame class */
		System.out.println("Enter 1 to add new strategie,enter 2 to change no. of rounds, 3 for default");
		int choice = sc.nextInt();
		customizeGame.getChoice(choice);
		
		/**Creating ArrayList and getting the information of players */
		ArrayList<Player> players = Player.getPlayerDetails();
		
		/**create player object to start the game */
		Player player = new Player();
		player.startGame(players); /** calling startGame method of Player class to start the game */
		player.getWinner(players); /** Calling getWinner method of Player class to get winner of game */
		
		/** for more details view of each players score */
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
