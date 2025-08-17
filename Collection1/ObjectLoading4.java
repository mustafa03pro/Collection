package com.mustafa.aug07.collection;

import java.util.Enumeration;
import java.util.Vector;

public class ObjectLoading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		Enumeration<String> e=ListOfCity.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
				

	}

}
