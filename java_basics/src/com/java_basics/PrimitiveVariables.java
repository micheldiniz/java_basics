package com.java_basics;

public class PrimitiveVariables {

	public static void main(String[] args) {
		
//		https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		
		//1 byte
		byte reallySmallNumber = 127;
		
		//2 bytes 
		short shortN = 32767;
		
		//4 bytes -> 32 bit (2^31)-1
		int x = 4;
		
		//8 bytes -> 64 bit (2^63)-1
		long number = 1000000000000000000L;
		
		//8 bytes
		double decimal = 394003;
		
		//2 bytes
		char letter = '0';
		
		//1bit
		boolean isTrue = false;

		Integer notBoxedX = Integer.valueOf(x);
		
		
		int z = 0;
		int y = 1;
		int A = 2;

//		System.out.println(y++ + ++z - --A);
		A = (y++ + ++z - --A) + ++y;
		System.out.println("Valor de A: " + A);
		

		
	}

}

