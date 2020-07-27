package com.cranajit.lc.dtos;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginDTO {
	@NotBlank(message = "* userid should not be blank")
	@Size(max = 10, min = 3, message = "* userid should be more then 3 characters and less then 10")
	private String userid;
	
	@NotBlank(message = "* password should not be blank")
	@Size(max = 10, min = 3, message = "* password should be more then 3 characters and less then 10")
	private String password;
	
	@AssertTrue(message = "* please check terms before proceeding")
	private boolean terms;
	
	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	public LoginDTO(String userid, String password, boolean terms) {
		this.userid = userid;
		this.password = password;
		this.terms = terms;
	}
	public LoginDTO() {
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
