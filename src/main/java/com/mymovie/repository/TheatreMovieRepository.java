package com.mymovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymovie.entity.TheatreMovie;
@Repository
public interface TheatreMovieRepository extends JpaRepository<TheatreMovie,Integer> {

	TheatreMovie findByTheatreMovieId(int th);

}
