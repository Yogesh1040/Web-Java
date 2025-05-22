package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;

import com.app.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Student student = new Student("A", "B", "a@a.com");

		// Save

		System.out.println("Saving Student....");
		session.persist(student);
		System.out.println("Saved Student "+ student);
		
		//create
		
		Course c1 = new Course("Spring");
		Course c2 = new Course("JAVA");
		
		c1.add(student);
		c2.add(student);
		
		
		//Save
		
		System.out.println("Saving Student----");
		session.persist(c1);
		session.persist(c2);
		System.out.println("Saved Student "+student.getCourses());

		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
	}
}
