package com.mustafa.Aug12.Collection;


import java.util.Scanner;
import java.util.Vector;

public class Library {
	public void displayAvailableBooks(Vector<Book> book) {
		book.forEach(b1->System.out.println(b1));
		
	}
	public void issueBook(Vector<Book> book,Scanner sc ) {
		System.out.println("enter the book id");
		int id=Integer.parseInt(sc.nextLine());
		boolean flag=false;
		Book v=null;
		for(Book b:book) {
			if(id==b.id()) {
				flag=true;
				System.out.println("Book Issued"+b);
				v=b;
				
				
				
				
			}
			
		}
		book.remove(v);
		
		if(flag=false) {
			System.err.println("Book with ID "+id+" not Found");
		}
		
		
	}
	public void searchBook(Vector<Book> book,Scanner sc ) {
		System.out.println("enter the book name or auther name");
		String name=sc.nextLine();
		
		for(Book b:book) {
			if(b.title().equalsIgnoreCase(name)) {
				System.out.println("Book Found"+b);
				System.exit(0);
			}
			else {
				System.err.println("No matching books found.");
			}
				
			}
		}
		
		
		
	}


