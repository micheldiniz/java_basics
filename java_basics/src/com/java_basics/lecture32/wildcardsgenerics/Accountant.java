package com.java_basics.lecture32.wildcardsgenerics;

public class Accountant extends Employee implements Accountable{

	@Override
	public void work() {
		System.out.println("Accountant working");
	}
}
