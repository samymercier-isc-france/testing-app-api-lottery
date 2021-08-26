package com.example.demo.models;

public class PlayRequest {
	
	private int accountId;
	private String wheelName;
	
	public PlayRequest() {
		super();
	}

	public PlayRequest(int accountId, String wheelName) {
		super();
		this.accountId = accountId;
		this.wheelName = wheelName;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getWheelName() {
		return wheelName;
	}

	public void setWheelName(String wheelName) {
		this.wheelName = wheelName;
	}
	
}
