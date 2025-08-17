package com.mustafa.aug07.collection;

import java.util.Spliterator;
import java.util.Vector;

public class ObjectLoading8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		Spliterator<String> spliterator=ListOfCity.spliterator();
	     spliterator.forEachRemaining(city->System.out.println(city.toUpperCase()));

	}

}
