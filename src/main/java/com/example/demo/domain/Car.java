package com.example.demo.domain;

public class Car {
	private Integer speed;
	private String name;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}
	
}
