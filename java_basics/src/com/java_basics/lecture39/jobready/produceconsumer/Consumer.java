package com.java_basics.lecture39.jobready.produceconsumer;

import java.util.List;

public class Consumer implements Runnable{

	private List<Integer> questionList = null;
	
	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;		
	}
	
	public synchronized void answerQuestion() throws InterruptedException {
		synchronized (questionList) {			
			while(questionList.isEmpty()) {
				System.out.println("No Question to Answer.. waiting for producer to get questions");
				questionList.wait();
			}
		}
		
		synchronized (questionList) {
			Thread.sleep(5000);
			System.out.println("Answered Question: "+ questionList.remove(0));
			questionList.notify();
		}
	}
	
	
	@Override
	public void run() {		
		while(true) {			
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

}
