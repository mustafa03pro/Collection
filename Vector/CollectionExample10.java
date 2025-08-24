package com.mustafa.Aug11.Vector;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionExample10 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(50);
		al.add(25);
		
		ListIterator li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		li.add(22);
		System.out.println(li.hasNext());
	}

}
