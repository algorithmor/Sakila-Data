package com.sakila.entities;
// Generated Nov 10, 2017 10:25:35 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * JailerConfig generated by hbm2java
 */
@Entity
@Table(name = "jailer_config", catalog = "sakila")
public class JailerConfig implements java.io.Serializable {

	private JailerConfigId id;

	public JailerConfig() {
	}

	public JailerConfig(JailerConfigId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "jversion", column = @Column(name = "jversion", length = 20)),
			@AttributeOverride(name = "jkey", column = @Column(name = "jkey", length = 200)),
			@AttributeOverride(name = "jvalue", column = @Column(name = "jvalue", length = 200)) })
	public JailerConfigId getId() {
		return this.id;
	}

	public void setId(JailerConfigId id) {
		this.id = id;
	}

}
