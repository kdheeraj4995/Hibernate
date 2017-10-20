package com.practice.Hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	
	private Address address;
	
	@JoinTable(name = "UserDetails_Jobs",joinColumns = @JoinColumn(name = "user_Id"))
	@ElementCollection
	private Set<Jobs> jobList = new HashSet<Jobs>();
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Jobs> getJobList() {
		return jobList;
	}
	public void setJobList(Set<Jobs> jobList) {
		this.jobList = jobList;
	}

}
