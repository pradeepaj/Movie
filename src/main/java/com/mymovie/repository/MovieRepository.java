package com.mymovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymovie.entity.Movie;
@Repository
public interface MovieRepository  extends JpaRepository<Movie,Integer>{

	Movie findByMovieId(int mveId);



}
