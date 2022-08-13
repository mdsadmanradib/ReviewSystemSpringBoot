package net.javaguides.rsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.rsm.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Long>{


}
