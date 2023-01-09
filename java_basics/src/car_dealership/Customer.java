package car_dealership;

public class Customer implements Comparable<Customer>{

	private String name;
	private String address;
	private double cashOnHand;

	
	public Customer(double d) {
		this.cashOnHand = d;
	}

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		
		emp.handleCustomer(this, finance, vehicle);
		

	}

	@Override
	public int compareTo(Customer o) {
		if(cashOnHand < o.getCashOnHand()) {
			return 1;
		}else if(cashOnHand > o.getCashOnHand()) {
			return -1;
		}else {
			return 0;
		}		
	}
}