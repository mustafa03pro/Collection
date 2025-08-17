package com.mustafa.aug07.collection;

import java.util.Vector;
import java.util.stream.Stream;

public class ObjectLoading9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		
		Stream<String> stream=ListOfCity.stream();
		ListOfCity.stream().forEach(System.out::println);

	}

}
