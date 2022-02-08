package com.devsuperior.dsmovie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmovie.Model.Score;
import com.devsuperior.dsmovie.Model.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository <Score, ScorePK>{

}
