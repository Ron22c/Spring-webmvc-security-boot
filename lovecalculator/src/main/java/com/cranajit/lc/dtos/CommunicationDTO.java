package com.cranajit.lc.dtos;

import com.cranajit.lc.validators.PhoneValidator;

public class CommunicationDTO {
	private String email;
	
	@PhoneValidator
	private Phone phone;
	public CommunicationDTO(String email, Phone phone) {
		this.email = email;
		this.phone = phone;
	}
	public CommunicationDTO() {
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CommunicationDTO [email=" + email + ", phone=" + phone + "]";
	}
	
}
