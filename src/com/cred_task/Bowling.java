package com.cred_task;
import java.util.ArrayList;
import java.util.Random;
/** The purpose of this class to setup an environment to execute Bowling game like storing the value of 
 * try1 and try2 and each set to this I am creating an array which will store it,get bonus based on the  
 * strategy and get the total score of each player */
public class Bowling {
	
	int value1;	/** to store the value of try1 of each set*/
	int value2;	/** to store the value of try2 of each set*/
	int value3;	/** to store the value of try3 of each set(this is only for last set if try1+try2==10)*/
	
	/** creating strategy object to access all the methods and variables of Strategies class*/
	Strategies strategie = new Strategies();
	
	/** this ArrayList use to store try1,try2 and score of each set for every player*/
	static ArrayList<Player> players = new ArrayList<Player>();
	
	
	Bowling round_array[]; 	/** this array will try1,try2 value for each set */
	
	/** constructor to inialize the Bowling object for two trial*/
	Bowling(int value1,int value2){
		this.value1 = value1;
		this.value2= value2;
	}
	
	/** constructor to inialize the Bowling object for three trial(this is applicable only for last set)*/
	Bowling(Bowling bwl,int value3){
		this.value1 = bwl.value1;
		this.value2 = bwl.value2;
		this.value3= value3;
	}
	Bowling(){}
	
	/** adding how many pins knocked in try1 and try2 in round_array*/
	public void setPinsKnocked(int value1,int value2,int index) {
		Bowling pinsknocked = new Bowling(value1,value2);
		round_array[index] = pinsknocked;
	}
	
	/** adding how many pins knocked in try1,try2 and try3 in round_array (this is applicable only for last set)*/
	public void setPinsKnocked(int value1,int value2,int value3,int index) {
		Bowling pinsknocked = new Bowling(value1,value2);
		Bowling pinsknockeds = new Bowling(pinsknocked,value3);
		round_array[index] = pinsknockeds;
	}
	
	/** a method to set or add pins knocked on above two constructor and will return round_array*/
	public Bowling[] addPoints(int round) {
		Random rand = new Random();
		for (int i=0;i<round;i++) {
			int r1 = rand.nextInt(11); 
	        int r2 = rand.nextInt(11-r1);
	        if(i==round-1 && (r1 + r2 == 10)) {
	        	int r3 = rand.nextInt(11);
	        	this.setPinsKnocked(r1,r2,r3,i);
			}
	        this.setPinsKnocked(r1,r2,i);
		} 
		return round_array;
	}
	
	/** a method to get the bonus based on the strategy*/
	public int  getBonus(int try1,int try2) {
		ArrayList<Strategies> strategies = Strategies.getStrategies();
		int bonus = 0;
		for(Strategies strategie : strategies) {
			if((try1 ==10 && strategie.input1 == 10)) {
				bonus = strategie.bonus;
				break;
			}
			else if(try1 + try2 == strategie.input1 + strategie.input2) {
				bonus = strategie.bonus;
				break;
			}
		}
		return bonus;
	}
	
	/** a method to get total score of each player*/
	public int get_Score(Bowling[] round_array,int palyer_id) {
		int total = 0;
		int bonus = 0;
		Bowling bowling;
		for(int i=0;i<round_array.length;i++) {
			int sum = round_array[i].value1 + round_array[i].value2;
			bowling = new Bowling(round_array[i].value1,round_array[i].value2);
			if(i==round_array.length-1 && (round_array[i].value1 + round_array[i].value2 == 10)) {
				sum = sum + round_array[i].value3; 
				bowling = new Bowling(bowling,round_array[i].value3);
			}
			bonus = getBonus(round_array[i].value1,round_array[i].value2);
			total = total + sum + bonus;
			players.add(new Player(palyer_id,bowling,total));
		}
		return total;
	}
}
