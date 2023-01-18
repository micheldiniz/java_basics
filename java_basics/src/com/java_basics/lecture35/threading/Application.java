package com.java_basics.lecture35.threading;

import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		System.out.println("Starting Thread 1");		
		Thread t1 = new Thread(new Task("Thread-A"));
		t1.start();		
		
		System.out.println("Starting Thread 2");		
		Thread t2 = new Thread(new Task("Thread-B"));
		t2.start();
		
		System.out.println("Starting Thread 3");		
		Thread t3 = new Thread(new Runnable() {			
			@Override
			public void run() {
				
				for(int i = 0; i < 10; i++) {
					System.out.println("number: " + i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {			
						e.printStackTrace();
					}
				}
			}
		});
		t3.start();	

	}
	
}

class Task implements Runnable{
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for(int i = 0; i < 10; i++) {
			System.out.println("number: " + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
	
	
}