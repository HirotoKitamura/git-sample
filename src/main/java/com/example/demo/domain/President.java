package com.example.demo.domain;

public class President extends Employee {
	private String NumOfmember;

	public String getNumOfmember() {
		return NumOfmember;
	}

	public void setNumOfmember(String numOfmember) {
		NumOfmember = numOfmember;
	}

	@Override
	public String toString() {
		return "President [NumOfmember=" + NumOfmember + ", depId=" + depId + "]";
	}
	
}
