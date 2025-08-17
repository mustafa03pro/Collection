package com.mustafa.aug07.collection;

import java.util.Vector;

public class ObjectLoading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		
		
		for(int i=0;i<ListOfCity.size();i++) {
			System.out.println(ListOfCity.get(i));
		}

	}

}
