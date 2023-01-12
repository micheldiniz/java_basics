package com.java_basics.processingfiles;

import com.java_basics.exceptions.FooRuntimeException;

public class MyFileUtils {

	public int subtract10FromLargeNumber(int number) throws Exception{
		if (number < 10) {
			throw new FooRuntimeException("The number passed was smaller than 10");
		}
		return number -10;
	}	
	
}


