package com.java_basics.car_dealership;

public class Dealership {
	public static void main(String[] args) {
		
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St.");;
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 5000);
		
		Vehicle car = new Vehicle("Honda", "Accord", 5000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false); 
		
		boolean value = car.equals(vehicle);
		
		System.out.println(value);
		

		
	}
}
