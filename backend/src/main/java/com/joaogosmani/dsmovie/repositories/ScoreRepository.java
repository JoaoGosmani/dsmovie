package com.joaogosmani.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogosmani.dsmovie.entities.Score;
import com.joaogosmani.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
