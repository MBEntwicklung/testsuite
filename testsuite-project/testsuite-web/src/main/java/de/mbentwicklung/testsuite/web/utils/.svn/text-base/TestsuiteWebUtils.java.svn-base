/**
 * 
 */
package de.mbentwicklung.testsuite.web.utils;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testrun;

/**
 * @author Marc Bellmann
 * 
 */
public final class TestsuiteWebUtils {

	public final static Testcase getTestcaseFromArguments(final Object[] arguments) {
		Testcase retTestcase = null;

		for (Object object : arguments) {
			if (object instanceof Testcase) {
				retTestcase = (Testcase) object;
			}
		}

		return retTestcase;
	}

	public final static Project getProjectFromArguments(final Object[] arguments) {
		Project retProject = null;

		for (Object object : arguments) {
			if (object instanceof Project) {
				retProject = (Project) object;
			}
		}

		return retProject;
	}

	public final static Testrun getTestrunFromArguments(final Object[] arguments) {
		Testrun retTestrun = null;

		for (Object object : arguments) {
			if (object instanceof Testrun) {
				retTestrun = (Testrun) object;
			}
		}

		return retTestrun;
	}

	// public final static float calculatePercentSuccessfullTestcases(final
	// Collection<Testcase> testcases) {
	//
	// if (testcases == null || testcases.size() == 0) {
	// return 0;
	// }
	//
	// float countSuccessfull = calculateCountSuccessfullTestcases(testcases);
	//
	// countSuccessfull = countSuccessfull / testcases.size();
	//
	// return countSuccessfull;
	// }
	//
	// public final static int calculateCountSuccessfullTestcases(final
	// Collection<Testcase> testcases) {
	//
	// if (testcases == null || testcases.size() == 0) {
	// return 0;
	// }
	//
	// int countSuccessfull = 0;
	// for (Testcase testcase : testcases) {
	// if (testcase.getState() == ProjectState.SUCCESSFUL)
	// countSuccessfull++;
	// }
	//
	// return countSuccessfull;
	// }
}
