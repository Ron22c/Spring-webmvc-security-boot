package com.cranajit.lc.dtos;

import java.util.Arrays;

import com.cranajit.lc.validators.AgeValidator;

public class RegistrationDTO {
	private String name;
	private String username;
	private String password;
	private String country;
	private String[] hobby;
	private String gender;
	
	@AgeValidator
	private int age;
	private CommunicationDTO communicationDTO;
	public RegistrationDTO(String name, String username, String password, String country, String[] hobby,
			String gender, CommunicationDTO communicationDTO, int age) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.country = country;
		this.hobby = hobby;
		this.gender = gender;
		this.communicationDTO = communicationDTO;
		this.age = age;
	}
	public RegistrationDTO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "RegistrationDTO [name=" + name + ", username=" + username + ", password=" + password + ", country="
				+ country + ", hobby=" + Arrays.toString(hobby) + ", gender=" + gender + ", age=" + age
				+ ", communicationDTO=" + communicationDTO + "]";
	}
	
}
