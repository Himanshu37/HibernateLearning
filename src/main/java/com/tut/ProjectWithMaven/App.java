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
        
//       Address ad1 = new Address();
//       ad1.setStreet("Gali 1");
//       ad1.setCity("Kulchandu");
//       ad1.setOpen(true);
//       ad1.setAddedDate(new Date());
//       
//       FileInputStream fis = new FileInputStream("src/main/java/img.jpg");
//       byte[] data = new byte[fis.available()];
//       
//       ad1.setImage(data);
        
        Student st1 = new Student();
        st1.setId(2);
        st1.setName("Amit Saini");
        st1.setCity("Chandigarh");
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session sess = factory.openSession();
        
        Transaction trans = sess.beginTransaction();
        
        sess.persist(st1);
        
        trans.commit();
        
        sess.close();
        
    }
}
