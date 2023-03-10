package com.java_basics.classandobjects;

public abstract class Animal {

	
	int age;
	String gender;
	int weightInLbs;
	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	} 
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleep...");
	}
	
	public abstract void move();
}
