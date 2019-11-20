package com.cred_task;
import java.util.ArrayList;
import java.util.Scanner;
/** this class used to store each players total score,score of each set,and values which he got
 * in try1 and try2 in each set and bonus based on the Strategies */
public class Player {
	private int id; 			/** player id*/
	private String name;		/** player name*/
	private int totalScore;		/** each player's score*/
	private Bowling bowling;	/** this Bowling object will contains try1 and try2 value of each set*/
	private int each_set_score;	/** each set score for each player*/
	Player(){}
	
	/** constructor to inialize the Player object*/
	public Player( int id, String name )
	{
		this.id = id;
		this.name = name;
		this.totalScore = 0;
	}
	
	/** constructor to inialize the Player object(overloading) with player's id,bowling object and each set score*/
	Player(int id,Bowling bowling,int each_set_score){
		this.id = id;
		this.bowling = bowling;
		this.each_set_score = each_set_score;
	}
	
	/** constructor to inialize the Player object(overloading) with players's id,name and his total score*/
	Player(Player player){
		this.id = player.id;
		this.name = player.name;
		this.totalScore = player.totalScore;
	}
	
	/** class method  to add each player's total score*/
	public void addScore( int score )
	{
		this.totalScore += score;
	}
	
	/** class method  to get each player's total score*/
	public int getScore() {
		return totalScore;
	}
	
	/** this class method will create and return ArrayList of Players */
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
	
	/** this class method will start the game and print each player's id,name and his total score */
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
	
	/** this class method will return the winner of the game */
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
	
	/** this class method will return each set score of each player */
	public static void getEachSetScore() {
		ArrayList<Player> players = Bowling.players;
		System.out.println("Anuj");
		for(Player player : players) {
			System.out.println("Player id :  " +player.id+ ", try1 score " + player.bowling.value1 +", try2 score "+ player.bowling.value2 + ", Set Score "+player.each_set_score);
		}
	}
}
