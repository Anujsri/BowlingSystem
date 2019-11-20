package com.cred_task;
import java.util.*;  
public class Strategies {
	String strategie_name;
	String rule;
	int bonus;
	Scanner sc = new Scanner(System.in); 
	public Strategies(String strategie_name,String rule,int bonus) {
		this.strategie_name = strategie_name;
		this.rule = rule;
		this.bonus = bonus;
	}
	public Strategies() {}
	Hashtable<String,Strategies> hm = new Hashtable<String,Strategies>();
	public void setStrategies(String rule,String strategie_name,int bonus) {
		Strategies strategie = new Strategies(strategie_name,rule,bonus);
		hm.put(rule, strategie);
	}
	public int getStrategies(String rule) {
		int bonus;
		Strategies strategie = new Strategies();
		try {
			strategie = hm.get(rule);
			bonus = strategie.bonus;
			return bonus;
		}
		catch(Exception e){
			return -1;
		}
	}
	public void mapping(int try1,int try2) {
		CustomizeGame customizeGame = new CustomizeGame();
		String s[]= {"try1 + try2", "try1"};
		int sum = try1 + try2;
		for(int i=0;i<s.length;i++) {
			String str = s[i] +" == " + sum;
			int bonus = customizeGame.strategie.getStrategies(str);
			System.out.println("bonus\t" + bonus);
		}
	}
}
