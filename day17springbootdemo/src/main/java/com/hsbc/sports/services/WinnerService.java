package com.hsbc.sports.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.sports.models.Winner;
import com.hsbc.sports.repositories.WinnerRepository;

@Service
public class WinnerService {
	
	@Autowired
	//connected to winner repo.
	private WinnerRepository winnerRepo;
	
	//insert query
	public Winner addWinner(Winner winner)
	{
		return winnerRepo.save(winner);
	}
	
	//select all query
	
	public List<Winner> getAllWinner()
	{
		return (winnerRepo).findAll();
	}
	
	//select by player name.
	//no primary key.
	public List<Winner> getByPlayerName(String playerName)
	{
		return winnerRepo.findByPlayerName(playerName);
	}
	
}
