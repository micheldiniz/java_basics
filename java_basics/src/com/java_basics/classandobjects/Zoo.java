package com.java_basics.classandobjects;

import java.util.Arrays;
import java.util.List;

public class Zoo {
	
	public static void main(String[] args) {
//		Abstract class can't be instanciated
//		Animal animal1 = new Animal(12, "M", 23);
//		animal1.eat();
		
		Bird bird1 = new Bird(1,"F",2);
		bird1.sleep();
		
		Chicken chick1 = new Chicken(1, "M", 7);
		
		Sparrow sparrow1 = new Sparrow(1, "M", 1);
		sparrow1.fly();
		moveAnimal(sparrow1);
		
		Fish fish1 = new Fish(0, "M", 0);
		moveAnimal(fish1);
		
		List<Animal> animals = Arrays.asList(fish1, sparrow1);
		moveAnimals(animals);
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void moveAnimals(List<Animal> animals) {
		animals.forEach(p -> p.move());
	}

}
