package com.practice.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Vehicle_Type" ,discriminatorType = DiscriminatorType.STRING)
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
