package com.mustafa.Aug19.ArrayListScenario;

import java.util.ArrayList;

public class CustomerService {
	private   ArrayList<Customer> customers;
	public CustomerService() {
		customers=new ArrayList<Customer>();
	}
	public void  addCustomer(Customer customer) {
		customers.add(customer);
	
		
	}
	private boolean isFirstCustomer(Customer customer) {
		for(Customer custom:customers) {
			if(custom.phone()==customer.phone()) {
				System.out.println("New customer");
				return false;
			}else 
			{
				System.out.println("Old");
				
			}
		}
		return false;
	}
	public double calculateBill(Customer customer) {
		for(Customer custom:customers) {
			if(isFirstCustomer(custom))
			{
				
				return 0;
				
			}else if(customer.distance()<=4){
				return 80;
				
			}else 
			{
		        return 80+customer.distance()*6;
			}
			
		}
		return customer.distance();
		
		
		
	}
	public String Print(Customer customer) {
		return customer.customerName()+" Please pay your bill of Rs."+calculateBill(customer);
	}

	
	


}
