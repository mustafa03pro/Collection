package com.mustafa.aug07.collection;

import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;

public class ObjectLoading7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> ListOfCity=new Vector<>();
		ListOfCity.add("hyderabad");
		ListOfCity.add("Mumbai");
		ListOfCity.add("Delhi");
		ListOfCity.add("bengulue");
		ListOfCity.add("indore");
		
		
		Consumer<String>con=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
				
			}
		};
		ListOfCity.forEach(con);
	}

}
