package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.services.IWheelService;
import com.example.demo.services.impl.LotteryServiceImpl;
import com.example.demo.services.impl.WheelServiceImpl;

@Configuration
public class lotteryConfig {
	
	@Bean
	public LotteryServiceImpl lotteryFactory (IWheelService service) {
		return new LotteryServiceImpl(service);
	}
	
	@Bean
	public WheelServiceImpl wheelFactory () {
		return new WheelServiceImpl();
	}

}
