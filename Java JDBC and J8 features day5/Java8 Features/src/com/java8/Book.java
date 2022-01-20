package com.org.functinolinterface;

public class Book {
	
	private int id;
	
	private String name;
	
	private int pages;
	
	public Book(int id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPages() {
		return pages;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}
	

}
