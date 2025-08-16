package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Emb {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Certificate certi = new Certificate("Java","2 months");
		Student st = new Student();
		st.setId(1);
		st.setName("Himanshu Saini");
		st.setCity("Kulchandu");
		st.setCertificate(certi);
		
		session.persist(st);
		
		transaction.commit();
		session.close();
		factory.close();
		
	}
}
