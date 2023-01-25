package com.java_basics.lecture39.jobready.produceconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> questionList = new ArrayList();
//				IntStream.of(0)
		
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Consumer(questionList));
		
		t1.start();
		t2.start();
		
	}

}
