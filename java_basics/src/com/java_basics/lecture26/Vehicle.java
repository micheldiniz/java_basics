package com.java_basics.lecture26;

public class Vehicle {
	private String make;
	private String model;
	private int price;
	private boolean fourWDrive;
		
	
	public Vehicle(String make, String model, int price, boolean fourWDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWDrive = fourWDrive;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWDrive() {
		return fourWDrive;
	}
	public void setFourWDrive(boolean fourWDrive) {
		this.fourWDrive = fourWDrive;
	}
	
	@Override
	public String toString() {	
		return this.getMake() + " " + this.getModel() + " " + this.getPrice();
	}
	
	

}
