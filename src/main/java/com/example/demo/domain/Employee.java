package com.example.demo.domain;

public class Employee extends Member {
	public Integer depId;

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	@Override
	public String toString() {
		return "Employee [depId=" + depId + "]";
	}
	
	
}
