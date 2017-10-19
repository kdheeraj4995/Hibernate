package com.practice.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		UserDetails Firstuser = new UserDetails();
		Firstuser.setFname("Ajay");
		Firstuser.setLname("Kumar");
		
		UserDetails user = new UserDetails();
		user.setFname("Dheeraj");
		user.setLname("Reddy");
		
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setCountry("India");
		
		Jobs firstJob = new Jobs();
		firstJob.setCompany_name("TechMahindra");
		firstJob.setJob_profile("Ass Software Engineer");
		
		Jobs secondJob = new Jobs();
		secondJob.setCompany_name("New Company");
		secondJob.setJob_profile("New Job Profile");
		
		Jobs job = new Jobs();
		job.setCompany_name("Tech");
		job.setJob_profile("Software Engineer");
		
		user.setAddress(address);
		user.getJobList().add(firstJob);
		user.getJobList().add(secondJob);
		
		Firstuser.getJobList().add(job);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(Firstuser);
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}
}