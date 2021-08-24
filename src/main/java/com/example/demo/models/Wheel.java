package com.example.demo.models;

import java.util.ArrayList;

public class Wheel {
	private String name; 
	private SpinningCost spinningCost;
	private ArrayList<Reward> rewardsList;
	
	public Wheel () {
		
	}
	
	public Wheel (String name, SpinningCost spinningCost, ArrayList<Reward> rewardsList) {
		this.name = name;
		this.spinningCost = spinningCost;
		this.rewardsList = rewardsList;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return this.name;
	}
	
	public void setSpinningCost (SpinningCost spinningCost) {
		this.spinningCost = spinningCost;
	}
	
	public SpinningCost getSpinningCost () {
		return this.spinningCost;
	}
	
	public void setRewardsList (ArrayList<Reward> rewardsList) {
		this.rewardsList = rewardsList;
	}
	
	public ArrayList<Reward> getRewardsList () {
		return this.rewardsList;
	}
}
