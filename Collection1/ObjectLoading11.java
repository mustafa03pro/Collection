package com.mustafa.aug07.collection;

import java.io.PrintStream;
import java.util.Vector;

public class ObjectLoading11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		ListOfCity.parallelStream().forEach(System.out::println);

	}

}
