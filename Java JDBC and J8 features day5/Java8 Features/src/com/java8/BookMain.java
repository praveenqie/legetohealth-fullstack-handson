package com.org.functinolinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class BookMain {

	public static void main(String[] args) {

		List<Book> books =  getBookLists();
		
		//using Comparator
		Collections.sort(books, new Comparator<Book>() {
			public int compare(Book t1, Book t2) {
				return Integer.compare(t2.getId(), t2.getId());
			}
		});
		books.stream().sorted((t1,t2)-> Integer.compare(t1.getId(), t2.getId())).forEach(t1->System.out.println("Sorted order"+t1.getId()));
		books.stream().sorted((t1,t2)-> Integer.compare(t1.getId(), t2.getId())).collect(Collectors.toList());
		books.stream().forEach(b-> System.out.println(b.getId()));
		
	}
	
	public static List<Book> getBookLists(){
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book(1, "cat", 100);
		Book book2 = new Book(4, "dog", 50);
		Book book3 = new Book(2, "apple", 20);
		Book book4 = new Book(3, "ball", 150);
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		return books;
	}
}
