package com.practice.Querying;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	@SuppressWarnings({"unchecked", "deprecation"})
	public static void main(String args[]) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		System.out.println("Offset : 5  and  Max Results : 3");
		Query query = session.createQuery("from DemoData");
		query.setFirstResult(5);
		query.setMaxResults(3);
		List<DemoData> data = (List<DemoData>)query.getResultList();
		
		for(DemoData d:data){
			System.out.println(d.getDataName());
		}
		
		System.out.println();
		System.out.println("Query using Position Parameter setting with ? ");
		@SuppressWarnings("rawtypes")
		org.hibernate.Query query1 = session.createQuery("from DemoData where dataName = ?");
		query1.setString(0, "Data 9");
		List<DemoData> data1 = (List<DemoData>)query1.getResultList();
		
		for(DemoData d1 :data1){
			System.out.println(d1.getDataName());
		}
		
		System.out.println();
		System.out.println("Query using Named Pameter setting with :parameter");
		Query query2 = session.createQuery("from DemoData where dataName =:Name");
		query2.setParameter("Name", "Data 1");
		List<DemoData> data2 = (List<DemoData>)query2.getResultList();
		
		for(DemoData d2 :data2){
			System.out.println(d2.getDataName());
		}
		
		session.getTransaction().commit();
		session.close();
	}
}

