package com.sakila.entities;
// Generated Nov 10, 2017 10:25:35 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * JailerConfigId generated by hbm2java
 */
@Embeddable
public class JailerConfigId implements java.io.Serializable {

	private String jversion;
	private String jkey;
	private String jvalue;

	public JailerConfigId() {
	}

	public JailerConfigId(String jversion, String jkey, String jvalue) {
		this.jversion = jversion;
		this.jkey = jkey;
		this.jvalue = jvalue;
	}

	@Column(name = "jversion", length = 20)
	public String getJversion() {
		return this.jversion;
	}

	public void setJversion(String jversion) {
		this.jversion = jversion;
	}

	@Column(name = "jkey", length = 200)
	public String getJkey() {
		return this.jkey;
	}

	public void setJkey(String jkey) {
		this.jkey = jkey;
	}

	@Column(name = "jvalue", length = 200)
	public String getJvalue() {
		return this.jvalue;
	}

	public void setJvalue(String jvalue) {
		this.jvalue = jvalue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof JailerConfigId))
			return false;
		JailerConfigId castOther = (JailerConfigId) other;

		return ((this.getJversion() == castOther.getJversion()) || (this.getJversion() != null
				&& castOther.getJversion() != null && this.getJversion().equals(castOther.getJversion())))
				&& ((this.getJkey() == castOther.getJkey()) || (this.getJkey() != null && castOther.getJkey() != null
						&& this.getJkey().equals(castOther.getJkey())))
				&& ((this.getJvalue() == castOther.getJvalue()) || (this.getJvalue() != null
						&& castOther.getJvalue() != null && this.getJvalue().equals(castOther.getJvalue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getJversion() == null ? 0 : this.getJversion().hashCode());
		result = 37 * result + (getJkey() == null ? 0 : this.getJkey().hashCode());
		result = 37 * result + (getJvalue() == null ? 0 : this.getJvalue().hashCode());
		return result;
	}

}
