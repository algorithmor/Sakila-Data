package com.sakila.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sakila.dto.ActorDTO;
import com.sakila.entities.Actor;
import com.sakila.service.ActorService;

@Controller
@RequestMapping(path="/actors") // This means URL's start with /actor (after Application path)
public class ActorController {
	
	@Autowired // Bean for interface automatically implemented by Spring
	private ActorService actorService;
	
	/*
	 * This will add an Actor without any films.
	 * Its like a newcomer who hasn't got a break into the industry yet.
	 * Best of luck to them !! 
	 */
	@PostMapping(path="/addNewActor")
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public ActorDTO addNewUser (@RequestParam String firstName
			, @RequestParam String lastName) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		ActorDTO data = new ActorDTO(firstName,lastName);
		ModelMapper modelMapper = new ModelMapper();
		Actor actor = modelMapper.map(data, Actor.class);
		actor = actorService.addNewActor(actor);
		ActorDTO result = modelMapper.map(actor, ActorDTO.class);
		return result;
	}
	
	@GetMapping(path="/listAll")
	public @ResponseBody Iterable<ActorDTO> getAllUsers() {
		List<Actor> actors = actorService.getAllActors();
		ModelMapper modelMapper = new ModelMapper();
		List<ActorDTO> result = new ArrayList<ActorDTO>();
		for(Actor a : actors) {
			result.add(modelMapper.map(a,ActorDTO.class));
		}
		return result;
	}
	
	@GetMapping(path="/findActorByName/{firstName}")
	public @ResponseBody Iterable<ActorDTO> findActorByName(@PathVariable("firstName") String firstName) {
		List<Actor> actors = actorService.getActorByFirstName(firstName);
		ModelMapper modelMapper = new ModelMapper();
		List<ActorDTO> result = new ArrayList<ActorDTO>();
		for(Actor a : actors) {
			result.add(modelMapper.map(a,ActorDTO.class));
		}
		return result;
	}
}

