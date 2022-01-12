package com.movietask;

public class SpecialMovie extends Movie{

	private String soundEffects;
	
	private String visualEffects;

	public SpecialMovie(String name, String producedBy, String directedBy, int duration, int year, String category, String soundEffects, String visualEffects) {
		super(name, producedBy, directedBy, duration, year, category);
		this.soundEffects = soundEffects;
		this.visualEffects = visualEffects;
	}

	public SpecialMovie(String name, String producedBy, String directedBy, int duration, int year, String category) {
		super(name, producedBy, directedBy, duration, year, category);
	
	}
	public SpecialMovie(String name, String producedBy) {
		super(name, producedBy);
	}

	public String getSoundEffects() {
		return soundEffects;
	}

	public String getVisualEffects() {
		return visualEffects;
	}

	public void setSoundEffects(String soundEffects) {
		this.soundEffects = soundEffects;
	}

	public void setVisualEffects(String visualEffects) {
		this.visualEffects = visualEffects;
	}

	public void showInSpecialMovie() {
		super.showDetails();
		System.out.println("Show method called in Special movie class");
	}
}
