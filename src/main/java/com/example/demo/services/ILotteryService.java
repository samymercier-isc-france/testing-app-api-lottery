package com.example.demo.services;

import com.example.demo.models.PlayRequest;
import com.example.demo.models.lotteryResult;

public interface ILotteryService {

	public lotteryResult spinTheWheel (PlayRequest playRequest);
	
}
