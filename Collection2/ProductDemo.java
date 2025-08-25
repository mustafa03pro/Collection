package com.mustafa.Aug12.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> proList=new ArrayList<Product>();
		proList.add(new Product(102,"java", 30000D));
		proList.add(new Product(105,"python", 40000D));
		proList.add(new Product(101,"data", 20000D));
		proList.add(new Product(104,"c", 10000D));
		
      Collections.sort(proList);
      proList.forEach(System.out::println);
	    
	}

}
