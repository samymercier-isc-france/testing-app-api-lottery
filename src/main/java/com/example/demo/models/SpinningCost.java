package com.example.demo.models;

public class SpinningCost {
	private Item item;
	private int amount;
	
	public SpinningCost () {
		
	}
	
	public SpinningCost (Item item, int amount) {
		this.item = item;
		this.amount = amount;
	}
	
	public void setItem (Item item) {
		this.item = item;
	}
	
	public Item getItem () {
		return this.item;
	}
	
	public void setAmount (int amount) {
		this.amount = amount;
	}
	
	public int getAmount () {
		return this.amount;
	}
}
