package com.movietask;

public class InternationalMovie extends Movie {

	public InternationalMovie(String name, String producedBy, String directedBy, int duration, int year,
			String category,String country, String language) {
		super(name, producedBy, directedBy, duration, year, category);
		this.country = country;
		this.language = language;
	}

	public InternationalMovie(String name, String producedBy, String directedBy, int duration, int year,
			String category) {
		super(name, producedBy, directedBy, duration, year, category);
		// TODO Auto-generated constructor stub
	}

	public InternationalMovie(String name, String producedBy) {
		super(name, producedBy);
		// TODO Auto-generated constructor stub
	}
	
	private String country;

	private String language;


	public String getCountry() {
		return country;
	}

	public String getLanguage() {
		return language;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void show() {
		super.showDetails();
		System.out.println("Method called in Internations class");
	}
}
