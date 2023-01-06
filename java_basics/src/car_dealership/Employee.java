package car_dealership;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if (finance) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);			
		}else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			//pays in cash
			processTransaction(cust, vehicle);
		}else {
			System.out.println("customer will need more money to purchase the vehicle");
		}
	
	}

	private void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		
		System.out.println("customer has been approved to purchase the vehicle!");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " + vehicle + " for the price " + vehicle.getPrice());
	}
	
}
