package java_basics.utils;

public class MyUtils {
	
	//visibility modifiers public/protected/private
		//public => visible for everyone
		//protected => visible inside same packages
		//private => visible just inside  
	//static means the method belongs to the class
	public static String printSomeJunk(String junk) {
		return junk;
	}
	
		
	public static void printSomeJunk(int junk) {
		System.out.println(junk);
	}
	
	public static void sumNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public static int add10(int number) {
		int result = number + 10;
		return result;
	}
}
