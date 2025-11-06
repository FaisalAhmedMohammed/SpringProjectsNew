package com.ahmed.co;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

//Dependent Class
public class MovieLister {

	MovieFinder movieFinder;

	public MovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}

	public void showMovies(int year) {
		List<Movie> movies = movieFinder.getMovies(year);

		if (movies == null || movies.isEmpty()) {
			System.out.println("No movies found in this year : " + year);

		} else {
			System.out.println("Movies released in year :" + year);
			for (Movie movie : movies) {
				System.out.println(movie.getYear() + " -- " + movie.getName());
			}
		}

	}
}
