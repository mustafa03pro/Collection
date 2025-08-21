package com.mustafa.Aug10.ListInterface;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<String>();
		ListOfCity.add("hyderbad");
		ListOfCity.add("ooty");
		ListOfCity.add("mumbai");
		ListOfCity.add("delhi");
		ListOfCity.add("aune");
		ListOfCity.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(ListOfCity);
		
		

	}

}
