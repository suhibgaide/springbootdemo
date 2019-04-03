package com.howtodoinjava.demo.controller;

public class Car {

	public Car() {

	}

	public Car(Integer id, String CarName, String ManufarcturerName) {
		super();
		this.id = id;
		this.CarName = CarName;
		this.ManufarcturerName = ManufarcturerName;
		 
	}

	private Integer id;
	private String CarName;
	private String ManufarcturerName;

	// getters and setters

	@Override
	public String toString() {
		return "Car [id=" + id + ", Car Name=" + CarName + ", Manufarcturer Name=" + ManufarcturerName +  "]";
	}
}