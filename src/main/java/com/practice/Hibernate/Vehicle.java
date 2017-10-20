package com.practice.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int Vehicle_Id;
	private String Vehicle_name;

	public int getVehicle_Id() {
		return Vehicle_Id;
	}

	public void setVehicle_Id(int vehicle_Id) {
		Vehicle_Id = vehicle_Id;
	}

	public String getVehicle_name() {
		return Vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		Vehicle_name = vehicle_name;
	}

	
}
