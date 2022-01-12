package com.movietask;

public class MovieMainTask {

	public static void main(String[] args) {
		InternationalMovie internationalMovie = new InternationalMovie("3idiots", "RR Productions");
		internationalMovie.show();
		
		SpecialMovie specialMovie = new SpecialMovie("Avengers", "marvels", "pkd drf", 2, 2014, "Actions");
		specialMovie.showInSpecialMovie();
	}

}
