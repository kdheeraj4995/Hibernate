package com.practice.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	@Id
	@GeneratedValue
	private int Vehicle_Id;
	private String Vehicle_name;
	private String Reg_State;

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

	public String getReg_State() {
		return Reg_State;
	}

	public void setReg_State(String reg_State) {
		Reg_State = reg_State;
	}
}
