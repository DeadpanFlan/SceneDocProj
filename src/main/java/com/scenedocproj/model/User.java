package com.scenedocproj.model;

import java.sql.Timestamp;


public class User {
	private Long id;
	// String Elements
	private String firstname;
	private String middlename;
	private String lastname;
	private String username;
	private Integer gender;
	// Flag Elements
	private boolean active;
	private boolean admin;
	// Date Elements
	private Timestamp dateCreated;
	private Timestamp dateUpdated;

	public User() {
		
	}
	
	public User(Long i, String f, String m, String l, String u, Integer g, Boolean active, Boolean admin, Timestamp created, Timestamp updated){
		this.setId(i);
		this.setFirstname(f);
		this.setMiddlename(m);
		this.setLastname(l);
		this.setUsername(u);
		this.setGender(g);

		this.setActive(active);
		this.setAdmin(admin);

		this.setDateCreated(created);
		this.setDateUpdated(updated);

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer g) {
		this.gender = g;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	





}