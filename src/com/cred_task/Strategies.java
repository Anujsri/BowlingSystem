package com.cred_task;
import java.util.*;  
public class Strategies {
	int input1;
	int input2;
	int bonus;
	String strategie_name;
	static ArrayList<Strategies> strategie = new ArrayList<Strategies>();
//	Strategies s1 = new Strategies(10,0,10,"strike");
//	strategie.add(s1);
	Scanner sc = new Scanner(System.in); 
	public Strategies(int input1,int input2,int bonus,String strategie_nam) {
		this.input1 = input1;
		this.input2 = input2;
		this.strategie_name = strategie_nam;
		this.bonus = bonus;
	}
	public Strategies() {}
	Hashtable<String,Strategies> hm = new Hashtable<String,Strategies>();
	public void  setStrategies(int input1,int input2,int bonus,String strategie_nam) {
		strategie.add(new Strategies(input1,input2,bonus,strategie_nam));
	}
	public static ArrayList<Strategies> getStrategies(){
		return strategie;
	}
//	public int getSt(String rule) {
//		int bonus;
//		System.out.println("getting "+ hm);
//		Strategies strategie = new Strategies();
//		try {
//			strategie = hm.get(rule);
//			bonus = strategie.bonus;
//			return bonus;
//		}
//		catch(Exception e){
//			return -1;
//		}
//	}
//	public void mapping(int try1,int try2) {
//		CustomizeGame customizeGame = new CustomizeGame();
//		String s[]= {"try1 + try2", "try1"};
//		int sum = try1 + try2;
//		for(int i=0;i<s.length;i++) {
//			String str = s[i] +" == " + sum;
//			int bonus = customizeGame.strategie.getStrategies(str);
//			System.out.println("bonus\t" + bonus);
//		}
//	}
}
