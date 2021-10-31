package com.das;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String args[]) {

		Properties prop = new Properties();
		prop.setAlienBreedType("Zod");
		prop.setAlienFoodType("McDonalds");
		prop.setAlienNature("Aggressive");

		Alien aline = new Alien();

		// Use the following lines only to add the values to DB
		aline.setaID("101");
		aline.setaName("Gourav");
		aline.setsColor("Brown");
		aline.setaProperties(prop);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Use the following lines only to add the values to DB
		session.save(aline);

		// To fetch the values from the DB
		// aline = (Alien) session.get(Alien.class, "105");

		// System.out.println(aline);
		transaction.commit();
		session.close();
	}

}
