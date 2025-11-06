package com.ahmed.co;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

//Dependent Class
public class MovieLister {

	MovieFinder movieFinder; 

	public MovieLister(MovieFinder movieFinder) { // construction injection
		this.movieFinder = movieFinder;
	}

	public void showMovies(int year) {
		List<Movie> movies = movieFinder.getMovies(year); //calling dependency class method 

		if (movies == null || movies.isEmpty()) {// checking if the year does not contains movies 
			System.out.println("No movies found in this year : " + year);

		} else {
			System.out.println("Movies released in year :" + year);
			for (Movie movie : movies) {
				System.out.println(movie.getYear() + " -- " + movie.getName());
			}
		}

	}
}
