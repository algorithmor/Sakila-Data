package com.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sakila.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{

	public List<Actor> findByFirstNameAndLastName(String firstName,String lastName);
	
	public List<Actor> findByFirstName(String firstName);
	
	public List<Actor> findByLastName(String lastName);
	
}
