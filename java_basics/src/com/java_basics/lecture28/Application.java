package com.java_basics.lecture28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
	ArrayList<Integer> list1 = new ArrayList<Integer>();	
	list1.add(12);
	list1.add(43);
	list1.add(15);
	list1.add(67);
	list1.add(43);
	list1.add(10);
	list1.add(10);
	list1.add(10);
	list1.add(10);

	ArrayList<Integer> newList = new ArrayList<Integer>();
	newList.add(10);
	newList.add(67);
	newList.add(15);
	
	list1.retainAll(newList);
	System.out.println(list1);

	boolean hasvalue = list1.contains(67);
	System.out.println(hasvalue);
	
	list1.removeAll(newList);	
	System.out.println(list1);
	
	
	list1.clear();
	System.out.println(list1);
	System.out.println(list1.isEmpty());
	
	//
	
	HashSet<Integer> li = new HashSet<>();	
	li.add(12);
	li.add(43);
	li.add(15);
	li.add(67);
	li.add(43);
	li.add(10);
	li.add(10);
	li.add(10);
	li.add(10);
	
	List<Integer> arrayLi = new ArrayList<Integer>(li);
	arrayLi.forEach(p -> System.out.print(p + " "));
	
	System.out.println();//line break
	
	Collections.sort(arrayLi);	
	arrayLi.forEach(p -> System.out.print(p + " "));
	
	System.out.println();
	/***
	 * 
	 */
	HashSet<Employee> hashSet = new HashSet<>();	
	hashSet.add(new Employee("Mike a", 3500, "Accounting"));
	hashSet.add(new Employee("Paul", 250, "Admin"));
	hashSet.add(new Employee("Peter", 380, "Accounting"));
	hashSet.add(new Employee("Angela", 4000, "IT"));
	hashSet.add(new Employee("Johane", 3500, "Maint"));
	
	ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
	
	Collections.sort(myList);
	
	myList.forEach(System.out::println);
	
	
	
	
	
	}
}
