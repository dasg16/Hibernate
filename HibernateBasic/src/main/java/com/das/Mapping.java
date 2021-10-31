package com.das;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String args[]) {
		Laptop laptop1 = new Laptop();
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop1.setlId("1");
		laptop1.setlName("Dell");
		laptop.add(0, laptop1);

		laptop1 = new Laptop();

//		laptop1.setlId("2");
//		laptop1.setlName("Lenovo");
//		laptop.add(1, laptop1);

		Student student = new Student();
		student.setsMarks("90");
		student.setsName("Gourav");
		student.setsRollNumber("20219");
		student.getLaptop().addAll(laptop);

		System.out.println("Here is the laptop object " + laptop);

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
