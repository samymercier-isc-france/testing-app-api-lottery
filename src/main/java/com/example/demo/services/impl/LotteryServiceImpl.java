package com.example.demo.services.impl;

import com.example.demo.models.PlayRequest;
import com.example.demo.models.Reward;
import com.example.demo.models.Wheel;
import com.example.demo.models.lotteryResult;
import com.example.demo.services.ILotteryService;
import com.example.demo.services.IWheelService;

public class LotteryServiceImpl implements ILotteryService {

	private IWheelService wheelService;

	public LotteryServiceImpl(IWheelService wheelService) {
		this.wheelService = wheelService;
	}

	@Override
	public lotteryResult spinTheWheel(PlayRequest playRequest) {
		Wheel wheel = this.wheelService.getASpecificWheel(playRequest.getWheelName());
		int randomNumber = this.generateRandomNumber(wheel);
		Reward reward = this.determineReward(wheel, randomNumber);
		lotteryResult result = new lotteryResult(randomNumber, reward);
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
		for (int index = 0; index < wheel.getRewardsList().size(); index++) {
			if (number > 15 * index && number < 15 * (index + 1)) {
					return wheel.getRewardsList().get(index);
			}
		}
		return null;
	}

}
