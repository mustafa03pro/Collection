package com.mustafa.Aug12.Collection;

import java.util.ArrayList;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> custList=new ArrayList<Customer>();
		custList.add(new Customer(101, "ravi", 34000d));
		custList.add(new Customer(105, "asad", 44000d));
		custList.add(new Customer(103, "zubair", 36000d));
		custList.add(new Customer(102, "sam", 54000d));
		custList.add(new Customer(104, "harry", 34000d));
		
		custList.sort((c1,c2)->c1.getCustomerNumber().compareTo(c2.getCustomerNumber()));
		custList.forEach(System.out::println);
		System.out.println("--------------------------");
		custList.sort((c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName()));
		custList.forEach(System.out::println);
		System.out.println("--------------------------");
		custList.sort((c1,c2)->c1.getCustomerBill().compareTo(c2.getCustomerBill()));
		custList.forEach(System.out::println);
		System.out.println("--------------------------");
		
		

	}

}
