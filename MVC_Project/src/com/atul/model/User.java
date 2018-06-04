package com.atul.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {
	@Id 
	@GeneratedValue
	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String userId;
	private String password;
//	@Lob
//	@Column(name="photo",columnDefinition="BLOB")
//	private byte[] photo;
	//
	public User() {
    }
 
     //parasmterized constructor
    public User(String firstName, String middleName, String lastName, String email, String userId, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.userId = userId;
        this.password = password;
    }
    //setters and getters
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
    

}
