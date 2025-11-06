package com.ahmed.co;

import java.util.ArrayList;
import java.util.List;

//Dependency Class
public class MovieFinder {

	ArrayList<Movie> movieFinder;

	public MovieFinder() {
		movieFinder = new ArrayList<>();
		movieFinder.add(new Movie(2024, "Pushpa2"));
		movieFinder.add(new Movie(2024, "Lucky Basaer"));
		movieFinder.add(new Movie(2024, "Bhool Bhulliya"));
		movieFinder.add(new Movie(2025, "Kgf2"));
		movieFinder.add(new Movie(2025, "Pathan"));
	}

	public List<Movie> getMovies(int year) {
		ArrayList<Movie> found = new ArrayList<>();

		for (Movie movie : movieFinder) {
			if (movie.getYear() == year) {
				found.add(movie);
			}
		}
		return found;
	}

}
