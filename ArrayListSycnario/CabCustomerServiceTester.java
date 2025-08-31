package com.mustafa.Aug19.ArrayListScenario;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer(108, "praveen", "malakpet", "ameerpet", 4, "9010234566");
		CustomerService list=new CustomerService();
		list.addCustomer(c1);
		
		//System.out.println();
		list.calculateBill(c1);
	    System.out.println(list.Print(c1));
	

	}

}
