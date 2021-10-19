package com.das;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String args[]) {
		Laptop laptop = new Laptop();
		laptop.setlId("1");
		laptop.setlName("Dell");

		Student student = new Student();
		student.setsMarks("90");
		student.setsName("Gourav");
		student.setsRollNumber("20219");

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// Use the following lines only to add the values to DB
		session.save(student);
		session.save(laptop);

		transaction.commit();
		session.close();

	}

}
