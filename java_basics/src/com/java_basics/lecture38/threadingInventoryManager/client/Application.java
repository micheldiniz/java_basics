package com.java_basics.lecture38.threadingInventoryManager.client;

import java.awt.DisplayMode;

import com.java_basics.lecture38.threadingInventoryManager.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProducts();
			}
		});
		
		
		inventoryTask.start();		
//		inventoryTask.join();
//		Thread.sleep(5000);
		displayTask.start();
		
	}

}
