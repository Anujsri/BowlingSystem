package com.cred_task;

public class Lane {
	int lane_id;
	int player_id;
	Bowling bowling;
	int set_score;
	
	Lane(int lane_id,int player_id,Bowling bowling,int set_score){
		this.lane_id = lane_id;
		this.player_id = player_id;
		this.bowling = bowling;
		this.set_score = set_score;
	}
}
