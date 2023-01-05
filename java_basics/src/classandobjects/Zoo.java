package classandobjects;

public class Zoo {
	
	public static void main(String[] args) {
		Animal animal1 = new Animal(12, "M", 23);
		animal1.eat();
		
		Bird bird1 = new Bird(1,"F",2);
//		bird1.fly() //unable to fly
		bird1.sleep();
		
		Chicken chick1 = new Chicken(1, "M", 7);
//		chick1.fly(); // unable to fly
		
		Sparrow s = new Sparrow(1, "M", 1);
		s.fly();
		
	}

}
