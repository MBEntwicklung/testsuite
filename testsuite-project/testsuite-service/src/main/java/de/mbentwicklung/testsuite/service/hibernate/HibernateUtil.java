/**
 * 
 */
package de.mbentwicklung.testsuite.service.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author marc
 *
 */
public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;
	
	static {
		SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
