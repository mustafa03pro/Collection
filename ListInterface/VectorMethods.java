package com.mustafa.Aug10.ListInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		int x[]= {22,45,3,65,78,65,4};
		for(int i=0;i<x.length;i++) {
			v.add(x[i]);
		}
		System.out.println("the maximum in array : "+Collections.max(v));
		System.out.println("the minimum in array : "+Collections.min(v));
		System.out.println("vector elements :");
	     v.forEach(y->System.out.println(y));
	     System.out.println("----------------");
	     System.out.println("afetr reverse ");
	     Collections.reverse(v);
	     v.forEach(y->System.out.println(y));

	}

}
