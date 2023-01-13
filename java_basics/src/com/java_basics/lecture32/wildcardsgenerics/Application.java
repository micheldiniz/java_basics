package com.java_basics.lecture32.wildcardsgenerics;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
//		employees = accountants;
		
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<String> accountants2 = new ArrayList<>();
		employees2 = accountants2;
	
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		employees3 = accountants3;

		ArrayList<? extends Accountable> employees4 = new ArrayList<>();
		ArrayList<Accountant> accountants4 = new ArrayList<>();
		employees4 = accountants4;
	
		ArrayList<? super Employee> employee5 = new ArrayList<>();
		ArrayList<Object> accountants5 = new ArrayList<>();
		employee5 = accountants5;
		
		makeEmployeeWork(employees);
		makeEmployeeWork(accountants);
		
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		employees.forEach(e -> e.work());
		
		
	}
}
