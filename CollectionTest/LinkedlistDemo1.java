package com.mustafa.Aug16.CollectionTest;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedlistDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		
		
		for(int i=0;i<size;i++) {
			list.add(sc.next());
		}
		ListIterator<String> iterator=list.listIterator(list.size());
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		

	}

}
