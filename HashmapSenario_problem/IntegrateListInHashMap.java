package com.mustafa.Aug22.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntegrateListInHashMap {

	public static void main(String[] args) {
	    HashMap<String, List<String>> studentDetail=new HashMap<String, List<String>>();
	    studentDetail.computeIfAbsent("scott", key -> new ArrayList<String>()).add("phy");
	    studentDetail.computeIfAbsent("scott", key->new ArrayList<String>()).add("history");
	    studentDetail.computeIfAbsent("alen", key->new ArrayList<String>()).add("chm");
	    studentDetail.computeIfAbsent("alen", key->new ArrayList<String>()).add("social");
	    System.out.println(studentDetail);

	}

}
