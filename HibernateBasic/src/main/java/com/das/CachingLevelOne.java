package com.das;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingLevelOne {

	public static void main(String args[]) {

		Alien aline = new Alien();
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// To fetch the values from the DB
		aline = (Alien) session.get(Alien.class, "105");
		System.out.println(aline);

		aline = (Alien) session.get(Alien.class, "105");
		System.out.println(aline);

		transaction.commit();
		session.close();
	}

}
