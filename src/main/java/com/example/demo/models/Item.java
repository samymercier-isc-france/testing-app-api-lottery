package com.example.demo.models;

public class Item {
	private long itemId;
	private int slots;
	private int sort;
	private int maxUpgrade;
	private int enchant;
	private int enchantAmount;
	private boolean isTradable = true;
	private int uniqueId;
	private int attached;
	private int potential;
	
	public Item() {
		
	}
	
	public Item(long itemId, int slots, int sort, int maxUpgrade, int enchant, int enchantAmount, boolean isTradable,
			int uniqueId, int attached, int potential) {
		super();
		this.itemId = itemId;
		this.slots = slots;
		this.sort = sort;
		this.maxUpgrade = maxUpgrade;
		this.enchant = enchant;
		this.enchantAmount = enchantAmount;
		this.isTradable = isTradable;
		this.uniqueId = uniqueId;
		this.attached = attached;
		this.potential = potential;
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

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public int getMaxUpgrade() {
		return maxUpgrade;
	}

	public void setMaxUpgrade(int maxUpgrade) {
		this.maxUpgrade = maxUpgrade;
	}

	public int getEnchant() {
		return enchant;
	}

	public void setEnchant(int enchant) {
		this.enchant = enchant;
	}

	public int getEnchantAmount() {
		return enchantAmount;
	}

	public void setEnchantAmount(int enchantAmount) {
		this.enchantAmount = enchantAmount;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public int getAttached() {
		return attached;
	}

	public void setAttached(int attached) {
		this.attached = attached;
	}

	public int getPotential() {
		return potential;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public void setTradable(boolean isTradable) {
		this.isTradable = isTradable;
	}
	
	
	
}
