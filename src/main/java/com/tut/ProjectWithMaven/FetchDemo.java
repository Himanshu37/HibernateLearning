package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student st = (Student)session.get(Student.class, 1);
		
		
//		Student st = new Student();
//		session.load(st, 2);
		System.out.println(st);
		session.close();
		sessionFactory.close();
	}
}
