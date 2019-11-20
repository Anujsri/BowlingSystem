package com.cred_task;
import java.util.*; 
/** As a user has two try in each sets so we need two inputs to define a new rule(Strategies) like 
* spare and strike and bonus based on the Strategies */
public class Strategies {
	
	int input1; /** First input for rule*/
	int input2; /** Second input for rule*/
	int bonus;  /** Bonus for this rule*/
	String strategie_name; /** to store the strategie_name like spare etc.. */
	
	/** constructor to create and inialize the Strategies object*/
	public Strategies(int input1,int input2,int bonus,String strategie_nam) {
		this.input1 = input1;
		this.input2 = input2;
		this.strategie_name = strategie_nam;
		this.bonus = bonus;
	}
	public Strategies() {}
	
	/** ArrayList of Strategies to store all the rules*/
	static ArrayList<Strategies> strategie = new ArrayList<Strategies>();
	Scanner sc = new Scanner(System.in); 
	
	/** creating ArrayList of object of Strategies */
	public void  setStrategies(int input1,int input2,int bonus,String strategie_nam) {
		strategie.add(new Strategies(input1,input2,bonus,strategie_nam));
	}
	
	/** getting all the Strategies in ArrayList */
	public static ArrayList<Strategies> getStrategies(){
		return strategie;
	}
}
