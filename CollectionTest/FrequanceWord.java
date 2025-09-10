package com.mustafa.Aug23.collectionTest;

import java.util.HashMap;
import java.util.Scanner;

public class FrequanceWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		
		String sentence=sc.nextLine();
		String [] words=sentence.split(" ");
		HashMap<String, Integer> wordfeq=new HashMap<String, Integer>();
		for(String word:words) {
			wordfeq.put(word, wordfeq.getOrDefault(word, 0)+1);
		}
		wordfeq.forEach((k,v)->System.out.println(k+"->"+v));
		

	}

}
