package com.practice.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String args[]) {
		Vehicle vehicle =  new Vehicle();
		vehicle.setVehicle_name("Vehicle Name");
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setSteeringBar("Steering Bar");
		twoWheeler.setVehicle_name("Fz");
		
		FourWheeler fourWheeler= new FourWheeler();
		fourWheeler.setSteeringWheel("Power Steering");
		fourWheeler.setVehicle_name("Swift");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		session.getTransaction().commit();
		session.close();
	}
}
