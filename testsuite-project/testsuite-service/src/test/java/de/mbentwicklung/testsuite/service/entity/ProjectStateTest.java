/**
 * 
 */
package de.mbentwicklung.testsuite.service.entity;

import static junit.framework.Assert.*;

import org.junit.Test;

import de.mbentwicklung.testsuite.service.entity.ProjectState;


/**
 * @author Marc Bellmann
 *
 */
public class ProjectStateTest {

	@Test
	public void testEnum() throws Exception {
		assertNotNull(ProjectState.OPEN);
		assertNotNull(ProjectState.SUCCESSFUL);
		assertNotNull(ProjectState.INCOMPLETE);
	}
	
}
