package com.example.demo.models;

public class lotteryResult {
	
	private int randomNumber;
	private Reward reward;
	
	public lotteryResult() {
		super();
	}

	public lotteryResult(int randomNumber, Reward reward) {
		super();
		this.randomNumber = randomNumber;
		this.reward = reward;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}
	
	@Override
	public String toString () {
		return "RANDOM NUMBER : " + this.getRandomNumber() + "\nREWARD : \n" + this.getReward();
	}
	
}
