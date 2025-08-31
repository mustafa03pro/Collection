package com.mustafa.Aug19.ArrayListScenario;

public record Customer(Integer custId,
        String customerName,
        String pickupLocation,
        String dropLocation,
        Integer distance,
        String phone) {
	public Customer{
		if(custId<=0) {
			new  IllegalArgumentException("Validation Error: Customer ID must be positive.");
		}
		if(customerName.isBlank()) {
			new IllegalArgumentException("Validation Error: Customer name cannot be null or blank.");
		}
		if(pickupLocation.isBlank()) {
			new IllegalArgumentException("Validation Error: Pickup location cannot be null or blank.");
		}
		if(dropLocation.isBlank()) {
			new IllegalArgumentException("Validation Error: Drop location cannot be null or blank.");
		}
		if(phone.length()==10) {
			new IllegalArgumentException("Validation Error: Phone number must be 10 digits only.");
		}
	}
	

}
