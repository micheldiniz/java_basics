package com.java_basics.car_dealership;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class VehicleCloneableTest {

	@Test
	void shouldReturnThatTheCarIsAClone() {
		VehicleCloneable car = new VehicleCloneable("Test", "Test", 2);
		VehicleCloneable cloneCar = null;
		try {
			cloneCar = (VehicleCloneable) car.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Assert.assertEquals(car, cloneCar);
	}
	
}
