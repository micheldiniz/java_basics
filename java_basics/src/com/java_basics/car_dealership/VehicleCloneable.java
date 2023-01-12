package com.java_basics.car_dealership;

import java.util.Objects;

public class VehicleCloneable implements Cloneable{

	private String make;
	private String model;
	private double price;
	
	public VehicleCloneable(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {	
		return this.getMake();
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleCloneable other = (VehicleCloneable) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	
}
