package car_dealership;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;



class CustomerTest {

	@Test
	void theLastCustomerShoudBeTheOneWithMoreMoney(){
		Customer c1 = new Customer(100.0);
		Customer c2 = new Customer(200.0);
		Customer c3 = new Customer(52.5);
		Customer c4 = new Customer(10.0);
		List<Customer> customers = Arrays.asList(c1, c2, c3, c4);
		Collections.sort(customers);

		Assert.assertEquals(200.0, customers.get(0).getCashOnHand());
		
	}

}

