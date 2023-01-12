package com.java_basics.processingfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
//		File file = new File("myfile.txt");
//		Scanner fileInput = new Scanner(file);
//		while(fileInput.hasNextLine()) {
//			String line = fileInput.nextLine();
//			System.out.println(line);
//		}
//		fileInput.close();
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter some Text: ");
//		String enteredText = input.nextLine();		
//		System.out.println(enteredText);
//		
//		int i = 1;
//		System.out.println("Enter a number");
//		while(i>0) {
//			i = input.nextInt();
//			System.out.println(i);
//		}
//		input.close();
		
		MyFileUtils myUtil = new MyFileUtils();
		try {			
			System.out.println(myUtil.subtract10FromLargeNumber(9));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
