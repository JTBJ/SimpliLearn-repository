package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// use the session object to save Java object

			// create a student object
			System.out.println("Creating new Student object");
			Student tempStudent1 = new Student("John", "Bacon", "baconjohn@gmail.com");
			Student tempStudent2 = new Student("Mary", "French", "frenchmarys@gmail.com");
			Student tempStudent3 = new Student("Adam", "Mofit", "mofitadam@gmail.com");
			Student tempStudent4 = new Student("Thomas", "Baily", "bailythomas@gmail.com");

			// start transaction
			session.beginTransaction();
//			session.clear();
			// save the student object
			System.out.println("Saving the students...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.save(tempStudent4);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
