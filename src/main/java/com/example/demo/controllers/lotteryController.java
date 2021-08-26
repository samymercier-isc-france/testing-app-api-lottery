package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PlayRequest;
import com.example.demo.models.lotteryResult;
import com.example.demo.services.ILotteryService;

@RestController
@RequestMapping("lottery")
@CrossOrigin
public class lotteryController {
	
	@Autowired
	private ILotteryService lotteryService;
	
	@PostMapping("")
	public lotteryResult  playRequest (@RequestBody PlayRequest request) {
		return this.lotteryService.spinTheWheel(request);
	}

}
