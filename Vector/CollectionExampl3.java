package com.mustafa.Aug11.Vector;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExampl3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.print(it+" ");
	}

}
