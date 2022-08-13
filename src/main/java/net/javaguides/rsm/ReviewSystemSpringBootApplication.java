package net.javaguides.rsm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.rsm.entity.Movies;
import net.javaguides.rsm.repository.MoviesRepository;

@SpringBootApplication
public class ReviewSystemSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ReviewSystemSpringBootApplication.class, args);
	}

	@Autowired
	private MoviesRepository moviesRepository;
	@Override
	public void run(String... args) throws Exception {

	}

}
