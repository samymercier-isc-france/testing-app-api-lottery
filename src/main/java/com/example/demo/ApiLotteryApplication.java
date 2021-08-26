package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.models.PlayRequest;
//import com.example.demo.services.impl.LotteryServiceImpl;
//import com.example.demo.services.impl.WheelServiceImpl;

@SpringBootApplication
public class ApiLotteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLotteryApplication.class, args);
//		WheelServiceImpl wheelService = new WheelServiceImpl();
//		LotteryServiceImpl service = new LotteryServiceImpl(wheelService);
//		PlayRequest play = new PlayRequest(1, "main");
//		service.spinTheWheel(play);
	}

}
