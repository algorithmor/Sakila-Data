package com.sakila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakila.entities.Actor;
import com.sakila.repositories.ActorRepository;

@Service
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> getAllActors(){
		return actorRepository != null ? actorRepository.findAll() : null;
	}
	
	public Actor addNewActor(Actor actor) {
		return actorRepository.save(actor);
	}
	
}
