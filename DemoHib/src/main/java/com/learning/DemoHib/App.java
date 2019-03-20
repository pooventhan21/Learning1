package com.learning.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {

		
		/*
		 * StudentName sn = new StudentName(); sn.setFname("Pooventhan");
		 * sn.setMname("Poo"); sn.setLname("Elango");
		 * 
		 * Student st1 = new Student(); st1.setSid(102); st1.setSname(sn);
		 * st1.setSclass("class102");
		 * 
		 * 
		 * Laptop lp1 = new Laptop(); lp1.setLno(1); lp1.setLapname("mac");
		 * lp1.setListStudent(st1);
		 * 
		 * 
		 * Laptop lp2 = new Laptop(); lp2.setLno(2); lp2.setLapname("dell");
		 * lp2.setListStudent(st1);
		 * 
		 * st1.getLp().add(lp1); st1.getLp().add(lp2);
		 */
		 

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student s1 = session.get(Student.class, 102);
		System.out.println(s1.getSname());
		
		//  session.save(st1); session.save(lp1); session.save(lp2); tx.commit();
		 
	}
}
