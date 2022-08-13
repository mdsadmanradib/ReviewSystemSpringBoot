package net.javaguides.rsm.service;

import java.util.List;

import net.javaguides.rsm.entity.Movies;

public interface MoviesService {
	List<Movies> getAllMovies();
	Movies saveMovie(Movies movie);
	Movies getMovieById(Long id);
	Movies updateMovies (Movies movie);
	void deleteMovieById(Long id);

}
