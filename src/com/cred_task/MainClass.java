package com.cred_task;
import java.util.ArrayList;
import java.util.Scanner;
public class MainClass {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		CustomizeGame customizeGame = new CustomizeGame();
		Strategies strategies = new Strategies();
		System.out.println("Enter 1 to add new strategie,enter 2 to change no. of rounds, 3 for default");
		int choice = sc.nextInt();
		customizeGame.getChoice(choice);
		ArrayList<Player> players = Player.getPlayerDetails();
		Player.startGame(players);
		Player.getWinner(players);
		Player.getEachSetScore(players);
//		strategies.mapping(8,2);
	}
}
