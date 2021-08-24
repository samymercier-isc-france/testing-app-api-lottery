package com.example.demo.models;

public class Item {
	private long itemId;
	private int slots;
	private boolean isTradable;
	
	public Item() {
		
	}
	
	public Item (long itemId, int slots, boolean isTradable) {
		this.itemId = itemId;
		this.slots = slots;
		this.isTradable = isTradable;
	}
	
	public long getItemId () {
		return this.itemId;
	}
	
	public int getSlots () {
		return this.slots;
	}
	
	public void setSlots (int slots) {
		if(this.isSlotsValid(slots)) {
			this.slots = slots;
		}else {
			this.errorThrower(slots);
		}
	}
	
	private boolean isSlotsValid (int slots) {
		//makes sure it can't set to an incorrect number of slots
		return slots>=0 && slots<5;
	}
	
	public boolean getIsTradable () {
		return this.isTradable;
	}
	
	private void errorThrower (int value) {
		throw new Error("This action can't be done : " 
					+ value + " is not a possible value!");
	}
	
}
