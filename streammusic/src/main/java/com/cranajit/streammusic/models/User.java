package com.cranajit.streammusic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users_info")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private long id;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "languages")
	private String languages;

	@Column(name = "email")
	private String email;

	public User() {
	}

	public User(long id, String phone, String firstName, String lastName, String password, String gender,
			String country, String languages, String email) {
		super();
		this.id = id;
		this.phone = phone;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.gender = gender;
		this.country = country;
		this.languages = languages;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phone=" + phone + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", gender=" + gender + ", country=" + country + ", languages="
				+ languages + ", email=" + email + "]";
	}

}


/**
 * 
 * @author cranajit
 * CREATE TABLE users_info (userId int UNIQUE, 
 * phone varchar(15) PRIMARY KEY, 
 * firstName varchar(15), 
 * lastName varchar(15), 
 * password varchar(20), 
 * gender varchar(15), 
 * country varchar(15), 
 * languages varchar(50),
 * email varchar(15));
 *
 */

/*
 INSERT INTO users_info VALUES (1, '7980705729', 'Ranajit', 'Chandra','qwerty', 'male', 'India', 'English, Bengali', 'rjc22aug@gmail.com')
 */
