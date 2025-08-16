package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MapDemo {
	
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		Question ques = new Question();
//		ques.setQuestionId(1);
//		ques.setQuestion("What is java ?");
//		
//		Answer answer = new Answer();
//		answer.setAnswerId(101);
//		answer.setAnswer("Java is programming language");
//		
//		ques.setAnswer(answer);
//		
//		session.persist(ques);
		
		Question ques = (Question)session.get(Question.class, 1);
		System.out.println(ques.getQuestion());
		System.out.println(ques.getAnswer().getAnswer());
		
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
