package com.hsbc.sports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.sports.models.Winner;
import com.hsbc.sports.services.WinnerService;

@RestController
public class WinnerController {

	@Autowired
	private WinnerService winnerService;
	
	@GetMapping("/winners")
	public List<Winner> getAllWinners()
	{
		return winnerService.getAllWinner();
	}
	
	//select by player name.
	
	@GetMapping("/winners/{playerName}")
	public List<Winner> getDataByPlayerName(@PathVariable("playerName") String playerName)
	{
		return winnerService.getByPlayerName(playerName);
		
	}
	
	@PostMapping("/winners")
	public @ResponseBody Winner addWinner(@RequestBody Winner winner)
	{
		return winnerService.addWinner(winner);
	}
	
}
