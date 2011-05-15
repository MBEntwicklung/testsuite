/**
 * 
 */
package de.mbentwicklung.testsuite.service;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Marc Bellmann
 * 
 */
public class SQLDataProviderTest {

	private DataProvider dataProvider;

	@Before
	public void setUp() throws Exception {
		dataProvider = new SQLDataProvider();
	}

	/**
	 * 
	 * @throws Exception
	 *             Fehler?
	 */
	@Test
	public void testGetAllProjects() throws Exception {
		assertNotNull(dataProvider.getAllProjects());
		assertFalse(dataProvider.getAllProjects().isEmpty());
	}

	/**
	 * 
	 * @throws Exception
	 *             Fehler?
	 */
	@Test
	public void testGetTests() throws Exception {
		assertNotNull(dataProvider.getTestcasesFromProject(0));
		assertFalse(dataProvider.getTestcasesFromProject(0).isEmpty());
	}

	/**
	 * 
	 * @throws Exception
	 *             Fehler?
	 */
	@Test
	public void testGetAllTestcases() throws Exception {
		assertNotNull(dataProvider.getAllTestcases());
		assertFalse(dataProvider.getAllTestcases().isEmpty());
	}

	/**
	 * 
	 * @throws Exception
	 *             Fehler?
	 */
	@Test
	public void testGetAllTestresults() throws Exception {
		assertNotNull(dataProvider.getAllTestresults());
		assertFalse(dataProvider.getAllTestresults().isEmpty());
	}

	/**
	 * 
	 * @throws Exception
	 *             Fehler?
	 */
	@Test
	public void testGetAllTestruns() throws Exception {
		assertNotNull(dataProvider.getAllTestruns());
		assertFalse(dataProvider.getAllTestruns().isEmpty());
	}
}
