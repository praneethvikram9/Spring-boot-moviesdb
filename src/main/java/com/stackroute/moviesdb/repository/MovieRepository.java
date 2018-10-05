package com.stackroute.moviesdb.repository;

import com.stackroute.moviesdb.domain.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies,Integer> {

}
