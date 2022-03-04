package com.telusko.springMVC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="AllNames",uniqueConstraints= {
		@UniqueConstraint(columnNames = "nid"),
		@UniqueConstraint(columnNames = "name")
		}
)
public class SaveName {

	@Id 
	private String nid;
	@Column(unique=true)
	private String name;
	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
