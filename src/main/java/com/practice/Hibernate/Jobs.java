package com.practice.Hibernate;

import javax.persistence.Embeddable;


@Embeddable
public class Jobs {
private String company_name;
	private String job_profile;

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getJob_profile() {
		return job_profile;
	}

	public void setJob_profile(String job_profile) {
		this.job_profile = job_profile;
	}
}
