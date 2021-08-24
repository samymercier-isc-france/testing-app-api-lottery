package com.example.demo.models;

public class Reward {
	private int rarity;
	private Item item;
	private int amount;
	
	public Reward () {
		
	}
	
	public Reward (int rarity, Item item, int amount) {
		this.rarity = rarity;
		this.item = item;
		this.amount = amount;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
