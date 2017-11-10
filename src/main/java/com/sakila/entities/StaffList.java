package com.sakila.entities;
// Generated Nov 10, 2017 10:25:35 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * StaffList generated by hbm2java
 */
@Entity
@Table(name = "staff_list", catalog = "sakila")
public class StaffList implements java.io.Serializable {

	private StaffListId id;

	public StaffList() {
	}

	public StaffList(StaffListId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false)),
			@AttributeOverride(name = "name", column = @Column(name = "name", length = 91)),
			@AttributeOverride(name = "address", column = @Column(name = "address", nullable = false, length = 50)),
			@AttributeOverride(name = "zipCode", column = @Column(name = "zip code", length = 10)),
			@AttributeOverride(name = "phone", column = @Column(name = "phone", nullable = false, length = 20)),
			@AttributeOverride(name = "city", column = @Column(name = "city", nullable = false, length = 50)),
			@AttributeOverride(name = "country", column = @Column(name = "country", nullable = false, length = 50)),
			@AttributeOverride(name = "sid", column = @Column(name = "SID", nullable = false)) })
	public StaffListId getId() {
		return this.id;
	}

	public void setId(StaffListId id) {
		this.id = id;
	}

}
