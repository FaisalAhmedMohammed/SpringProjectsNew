package com.ahmed.co;

import java.util.List;

//Dependent Class
public class MovieLister {

	MovieFinder movieFinder;

	public MovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void showMovies(int year) {
		List<Movie> movies = movieFinder.getMovies(year);
		for (Movie movie : movies) {
			System.out.println("Year : " + movie.getYear() + " =  Movie Name :" + movie.getName());
		}

	}
}
