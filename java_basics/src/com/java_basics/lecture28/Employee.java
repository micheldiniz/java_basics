package com.java_basics.lecture28;

public class Employee implements Comparable<Employee> {

	String name;
	int salary;
	String department;

	public Employee(String name, int salary, String department) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary < o.getSalary()) {
			return -1;
		} else if (this.salary > o.getSalary()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	

}
