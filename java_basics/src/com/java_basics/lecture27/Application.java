package com.java_basics.lecture27;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Integer> values = new HashSet<>();
		values.add(12);		
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);//drop this element
		
		values.forEach(System.out::println);
		System.out.println();
		
		HashSet<String> stringValues = new HashSet<>();
		stringValues.add("Random");		
		stringValues.add("Animal");
		stringValues.add("People");
		stringValues.add("Random");//droped
		stringValues.add("Random");//droped
		
		stringValues.forEach(System.out::println);
		System.out.println();
		

		/**	insert ordered  **/
		LinkedHashSet<String> linkedStringValues = new LinkedHashSet<>();
		linkedStringValues.add("Random");		
		linkedStringValues.add("Animal");
		linkedStringValues.add("People");
		linkedStringValues.add("Random");
		linkedStringValues.add("Random");
		
		linkedStringValues.forEach(System.out::println);
		System.out.println();		
		
		Animal a1 = new Animal("Dog", 12);
		Animal a2 = new Animal("Cat", 8);
		Animal a3 = new Animal("Bird", 3);
		Animal a4 = new Animal("Dog", 12);
		Animal a5 = new Animal("Kangoroo", 24);
		HashSet<Animal> animals = new LinkedHashSet<Animal>();
		animals.add(a1);
		animals.add(a2);
		animals.add(a3);
		animals.add(a4);
		animals.add(a5);
		
		System.out.println("Is a1 == a4? " + ((a1.equals(a4))?"yes":"no"));
		System.out.println(a1.hashCode());
		System.out.println(a4.hashCode());
		animals.forEach(System.out::println);
		
		
		
		

		
		
	}
}
