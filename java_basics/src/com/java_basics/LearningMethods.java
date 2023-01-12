package com.java_basics;

import com.java_basics.utils.MyUtils;

public class LearningMethods {

	public static void main(String[] args) {
		
		
		//PrintStream 'out' variable from class 'System' Method 'println' get informations and do something		
		System.out.println("something");

		System.out.println(MyUtils.printSomeJunk("hello"));
		
		MyUtils.sumNumbers(3, 2);
		
		int result = MyUtils.add10(50);
		System.out.println(result);
		
	}
	

	
}
