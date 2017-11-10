package com.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sakila.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{

}
