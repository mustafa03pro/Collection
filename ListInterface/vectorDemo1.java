package com.mustafa.Aug10.ListInterface;

import java.util.Vector;

public class vectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>(100);
		for(int i=0;i<100;i++) {
			v.add(i);
		}
		System.out.println("After adding elements"+v.capacity());
		v.add(101);
		v.add(102);
		System.out.println("After adding yhe elemennts"+v.capacity());
		for(int i=0;i<v.size();i++) {
			if(i%5==0) {
				System.out.println("");
			}
			System.out.println(v.get(i)+"\t");
		}

	}

}
