package com.joaogosmani.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogosmani.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
