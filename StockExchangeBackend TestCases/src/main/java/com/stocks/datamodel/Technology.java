package com.stocks.datamodel;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="technology")
public class Technology {
	@Id
	@GeneratedValue
	private long id;
	private String expertise;
	private String Language;
	@ManyToMany(mappedBy = "technology")
	@Column(name="")
	private Set<Developer> developer;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public Set<Developer> getDeveloper() {
		return developer;
	}
	public void setDeveloper(Set<Developer> developer) {
		this.developer = developer;
	}
	@Override
	public String toString() {
		return "Technology [id=" + id + ", expertise=" + expertise + ", Language=" + Language + ", developer="
				+ developer + "]";
	}

	
	
	
	
}
