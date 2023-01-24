package com.java_basics.lecture38.threadingInventoryManager.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductsList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductsList = new ArrayList<>();
	
	Vector<Product> vector = new Vector<>();
	
	
	public void populateSoldProducts() {
		for(int i=0; i<1000;i++) {
			Product p = new Product(i, "test_product_" + i);
			soldProductsList.add(p);
			System.out.println("ADDED: "+ p);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void displaySoldProducts() {
		for (Product product : soldProductsList) {
			System.out.println("PRINTING THE SOLD: " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
