package com.practice.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Motor Bike")
public class TwoWheeler extends Vehicle {
	private String SteeringBar;

	public String getSteeringBar() {
		return SteeringBar;
	}

	public void setSteeringBar(String steeringBar) {
		SteeringBar = steeringBar;
	}

}
