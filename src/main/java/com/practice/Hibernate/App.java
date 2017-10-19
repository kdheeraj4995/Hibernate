package com.practice.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setId(422894);
		user.setFname("Dheeraj");
		user.setLname("Reddy");
		
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setCountry("India");
		
		user.setAddress(address);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}
}