/**
 * 
 */
package de.mbentwicklung.testsuite.service.utils;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import de.mbentwicklung.testsuite.service.entity.ProjectState;
import de.mbentwicklung.testsuite.service.entity.Testresult;

/**
 * @author Marc Bellmann
 * 
 */
public class TestrunUtilsTest {

	private TestrunUtils testrunUtils;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testrunUtils = new TestrunUtils();
	}

	@Test
	public void testCalculateTestrunStatus() throws Exception {
		List<Testresult> testresults = new ArrayList<Testresult>();
		testresults.add(new Testresult(1L, 0L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 1L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(1L, 2L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 3L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 4L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(1L, 5L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 6L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(1L, 7L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 8L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 9L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(1L, 9L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));

		float expectedResult = 0.3f;

		Assert.assertEquals(expectedResult, testrunUtils.calculateTestrunStatus(1L, testresults));

	}

}
