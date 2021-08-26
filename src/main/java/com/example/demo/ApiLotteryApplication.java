package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.PlayRequest;
import com.example.demo.services.impl.LotteryServiceImpl;

@SpringBootApplication
public class ApiLotteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLotteryApplication.class, args);
		LotteryServiceImpl service = new LotteryServiceImpl();
		PlayRequest play = new PlayRequest(1, "main");
		service.spinTheWheel(play);
	}

}
