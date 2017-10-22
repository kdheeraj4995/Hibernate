package com.practice.inheritance;

import java.util.List;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Vehicle");
		query.setFirstResult(5);
		query.setMaxResults(3);
		List<Vehicle> vehicles =   query.getResultList();
		
		for ( Vehicle vehicle: vehicles){
			System.out.println(vehicle.getVehicle_Id()+"  "+vehicle.getVehicle_name()+"  "+vehicle.getReg_State());
		}
		
		
		
		

		session.getTransaction().commit();
		session.close();
	}
}
