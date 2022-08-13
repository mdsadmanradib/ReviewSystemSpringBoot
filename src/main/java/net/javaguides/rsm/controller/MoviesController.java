package net.javaguides.rsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.rsm.entity.Movies;
import net.javaguides.rsm.service.MoviesService;

@Controller
public class MoviesController {
	
	private MoviesService moviesService;

	public MoviesController(MoviesService moviesService) {
		super();
		this.moviesService = moviesService;
	}
	@GetMapping("/movies")
	public String listMovies(Model model) {
		model.addAttribute("movies", moviesService.getAllMovies());
		return "movies";
	}
	@GetMapping("/movies/new")
	public String CreateMoviesForm(Model model) {
		Movies movie = new Movies();
		model.addAttribute("movie", movie);
		return "create_movies";
		
	}
	@PostMapping("/movies")
	public String saveMovies(@ModelAttribute("movie") Movies movie) {
		moviesService.saveMovie(movie);
		return "redirect:/movies";
		
	}
	@GetMapping("/movies/edit/{id}")
	public String editMovieForm(@PathVariable Long id, Model model) {
		model.addAttribute("movie", moviesService.getMovieById(id));
		return "edit_movie";
		
	}
	@PostMapping("/movies/{id}")
	public String updateMovie(@PathVariable Long id,
		@ModelAttribute("movie") Movies movie, Model model){
		Movies existingMovie = moviesService.getMovieById(id);
		existingMovie.setId(id);
		existingMovie.setName(movie.getName());
		existingMovie.setDirName(movie.getDirName());
		existingMovie.setRelease(movie.getRelease());
		existingMovie.setRating(movie.getRating());
		existingMovie.setStatus(movie.getStatus());
		
		moviesService.updateMovies(existingMovie);
		return  "redirect:/movies";
			
		}
	@GetMapping("/movies/{id}")
	public String deleteMovie(@PathVariable Long id) {
		moviesService.deleteMovieById(id);
		return "redirect:/movies";
	}
}


