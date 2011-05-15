/**
 * 
 */
package de.mbentwicklung.testsuite.web.utils;

import static junit.framework.Assert.*;
import static de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils.*;

import org.junit.Test;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testcase;

/**
 * @author Marc Bellmann
 * 
 */
public class TestsuiteWebUtilsTest {

	private final static Project EXAMPLE_PROJECT = new Project("Testprojekt", "Beispiel");
	private final static Testcase EXAMPLE_TESTCASE = new Testcase(1, "Test", "Beispiel", "...", "...");

	@Test
	public void testGetProject() throws Exception {
		Object[] arguments = new Object[] { new String(""), new Integer(2), EXAMPLE_PROJECT, EXAMPLE_TESTCASE };

		assertNotNull(getProjectFromArguments(arguments));
		assertEquals(EXAMPLE_PROJECT, getProjectFromArguments(arguments));
	}

	@Test
	public void testGetTestcase() throws Exception {
		Object[] arguments = new Object[] { new String(), EXAMPLE_TESTCASE };

		assertNotNull(getTestcaseFromArguments(arguments));
		assertEquals(EXAMPLE_TESTCASE, getTestcaseFromArguments(arguments));
	}

	@Test
	public void testGetProjectNull() throws Exception {
		Object[] arguments = new Object[] { new String(""), new Integer(2), EXAMPLE_TESTCASE };

		assertNull(getProjectFromArguments(arguments));
	}

	@Test
	public void testGetTestcaseNull() throws Exception {
		Object[] arguments = new Object[] { new String() };

		assertNull(getTestcaseFromArguments(arguments));
	}

}
