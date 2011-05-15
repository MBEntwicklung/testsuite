/**
 * 
 */
package de.mbentwicklung.testsuite.systemtest.hibernate;


import junit.framework.TestResult;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.ProjectState;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testresult;
import de.mbentwicklung.testsuite.service.entity.Testrun;
import de.mbentwicklung.testsuite.service.hibernate.HibernateUtil;

/**
 * @author marc
 *
 */
public class HibernateConnectionTest {

	private SessionFactory sessionFactory;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	@Test
	public void testProjectConnection() throws Exception {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Project project = new Project("Testprojekt2", "Der erste Hibernate Test");
		
		session.save(project);
		
		session.getTransaction().commit();
	}
	
	@Test
	public void testTestcaseConnection() throws Exception {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Testcase testcase = new Testcase(0, 0, "Testcase", "Ein Testcase", "Schritte", "Ergebnis");
		
		session.save(testcase);
		
		session.getTransaction().commit();
	}
	
	@Test
	public void testTestrunConnection() throws Exception {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Testrun testrun = new Testrun(0, 0, System.currentTimeMillis(), "Bemerkung", "Marc Bellmann");
		
		session.save(testrun);
		
		session.getTransaction().commit();
	}
	
	@Test
	public void testTestresultConnection() throws Exception {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Testresult testresult = new Testresult(0, 0, 0, "Marc Bellmann", System.currentTimeMillis(), ProjectState.SUCCESSFUL, "Bemerkung");
		
		session.save(testresult);
		
		session.getTransaction().commit();
	}
}
