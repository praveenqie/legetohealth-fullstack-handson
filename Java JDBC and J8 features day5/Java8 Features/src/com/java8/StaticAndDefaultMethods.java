package com.java8;

public class StaticAndDefaultMethods implements MusicInterface{

	@Override
	public void getSinger() {
		// TODO Auto-generated method stub
		System.out.println("Get singer method called");
	}

	@Override
	public void getMovie() {
		// TODO Auto-generated method stub
	  System.out.println("get Movie method called");
	}
	
	@Override
	public void play() {
		System.out.println("Default play method is overided...");
	}

	public static void main(String[] args) {
		MusicInterface musicInterface = new StaticAndDefaultMethods();
		musicInterface.getSinger();
		musicInterface.getMovie();
		musicInterface.play();
		MusicInterface.resume();
	}
}
