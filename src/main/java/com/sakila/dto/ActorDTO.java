package com.sakila.dto;

import java.util.Date;

public class ActorDTO {
	
	private Short actorId;
	private String firstName;
	private String lastName;
	private Date lastUpdate;
		
	public ActorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActorDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Short getActorId() {
		return actorId;
	}
	public void setActorId(Short actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
