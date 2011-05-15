/**
 * 
 */
package de.mbentwicklung.testsuite.service.utils;

import java.util.Collection;
import java.util.Collections;

import de.mbentwicklung.testsuite.service.DataProvider;
import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.ProjectState;
import de.mbentwicklung.testsuite.service.entity.Testresult;
import de.mbentwicklung.testsuite.service.entity.Testrun;

/**
 * @author Marc Bellman
 * 
 */
public class TestrunUtils {

	public static float calculateTestresultStatusSuccessful(Collection<Testresult> testresults) {
		float i = 0;

		for (Testresult testresult : testresults) {
			if (testresult.getStatus() == ProjectState.SUCCESSFUL) {
				i++;
			}
		}

		if (testresults.size() == 0) {
			return 0;
		}

		return i / (float) testresults.size();
	}

	public static Collection<Testresult> getLastTestresults(final DataProvider dataProvider, final Project project) {
		if (dataProvider == null)
			throw new IllegalArgumentException("dataProvider is null");
		if (project == null)
			throw new IllegalArgumentException("project is null");

		Testrun testrun = dataProvider.getLastTestrun(project.getId());
		if (testrun == null)
			return Collections.emptyList();

		return dataProvider.getTestresultsFromTestrun(testrun.getId());
	}
}
