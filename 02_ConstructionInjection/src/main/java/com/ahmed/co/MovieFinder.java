package com.ahmed.co;

import java.util.ArrayList;
import java.util.List;

//Dependency Class
public class MovieFinder {

	ArrayList<Movie> movieFinder;

	public MovieFinder() {
		movieFinder = new ArrayList<>();
		movieFinder.add(new Movie(2024, "pushpa2"));
		movieFinder.add(new Movie(2024, "lucky basaer"));
		movieFinder.add(new Movie(2024, "bhool bhulliya"));
		movieFinder.add(new Movie(2025, "kgf2"));
		movieFinder.add(new Movie(2025, "pathan"));
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
