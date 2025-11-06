package com.ahmed.co;

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
