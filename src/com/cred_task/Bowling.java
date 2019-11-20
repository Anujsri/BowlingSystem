package com.cred_task;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random; 
public class Bowling {
	Scanner sc = new Scanner(System.in);
	int value1;
	int value2;
	int value3;
	Strategies strategie = new Strategies();
	Bowling round_array[];
	Bowling(int value1,int value2){
		this.value1 = value1;
		this.value2= value2;
	}
	Bowling(Bowling bwl,int value3){
		this.value1 = bwl.value1;
		this.value2 = bwl.value2;
		this.value3= value3;
	}
	Bowling(){}
	public void setPinsKnocked(int value1,int value2,int index) {
		Bowling pinsknocked = new Bowling(value1,value2);
		round_array[index] = pinsknocked;
	}
	public void setPinsKnocked(int value1,int value2,int value3,int index) {
		Bowling pinsknocked = new Bowling(value1,value2);
		Bowling pinsknockeds = new Bowling(pinsknocked,value3);
		round_array[index] = pinsknockeds;
	}
	public Bowling[] addPoints(int round) {
		for (int i=0;i<round;i++) {
			int r1 = genrateRandom(0,11); 
	        int r2 = genrateRandom(r1,11);
	        if(i==round-1 && (r1 + r2 == 10)) {
	        	int r3 = genrateRandom(0,11);
	        	this.setPinsKnocked(r1,r2,r3,i);
			}
	        this.setPinsKnocked(r1,r2,i);
		} 
		return round_array;
	}
	public int genrateRandom(int range,int max) {
		Random rand = new Random();
		if(range%10 ==0) {
			return rand.nextInt(max);
		}
		else{
			return rand.nextInt(max-range);
		}
	}
	public int get_Score(Bowling[] round_array,int palyer_id) {
		int total = 0;
		int bonus = 0;
		Player player;
		for(int i=0;i<round_array.length;i++) {
			int sum = round_array[i].value1 + round_array[i].value2;
			if(i==round_array.length-1 && (round_array[i].value1 + round_array[i].value2 == 10)) {
				sum = sum + round_array[i].value3; 
			}
			if(round_array[i].value1 == 10) {
				bonus = bonus + 10;
			}
			if((round_array[i].value1 + round_array[i].value2)%10==0) {
				bonus = bonus + 5;
			}
			total = total + sum + bonus;
			player = new Player(palyer_id,round_array,total);
		}
		return total;
	}
}
