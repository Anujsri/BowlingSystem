package com.cred_task;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Player {
	private int id;
	private String name;
	private int totalScore;
	private Bowling bowling;
	private int each_set_score;
	Hashtable<Integer,Player> hm = new Hashtable<Integer,Player>();
	Player(){}
	public Player( int id, String name )
	{
		this.id = id;
		this.name = name;
		this.totalScore = 0;
	}
	Player(int id,Bowling bowling,int each_set_score){
		this.id = id;
		this.bowling = bowling;
		this.each_set_score = each_set_score;
	}
	Player(Player player){
		this.id = player.id;
		this.name = player.name;
		this.totalScore = player.totalScore;
	}
	public void addScore( int score )
	{
		this.totalScore += score;
	}
	public int getScore() {
		return totalScore;
	}
	
	public static ArrayList<Player> getPlayerDetails()
	{
		ArrayList<Player> players = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of players.");
		int count = sc.nextInt();
		sc.nextLine();
		int player_id = 1;
		for ( int i = 0; i < count; i++ )
		{
			System.out.println("Enter the player name.");
			String name = sc.nextLine();
			players.add(new Player(player_id, name));
			player_id++;
		}
		
		return players;	
	}
	public void startGame(ArrayList<Player> players) {
		Bowling bowling = new Bowling();
		CustomizeGame customizeGame = new CustomizeGame();
		Bowling round_array[];
		int maxSet = customizeGame.maxSet;
		System.out.println("maxSet in pka : "+ maxSet);
		bowling.round_array = new Bowling[maxSet];
		for(Player player : players) {
			round_array = bowling.addPoints(maxSet);
			int total = bowling.get_Score(round_array,player.id);
			player.addScore(total);
			System.out.println("Player id : "+player.id + " Name : "+player.name + " Score " + player.getScore());
		}
	}
	public void getWinner(ArrayList<Player> players) {
		int maximum = 0;
		Player winner = new Player(0,"");
		for(Player player : players) {
			if(maximum < player.getScore()) {
				maximum = player.getScore();
				winner = player;
			}
		}
		System.out.println("Winner is with Player id : "+winner.id + " Name : "+winner.name + " Score " + winner.getScore());
	}
	
	public static void getEachSetScore() {
		ArrayList<Player> players = Bowling.players;
		System.out.println("Anuj");
		for(Player player : players) {
			System.out.println("Player id :  " +player.id+ ", try1 score " + player.bowling.value1 +", try2 score "+ player.bowling.value2 + ", Set Score "+player.each_set_score);
		}
	}
}
