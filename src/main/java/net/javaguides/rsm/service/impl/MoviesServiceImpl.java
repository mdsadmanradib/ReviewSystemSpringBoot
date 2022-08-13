package net.javaguides.rsm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.rsm.entity.Movies;
import net.javaguides.rsm.repository.MoviesRepository;
import net.javaguides.rsm.service.MoviesService;
@Service
public class MoviesServiceImpl implements MoviesService{
	
	private MoviesRepository movieRepository; 

	public MoviesServiceImpl(MoviesRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public List<Movies> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movies saveMovie(Movies movie) {
		
		return movieRepository.save(movie);
	}

	@Override
	public Movies getMovieById(Long id) {
		
		return movieRepository.findById(id).get();
	}

	@Override
	public Movies updateMovies(Movies movie) {
		
		return movieRepository.save(movie);
	}
	
	public void deleteMovieById(Long id) {
		movieRepository.deleteById(id);
	}

	
}
