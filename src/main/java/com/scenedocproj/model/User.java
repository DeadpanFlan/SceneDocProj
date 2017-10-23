package com.scenedocproj.model;

import java.util.Date;


public class User {
	private Long id;
	// String Elements
	private String firstname;
	private String middlename;
	private String lastname;
	private String username;
	private String gender;
	// Flag Elements
	private boolean isActive;
	private boolean isAdmin;
	// Date Elements
	private Date dateCreated;
	private Date dateUpdated;

	public User() {
		
	}
	
	public User(Long i, String f, String m, String l, String u, String g){
		this.setId(i);
		this.setFirstname(f);
		this.setMiddlename(m);
		this.setLastname(l);
		this.setUsername(u);
		this.setGender(g);

		this.setActive(true);
		this.setAdmin(false);

		Date tmp = new Date();
		this.setDateCreated(tmp);
		this.setDateUpdated(tmp);

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	





}