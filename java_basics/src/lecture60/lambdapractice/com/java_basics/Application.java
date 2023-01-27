package lecture60.lambdapractice.com.java_basics;

public class Application {
	public static void main(String[] args) {
		Human tom = new Human();
		walker(tom);
		
		Robot wale = new Robot();
		walker(wale);
		
		walker(new Walkable() {
			
			@Override
			public void walk() {
				System.out.println("Do something!!");
				
			}
		});
		
		//shorter version of anonymous class
		walker(() -> System.out.println("Custom object walking... "));
		
		Walkable blockOfCode = () -> {
			 System.out.println("Custom object walking... ");
			 System.out.println("the object tripped... ");
		 };
		
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}

}
