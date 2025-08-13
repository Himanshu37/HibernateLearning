package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Projected Started" );
        
        Student st1 = new Student(2,"Satnam Saini" , "Delhi");
        System.out.println(st1);
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session sess = factory.openSession();
        
        Transaction trans = sess.beginTransaction();
        
        sess.persist(st1);
        
        trans.commit();
        
        sess.close();
        
    }
}
