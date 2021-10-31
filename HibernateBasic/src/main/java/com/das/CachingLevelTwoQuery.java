package com.das;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingLevelTwoQuery {
	public static void main(String args[]) {

		// Caching Level 2 with Query:
		// We need to add one more property called use_query_cache in hibernate.cfg.xml
		// query2.setCacheable(true); need to be added below too.

		Alien aline = new Alien();
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		Transaction transaction1 = session1.beginTransaction();

		Query query1 = session1.createQuery("from Alien where aID = '105'");
		query1.setCacheable(true);
		aline = (Alien) query1.uniqueResult();
		System.out.println(aline);

		transaction1.commit();
		session1.close();

		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();

		Query query2 = session2.createQuery("from Alien where aID = '105'");
		query2.setCacheable(true);
		aline = (Alien) query2.uniqueResult();
		System.out.println(aline);

		transaction2.commit();
		session2.close();
	}
}
