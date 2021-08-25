package com.example.demo.services;

import java.util.Map;

import com.example.demo.models.Wheel;

public interface IWheelService {
	
	public Map<String, Wheel> getWheels ();
	
	public Wheel getASpecificWheel (String key);

}
