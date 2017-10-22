package com.practice.Querying;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	@SuppressWarnings({"unchecked"})
	public static void main(String args[]) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		System.out.println("Named Query");
		Query query = session.getNamedQuery("DemoData.All");
		query.setFirstResult(5);
		query.setMaxResults(3);
		List<DemoData> data = (List<DemoData>)query.getResultList();
		
		for(DemoData d:data){
			System.out.println(d.getDataName());
		}
		
		
		System.out.println();
		System.out.println("Named Query using Named Pameter setting with :parameter");
		Query query2 = session.createNamedQuery("DemoData.byName");
		query2.setParameter("Name", "Data 1");
		List<DemoData> data2 = (List<DemoData>)query2.getResultList();
		
		for(DemoData d2 :data2){
			System.out.println(d2.getDataName());
		}
		
		session.getTransaction().commit();
		session.close();
	}
}

