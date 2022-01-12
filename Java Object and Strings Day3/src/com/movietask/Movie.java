package com.movietask;

public class Movie {

	private  String name;
	private String producedBy;
	private String directedBy;
	private  int duration;
	private int year;
	private String category;
	private static int moviesCount=0;
	private String movieId;
	

	public Movie(String name, String producedBy) {
		this.name = name;
		this.producedBy = producedBy;
	}

	public Movie(String name, String producedBy, String directedBy, int duration, int year, String category) {
		this(name, producedBy);
		this.directedBy = directedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;
	}

	public String getMovieId() {
		return this.name+"_"+moviesCount;
	}

	public String getName() {
		return name;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public int getDuration() {
		return duration;
	}

	public int getYear() {
		return year;
	}

	public String getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	static void count() {
		moviesCount++;
	}

	public  void showDetails() {
		System.out.println("Movie [name=" + name + ", producedBy=" + producedBy + ", directedBy=" + directedBy + ", duration="
				+ duration + ", year=" + year + ", category=" + category + ", movieId=" + movieId + "]");
	}

	
}
