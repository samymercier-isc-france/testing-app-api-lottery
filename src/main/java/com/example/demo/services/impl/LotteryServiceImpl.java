package com.example.demo.services.impl;

import java.util.List;

import com.example.demo.models.PlayRequest;
import com.example.demo.models.Reward;
import com.example.demo.models.Wheel;
import com.example.demo.models.lotteryResult;
import com.example.demo.services.ILotteryService;

public class LotteryServiceImpl implements ILotteryService {

	private WheelServiceImpl wheelService = new WheelServiceImpl();

	@Override
	public lotteryResult spinTheWheel(PlayRequest playRequest) {
		Wheel wheel = this.wheelService.getASpecificWheel(playRequest.getWheelName());
		int randomNumber = this.generateRandomNumber(wheel);
		Reward reward = this.determineReward(wheel, randomNumber);
		lotteryResult result = new lotteryResult(randomNumber, reward);
		System.out.println(result.toString());
		return result;
	}

	private int generateRandomNumber(Wheel wheel) {
		int numberOfRewards = wheel.getRewardsList().size();
		int randomNumber = (int) Math.round(Math.random() * 360);
		if (randomNumber % numberOfRewards == 0) {
			int side = (int) Math.round(Math.random());
			if ((randomNumber != 360 && side == 0) || randomNumber == 0) {
				randomNumber++;
			} else if (side == 1 || randomNumber == 360) {
				randomNumber--;
			}
		}
		return randomNumber;
	}
	
	private Reward determineReward(Wheel wheel, int number) {
		List<Reward> rewards = wheel.getRewardsList();
		Reward reward = rewards.get((number)/rewards.size());
		return reward;
	}

}
