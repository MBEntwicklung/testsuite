/**
 * 
 */
package de.mbentwicklung.testsuite.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import de.mbentwicklung.testsuite.service.dao.ProjectDao;
import de.mbentwicklung.testsuite.service.dao.TestcaseDao;
import de.mbentwicklung.testsuite.service.dao.TestresultDao;
import de.mbentwicklung.testsuite.service.dao.TestrunDao;
import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.ProjectState;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testresult;
import de.mbentwicklung.testsuite.service.entity.Testrun;

/**
 * @author Marc Bellmann
 * 
 */
public class SQLDataProvider implements DataProvider {

	private ProjectDao projectDao;
	private TestrunDao testrunDao;
	private TestcaseDao testcaseDao;
	private TestresultDao testresultDao;

	@Override
	public Collection<Testcase> getAllTestcases() {
		return testcaseDao.readAll();
	}

	@Override
	public Collection<Project> getAllProjects() {
		return projectDao.readAll();
	}

	@Override
	public Collection<Testcase> getTestcasesFromProject(long projectId) {
		return testcaseDao.findByProjectId(projectId);
	}

	@Override
	public Collection<Testresult> getAllTestresults() {
		return testresultDao.readAll();
	}

	@Override
	public Collection<Testresult> getTestresultsFromTestrun(long testrunId) {
		return testresultDao.findByTestrunId(testrunId);
	};

	@Override
	public Collection<Testrun> getTestrunsFromProject(final long projectId) {
		return testrunDao.findByProjectId(projectId);
	}

	@Override
	public Collection<Testrun> getAllTestruns() {
		return testrunDao.readAll();
	}

	@Override
	public Testrun getLastTestrun(final Long projectId) {
		Testrun testrun = null;

		for (Testrun tmpTestrun : testrunDao.findByProjectId(projectId)) {
			if (testrun == null || testrun.getDate() < tmpTestrun.getDate()) {
				testrun = tmpTestrun;
			}
		}

		return testrun;
	}


	@Override
	public Testcase getTestcase(final Long testcaseId) {
		return testcaseDao.readByPrimaryKey(testcaseId);
	}
	@Override
	public void saveProject(Project newProject) {
		projectDao.save(newProject);
	}

	@Override
	public void saveTestcase(Testcase newTestcase) {
		testcaseDao.save(newTestcase);
	}

	@Override
	public void saveTestresult(Testresult newTestresult) {
		testresultDao.save(newTestresult);
	}

	@Override
	public void saveTestrun(Testrun newTestrun) {
		testrunDao.save(newTestrun);

		for (Testcase testcase : testcaseDao.findByProjectId(newTestrun.getProjectId())) {
			testresultDao.save(new Testresult(newTestrun.getId(), testcase.getId(), newTestrun.getAuthor(), newTestrun
					.getDate(), ProjectState.OPEN, ""));
		}
	}

	/**
	 * 
	 * @param projectDao
	 */
	@Required
	@Autowired
	public void setProjectDao(final ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	/**
	 * 
	 * @param testcaseDao
	 */
	@Required
	@Autowired
	public void setTestcaseDao(final TestcaseDao testcaseDao) {
		this.testcaseDao = testcaseDao;
	}

	/**
	 * 
	 * @param testresultDao
	 */
	@Required
	@Autowired
	public void setTestresultDao(final TestresultDao testresultDao) {
		this.testresultDao = testresultDao;
	}

	/**
	 * 
	 * @param testrunDao
	 */
	@Required
	@Autowired
	public void setTestrunDao(final TestrunDao testrunDao) {
		this.testrunDao = testrunDao;
	}

	@Override
	public Project getProject(Long projectId) {
		return projectDao.readByPrimaryKey(projectId);
	}

	@Override
	public Testrun getTestrun(Long testrunId) {
		return testrunDao.readByPrimaryKey(testrunId);
	}

	@Override
	public Testresult getTestresult(Long testresultId) {
		return testresultDao.readByPrimaryKey(testresultId);
	}

	@Override
	public void removeProject(Project project) {
		projectDao.delete(project);
	}

	@Override
	public void removeTestcase(Testcase testcase) {
		testcaseDao.delete(testcase);
	}

	@Override
	public void removeTestresult(Testresult testresult) {
		testresultDao.delete(testresult);
	}

	@Override
	public void removeTestrun(Testrun testrun) {
		testrunDao.delete(testrun);
	}

	@Override
	public Collection<Testresult> getTestresultsFromTestcase(final long testcaseId) {
		return testresultDao.findByTestcaseId(testcaseId);
	}
}
