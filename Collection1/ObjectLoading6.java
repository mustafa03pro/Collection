package com.mustafa.aug07.collection;

import java.util.ListIterator;
import java.util.Vector;

public class ObjectLoading6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		
		ListIterator<String> listitr=ListOfCity.listIterator();
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		System.out.println("------------------------");
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}

	}

}
