package com.java8;

public interface MusicInterface {
	
	public void getSinger();
	
	public void getMovie();
	
	default void play() {
		System.out.println("Music is playing");
	}
	
	default void stop() {
		System.out.println("Music stoped");
	}

	public static void resume() {
		System.out.println("music is resumed");
	}
}
