package com.java_basics.lecture26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
//		animals.forEach(p -> {
//			System.out.println(p);
//		});
//		
//		for(String v : animals) {
//			System.out.println(v);
//		}
		
		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(new Vehicle("Toyota", "Camery", 8000, false));
		vehicles.add(new Vehicle("Mercedes", "accord", 7000, false));
		vehicles.add(new Vehicle("Jeep", "Wrangler", 1000, false));
		vehicles.add(new Vehicle("Honda", "accord", 500, false));

//		vehicles.forEach(System.out::println);
		
		printElements(vehicles);
		printElements(animals);
		
		
	}
	
	public static void printElements(List someList) {
		someList.forEach(System.out::println);
	}
	
}
