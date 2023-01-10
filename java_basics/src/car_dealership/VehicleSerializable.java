package car_dealership;

import java.io.Serializable;
import java.util.Objects;

public class VehicleSerializable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String make;
	private String model;
	private double price;
	
	public VehicleSerializable(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
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
		VehicleSerializable other = (VehicleSerializable) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	
}
