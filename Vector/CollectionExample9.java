package com.mustafa.Aug11.Vector;

import java.util.ArrayList;

public class CollectionExample9 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add(null);
		al.add(10);
		System.out.println(al.contains(6));
		System.out.println(al.contains(10));
		System.out.println(al.contains(null));
	}

}
