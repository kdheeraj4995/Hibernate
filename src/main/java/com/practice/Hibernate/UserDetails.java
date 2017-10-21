package com.practice.Hibernate;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="User_Details")
public class UserDetails {
	@Id
	@GeneratedValue
	private int userId;
	
	@Column(name = "first_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lname;
	
/*	private Address address;
	
	@ElementCollection
	@JoinTable(name = "UserDetails_Jobs",joinColumns = @JoinColumn(name = "user_Id"))
	@GenericGenerator(name = "sequence-gen", strategy = "sequence")
	@CollectionId(columns = { @Column(name= "Job_Id") }, generator = "sequence-gen", type = @Type(type ="long"))
	private Collection<Jobs> jobList = new ArrayList<Jobs>();*/
	
	@ManyToMany(cascade =  CascadeType.ALL , mappedBy = "userList")
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Collection<Jobs> getJobList() {
		return jobList;
	}
	public void setJobList(Collection<Jobs> jobList) {
		this.jobList = jobList;
	}*/
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	
}
