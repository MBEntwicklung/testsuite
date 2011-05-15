/**
 * 
 */
package de.mbentwicklung.testsuite.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 * @author marc
 * 
 */
public class DatabaseGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.close();
	}
}
