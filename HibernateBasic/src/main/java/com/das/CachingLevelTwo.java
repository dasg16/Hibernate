package com.das;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingLevelTwo {
	public static void main(String args[]) {

		// Caching Level 2: We need-
		// 2 Properties in hibernate.cfg.xml
		// 2 dependencies ehcache and hibernate-ehcache and
		// hibernate-ehcache must have the same version as the core hibernate
		// 2 annotation in the entity(Alien.java)

		Alien aline = new Alien();
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		Transaction transaction1 = session1.beginTransaction();

		// To fetch the values from the DB
		aline = (Alien) session1.get(Alien.class, "105");
		System.out.println(aline);

		transaction1.commit();
		session1.close();

		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();

		aline = (Alien) session2.get(Alien.class, "105");
		System.out.println(aline);

		transaction2.commit();
		session2.close();
	}
}
