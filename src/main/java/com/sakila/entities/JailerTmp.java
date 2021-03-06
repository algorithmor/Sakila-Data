package com.sakila.entities;
// Generated Nov 10, 2017 10:25:35 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * JailerTmp generated by hbm2java
 */
@Entity
@Table(name = "jailer_tmp", catalog = "sakila")
public class JailerTmp implements java.io.Serializable {

	private JailerTmpId id;

	public JailerTmp() {
	}

	public JailerTmp(JailerTmpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "c1", column = @Column(name = "c1")),
			@AttributeOverride(name = "c2", column = @Column(name = "c2")) })
	public JailerTmpId getId() {
		return this.id;
	}

	public void setId(JailerTmpId id) {
		this.id = id;
	}

}
