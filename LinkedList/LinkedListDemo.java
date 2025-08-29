package com.mustafa.Aug17.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> list=new LinkedList();
		list.add("anand");
		list.add("rahul");
		list.add("ravi");
		list.add("dann");
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		list.addFirst("sonu");
		list.addLast("sonu2");
		System.out.println(list.getLast());
		System.out.println(list.getFirst());
		System.err.println("--------------------");
		ListIterator<Object> iterator=list.listIterator();
		iterator.forEachRemaining(System.out::println);
		
	}

}
