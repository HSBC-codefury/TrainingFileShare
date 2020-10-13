package com.hsbc.sports.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hsbc.sports.models.Winner;

public interface WinnerRepository extends JpaRepository<Winner, Integer>{

	//jpaql query.
	
	//query is based on class not on table(difference between jpaql and derby query).
	@Query("select winner from Winner winner where winner.winnerName=:playerName")
	public List<Winner> findByPlayerName(@Param("playerName") String playerName);
}
