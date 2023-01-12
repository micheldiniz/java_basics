package com.java_basics.practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		String str = "ABCDEFG";
		
		System.out.println(str.length());
		
		String extracted = str.substring(1);
		String extracted2 = str.substring(2);
		String extracted3 = str.substring(0,2);
		
		System.out.println("Extracted String: " + extracted);
		System.out.println("Extracted String: " + extracted2);
		System.out.println("Extracted String not inclusive: " + extracted3);
		
		String a = "hello";
		String b = "there";
		
		if(a == "hello") {
			System.out.println("traped");
		}
		
		if(a.equals("hello")) {
			System.out.println("not a trap");
		}
		
		if(b.equalsIgnoreCase("TheRe")) {
			System.out.println("it equals TheRe");
		}
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		
		int i = str.indexOf('D');
		System.out.println("index: "+ i + " char:" + str.charAt(i));
		
		String str2 = "Hello there yogi there";
		int i2 = str2.indexOf("there");
		System.out.println("first there position: " + i2);
		
		int i3 = str2.lastIndexOf("there");
		System.out.println("last there position: "+i3);
		
		
	}
}
