package de.mbentwicklung.testsuite.service;

import java.util.Collection;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testresult;
import de.mbentwicklung.testsuite.service.entity.Testrun;

public interface DataProvider {

	/** Get All Datas from a entity */
	Collection<Project> getAllProjects();
	Collection<Testcase> getAllTestcases();
	Collection<Testresult> getAllTestresults();
	Collection<Testrun> getAllTestruns();
	
	/** Get one Data from the entity id */
	Project getProject(final Long projectId);
	Testcase getTestcase(final Long testcaseId);
	Testrun getTestrun(final Long testrunId);
	Testresult getTestresult(final Long testresultId);

	/** Save one Data from a special entity */
	void saveProject(Project project);
	void saveTestcase(Testcase testcase);
	void saveTestresult(Testresult testresult);
	void saveTestrun(Testrun testrun);

	/** Remove one Data from a special entity */
	void removeProject(Project project);
	void removeTestcase(Testcase testcase);
	void removeTestresult(Testresult testresult);
	void removeTestrun(Testrun testrun);
	
	/** Give Datas from a foreign key */
	Collection<Testcase> getTestcasesFromProject(final long projectId);
	Collection<Testrun> getTestrunsFromProject(final long projectId);
	Collection<Testresult> getTestresultsFromTestrun(final long testrunId);
	Collection<Testresult> getTestresultsFromTestcase(final long testcaseId);

	/** Give the last testrun from a project */
	Testrun getLastTestrun(final Long projectId);
}