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
		 
		 ALambdaInterface helloVar = ()-> {
			 System.out.println("hello there");
		 };
		 
		 helloVar.someMethod();
		 Calculate sumVar = (a, b) -> a+b;		 
		 System.out.println(sumVar.compute(4, 6));
		 
		 Calculate nonZeroDivider = (a,b) -> (a==0)?0:a/b;
		 System.out.println(nonZeroDivider.compute(0, 8));
		 System.out.println(nonZeroDivider.compute(16, 8));
		 
		 MyGenericInterface<String> reverser = (str) -> {
			 String result = "";
				for(int i = str.length()-1; i>=0;i--) {
					result += str.charAt(i);
				}
			return result;
		 };		 
		 System.out.println(reverser.work("ABCDEFG"));
		 
		 MyGenericInterface<Integer> factorial = (num) -> {
			 int result = 1;
			 for(int i=1; i<= num; i++) {
				 result *=i;
			 }
			 return result;
		 };
		 System.out.println(factorial.work(5));
		 
	}
	
	public void sayHello() {
		System.out.println("Hello there");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
	
	public int nonZeroDivide(int arg1, int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	public String reverse(String str){
		String result = "";
		for(int i = str.length()-1; i>=0;i--) {
			result += str.charAt(i);
		}
		return result;		
	}
	
	public int factorial(int num) {		
		return (num==1) ? 1: (num * factorial(num-1));
	}

}
interface MyGenericInterface<T>{
	public T work(T t);
}

interface Factorial{
	public int calculate(int a);	
}

interface StringWorker{
	public String reverse(String a);
}

interface Calculate{
	public int compute(int a, int b);
}