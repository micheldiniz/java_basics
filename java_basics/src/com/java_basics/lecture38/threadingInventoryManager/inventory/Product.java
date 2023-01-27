package com.java_basics.lecture38.threadingInventoryManager.inventory;

public class Product {
	int id;
	String nome;

	public Product(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + "]";
	}
}
