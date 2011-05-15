/**
 * 
 */
package de.mbentwicklung.testsuite.service.entity;

import static junit.framework.Assert.*;

import org.junit.Test;

import de.mbentwicklung.testsuite.service.entity.Project;

/**
 * @author Marc Bellmann
 * 
 */
public class ProjectTest {

	@Test
	public void testNewProject() throws Exception {
		String title = "Titel";
		String description = "Beschreibung";

		Project project = new Project(title, description);

		assertEquals(title, project.getName());
		assertEquals(description, project.getDescription());
	}

}
