package com.mustafa.aug07.collection;

import java.util.Vector;
import java.util.function.Consumer;

public class ObjectLoading10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		ListOfCity.forEach(city ->System.out.println(city.toUpperCase()));

	}

}
