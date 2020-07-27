package com.cranajit.lc.dtos;

public class PremiumRegistrationDTO {
	private String username;
	private CraditCard cardNumber;
	public PremiumRegistrationDTO(String username, CraditCard cardNumber) {
		this.username = username;
		this.cardNumber = cardNumber;
	}
	public PremiumRegistrationDTO() {
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public CraditCard getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(CraditCard cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "PremiumRegistrationDTO [username=" + username + ", cardNumber=" + cardNumber + "]";
	}
}
