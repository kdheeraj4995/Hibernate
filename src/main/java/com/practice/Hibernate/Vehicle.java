package com.practice.Hibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int Vehicle_Id;
	private String Vehicle_name;
	
	@ManyToMany
	@JoinTable(name = "User_Vechicle")
	private Collection<UserDetails> userList =  new ArrayList<UserDetails>();

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

	public Collection<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
	}
	
}
