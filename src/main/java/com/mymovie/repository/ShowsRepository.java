package com.mymovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymovie.entity.Shows;


public interface ShowsRepository extends JpaRepository<Shows,Integer>{

	Shows findByTheatreMovieId(int thm);

}
