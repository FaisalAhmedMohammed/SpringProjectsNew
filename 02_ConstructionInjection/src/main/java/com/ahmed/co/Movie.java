package com.ahmed.co;
 
 // this is an independent class and it has final variables which does not contains setter method because it is final
public class Movie {
	private final int year;
	private final String name;

	public Movie(int year, String name) {
		this.year = year;
		this.name = name;
	}

	public int getYear() {
		return this.year;
	}

	public String getName() {
		return this.name;
	}

}
