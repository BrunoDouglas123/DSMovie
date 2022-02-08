package com.devsuperior.dsmovie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.Model.Movie;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Long>{

}
