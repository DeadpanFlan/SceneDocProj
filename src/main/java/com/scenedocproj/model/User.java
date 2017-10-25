package com.scenedocproj.model;

import java.util.Date;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String firstname;
	private String middlename;
	private String lastname;
	private String username;
	private byte gender;
	private boolean active;
	private boolean admin;
	private Date created;
	private Date updated;

	protected User(){

	}

	public User(String f, String m, String l, String u, byte g, Boolean active, Boolean admin, Date created, Date updated){
		this.setFirstname(f);
		this.setMiddlename(m);
		this.setLastname(l);
		this.setUsername(u);
		this.setGender(g);

		this.setActive(active);
		this.setAdmin(admin);

		 this.setCreated(created);
		 this.setUpdated(updated);

	}

	public Long getId() {
        return id;
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
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
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
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@PreUpdate
	@PrePersist
	public void updateTimeStamps() {
	    updated = new Date();
	    if (created==null) {
	      created = new Date();
	    }
	}

}
