package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
				//start transaction
			session.beginTransaction();
			
			//query students
			List<Student> theStudent = session.createQuery("from Student").list();
			displayStudents(theStudent);
			
			//query students: lastName='French'
			theStudent = session.createQuery("from Student s where s.lastName='French'").list();
			
			//display students
			System.out.println("\n\nStudents with the last name of French");
			displayStudents(theStudent);
			
			//query students: lastName='Benton' OR firstName='Adam'
			theStudent = session.createQuery("from Student s where s.lastName='Benton'" +
											 " OR s.firstName='Adam'").list();
			System.out.println("\n\nStudents with the last name of Benton or first name of Adam");
			displayStudents(theStudent);
			
			//query students where email LIKE '%gmail.com'
			theStudent = session.createQuery("from Student s where s.email LIKE '%gmail.com'").list();
			System.out.println("\n\nStudents where email LIKE '%gmail.com'");
			displayStudents(theStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudent) {
		for(Student tempStudent :theStudent) {
			System.out.println(tempStudent);
		}
	}

}
