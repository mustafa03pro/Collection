package com.mustafa.Aug14.Collection2;

import java.util.ArrayList;

public class Library {
	private  ArrayList<Book> books;

	public Library() {
		books = new ArrayList<>();
		
		
	}
	public void addBook(Book book) {
		if (book == null) {
            System.out.println("Cannot add null book.");
            return;
        }
        Book existingBook = searchBookByISBN(book.getIsbn());
        if (existingBook != null) {
            System.out.println("Book with the same ISBN " + book.getIsbn() + " already exists.");
        } else {
            books.add(book);
            System.out.println("Book added successfully.");
        }
		
	}
	private Book searchBookByISBN(long isbn) {
		
		
		for (Book b : books) {
            if (b.getIsbn() == isbn) {
                return b;
            }
        }
        return null;

		
		
	}
	public  void displayAllBooks() {
		if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
		for(Book b:books) {
			System.out.println(b.displayBook());
			
		}
        }
		
		
	}
	public void updateBookQuantityByISBN(long isbn,int newQuantity) {
		Book book = searchBookByISBN(isbn);
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }
        if (newQuantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }
        book.setQuantity(newQuantity);
        System.out.println("Quantity updated successfully. new quantity = " + newQuantity);
		
		
	}
	public void  deleteBookByTitle(String title) {
		if (title == null || title.trim().isEmpty()) {
            System.out.println("Book Title cannot be blank");
            return;
        }
        boolean removed = books.removeIf(b -> b.getTitle().equalsIgnoreCase(title.trim()));
        if (removed) {
            System.out.println(title + " book has removed successfully...");
        } else {
            System.out.println("No book found with title: " + title);
        }
    
		
	}

}
