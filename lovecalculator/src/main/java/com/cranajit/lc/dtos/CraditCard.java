package com.cranajit.lc.dtos;

public class CraditCard {
	private String first;
	private String second;
	private String third;
	private String forth;
	public CraditCard(String first, String second, String third, String forth) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
	}
	public CraditCard() {
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getThird() {
		return third;
	}
	public void setThird(String third) {
		this.third = third;
	}
	public String getForth() {
		return forth;
	}
	public void setForth(String forth) {
		this.forth = forth;
	}
	@Override
	public String toString() {
		return first + "-" + second + "-" + third + "-" + forth;
	}	
}
