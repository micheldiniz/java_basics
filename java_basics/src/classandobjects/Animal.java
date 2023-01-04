package classandobjects;

public class Animal {

	
	int age;
	String gender;
	int weightInLbs;
	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	} 
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walk...");
	}
	
	public void work() {
		System.out.println("working...");
	}
	
}
