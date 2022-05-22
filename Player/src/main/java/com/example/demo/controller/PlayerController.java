package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Player;
import com.example.demo.Service.PlayerService;

@RestController
@CrossOrigin(origins = "*")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	
	
	@PostMapping("/createPlayer")
	@CrossOrigin(origins="*")
	
	public Player savePlayer(@RequestBody Player player) throws Exception {
         String tempPlayer=player.getPlayerName();
		
		/*if(tempPlayer!=null && !"".equals(tempPlayer)) {
			Player userobj=playerService.fetchByPlayerName(tempPlayer);
		 if(userobj !=null) {
			 throw new Exception("Player  with "+player.getPlayerName()+ " is already exist"); 
		 }
		}
		*/
		return playerService.savePlayer(player);
	}
	
	@GetMapping("/getPlayers/{name}")
	@CrossOrigin(origins="*")
	public List<Player> getPlayers(@PathVariable ("name") String teamName){
		return playerService.getPlayers(teamName);
				
	}
	@GetMapping("/getPlayer/{id}")
	@CrossOrigin(origins="*")
	public Player getByPlayerId(@PathVariable("id") Long  playerId) {
		
		Player player= playerService.getByPlayerId(playerId);
		System.out.println(player);
		return player;
	}
}