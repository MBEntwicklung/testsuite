package de.mbentwicklung.testsuite.service.entity;

import static junit.framework.Assert.*;

import org.junit.Test;

import de.mbentwicklung.testsuite.service.entity.Testcase;

public class TestcaseTest {

	@Test
	public void testNewTestcase() throws Exception {
		Long projectId = 2L;
		String title = "Title";
		String description = "Description";
		String schritte = "Schritte";
		String ergebnis = "Ergebnis";

		Testcase testcase = new Testcase(projectId, title, description, schritte, ergebnis);

		assertEquals(projectId, testcase.getProjectId());
		assertEquals(title, testcase.getName());
		assertEquals(description, testcase.getDescription());
		assertEquals(schritte, testcase.getSteps());
		assertEquals(ergebnis, testcase.getResult());
	}

}
