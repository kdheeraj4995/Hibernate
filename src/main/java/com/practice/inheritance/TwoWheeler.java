package com.practice.inheritance;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
	private String SteeringBar;

	public String getSteeringBar() {
		return SteeringBar;
	}

	public void setSteeringBar(String steeringBar) {
		SteeringBar = steeringBar;
	}

}
