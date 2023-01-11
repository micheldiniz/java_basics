package com.java_basics.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {

		ArrayList notSafeType = new ArrayList();
		notSafeType.add('A');
		notSafeType.add(2);
		notSafeType.add(3);
		notSafeType.add(2.0);
		notSafeType.add("don't do this!");

		int a = (int) notSafeType.get(1);
		int b = (int) notSafeType.get(2);

		System.out.println(a + b);

		/**
		 * Java is a safe type language <> generic parameterization
		 * An array is 10 size by default after its filled it doubles the size
		 * ArrayList fast retrieve an element but slow in manipulating
		 * */
		ArrayList<String> words = new ArrayList<>();
		words.add("hello world!");
		words.add("Hey there!");
		words.add("another word");
		
		String item1 = words.get(0);
		System.out.println(item1);
		
		/***
		 * wrapper class Integer 
		 * nodes linked together
		 * LinkedList is fast in manipulating but slow in element retrieval 
		 */
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
		numbers.remove(2);//just remove the element in positions 3
		numbers.removeFirst();//removes and returns the first number
		
		numbers.forEach(System.out::println);
		
		
		
		
		

	}

}
