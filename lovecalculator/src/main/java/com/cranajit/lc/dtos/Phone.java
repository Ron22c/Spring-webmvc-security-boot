package com.cranajit.lc.dtos;

public class Phone {
	private String countryCode;
	private String number;
	public Phone() {
	}
	public Phone(String countryCode, String number) {
		super();
		this.countryCode = countryCode;
		this.number = number;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return countryCode + "-" + number;
	}
	
}
