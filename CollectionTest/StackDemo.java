package com.mustafa.Aug16.CollectionTest;
import java.util.ArrayList;
import java.util.Scanner;
class StackTest{
	private ArrayList<Integer> stack;
	public StackTest() {
		stack=new ArrayList<>();
	}
	public  void Push(int element) {
			stack.add(element);
		
	}
	public int Pop() {
		if(isEmpty()) {
			System.err.println("stck is empty cannot access");
			return -1;
		}
		
		return stack.remove(stack.size()-1);
	}
	public int Peek() {
		if(isEmpty()) {
			System.err.println("stck is empty cannot access");
			return -1;
		}
		return stack.get(stack.size()-1);
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public boolean isEmpty2() {
		if(stack.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

public class StackDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StackTest stack=new StackTest();
		System.out.println("enter the number to push");
		int num=sc.nextInt();
		stack.Push(num);
		stack.Push(20);
		stack.Push(30);
		
		System.out.println(stack.Pop());
		//System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Peek());
		System.out.println(stack.Pop());
		System.out.println(stack.isEmpty2());
		

	}

}
