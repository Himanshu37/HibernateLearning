package com.tut.ProjectWithMaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Projected Started" );
        
       Address ad1 = new Address();
       ad1.setStreet("Gali 1");
       ad1.setCity("Kulchandu");
       ad1.setOpen(true);
       ad1.setAddedDate(new Date());
       
       FileInputStream fis = new FileInputStream("src/main/java/img.jpg");
       byte[] data = new byte[fis.available()];
       
       ad1.setImage(data);
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session sess = factory.openSession();
        
        Transaction trans = sess.beginTransaction();
        
        sess.persist(ad1);
        
        trans.commit();
        
        sess.close();
        
    }
}
