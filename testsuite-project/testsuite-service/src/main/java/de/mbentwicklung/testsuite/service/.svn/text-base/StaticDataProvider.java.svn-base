/**
 * 
 */
package de.mbentwicklung.testsuite.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.ProjectState;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testresult;
import de.mbentwicklung.testsuite.service.entity.Testrun;

/**
 * @author Marc Bellmann
 * 
 */
public class StaticDataProvider implements DataProvider {

	private final List<Testcase> testcases = new ArrayList<Testcase>();
	private final List<Project> projects = new ArrayList<Project>();
	private final List<Testrun> testruns = new ArrayList<Testrun>();
	private final List<Testresult> testresults = new ArrayList<Testresult>();

	/**
	 * 
	 */
	public StaticDataProvider() {
		projects.add(new Project("Projekt 1", "Beschreibung des Projektes"));
		projects.add(new Project("Projekt 2", "Beschreibung des Projektes"));
		projects.add(new Project("Projekt 3", "Beschreibung des Projektes"));
		projects.add(new Project("Projekt 4", "Beschreibung des Projektes"));
		projects.add(new Project("Projekt 5", "Beschreibung des Projektes"));
		projects.add(new Project("Projekt 6", "Beschreibung des Projektes"));
		projects.add(new Project("Projekt 7", "Beschreibung des Projektes"));

		testcases.add(new Testcase(1L, "Testfall 1", "Beschr", "Schritte", "Erwartetes Ergebnis"));
		testcases.add(new Testcase(1L, "Testfall 2", "Beschreibung", "", ""));
		testcases.add(new Testcase(1L, "Testfall 3", "Beschreibung", "", ""));
		testcases.add(new Testcase(1L, "Testfall 4", "Beschg", "", ""));
		testcases.add(new Testcase(1L, "Testfall 5", "Beschreibung", "", ""));
		testcases.add(new Testcase(1L, "Testfall 6", "Beschr.", "", ""));
		testcases.add(new Testcase(2L, "Testfall 7", "Beschreibung", "", ""));
		testcases.add(new Testcase(2L, "Testfall 8", "Beschreibung", "", ""));
		testcases.add(new Testcase(2L, "Testfall 9", "Beschreibung", "", ""));
		testcases.add(new Testcase(3L, "Testfall 10", "Beschr.", "", ""));
		testcases.add(new Testcase(3L, "Testfall 11", "Beschr.", "", ""));
		testcases.add(new Testcase(3L, "Testfall 12", "Beschreibung", "", ""));
		testcases.add(new Testcase(3L, "Testfall 13", "Beschreibung", "", ""));
		testcases.add(new Testcase(3L, "Testfall 14", "Beschr.", "", ""));
		testcases.add(new Testcase(3L, "Testfall 15", "Beschreibung", "", ""));
		testcases.add(new Testcase(4L, "Testfall 16", "Beschreibung", "", ""));
		testcases.add(new Testcase(4L, "Testfall 17", "Beschr", "", ""));
		testcases.add(new Testcase(4L, "Testfall 18", "Beschreibung", "", ""));
		testcases.add(new Testcase(4L, "Testfall 19", "Beschreibung", "", ""));
		testcases.add(new Testcase(5L, "Testfall 20", "Beschreibung", "", ""));
		testcases.add(new Testcase(5L, "Testfall 21", "Beschreibung", "", ""));

		testruns.add(new Testrun(1L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(2L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(3L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(4L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(5L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(1L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(1L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(2L, 1, "Kommentar", "Marc Bellmann"));
		testruns.add(new Testrun(1L, 1, "Kommentar", "Marc Bellmann"));

		testresults.add(new Testresult(1L, 1L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(1L, 1L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(1L, 1L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(1L, 1L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(1L, 6L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(1L, 6L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(1L, 7L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(1L, 9L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(2L, 2L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(2L, 2L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(2L, 2L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(2L, 8L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(3L, 3L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(4L, 4L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(4L, 4L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(4L, 4L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(4L, 4L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(4L, 4L, "Marc Bellmann", 1, ProjectState.OPEN, "Kommentar"));
		testresults.add(new Testresult(4L, 4L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.SUCCESSFUL, "Kommentar"));
		testresults.add(new Testresult(5L, 5L, "Marc Bellmann", 1, ProjectState.INCOMPLETE, "Kommentar"));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.mbentwicklung.testsuite.service.DataProvider#getAllTests()
	 */
	@Override
	public Collection<Testcase> getAllTestcases() {
		return testcases;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.mbentwicklung.testsuite.service.DataProvider#getAllProjects()
	 */
	@Override
	public Collection<Project> getAllProjects() {
		return projects;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.mbentwicklung.testsuite.service.DataProvider#getTests(int)
	 */
	@Override
	public Collection<Testcase> getTestcasesFromProject(final long projectId) {
		ArrayList<Testcase> resultTestcases = new ArrayList<Testcase>();

		for (Testcase testcase : testcases) {
			if (testcase.getProjectId() == projectId)
				resultTestcases.add(testcase);
		}

		return resultTestcases;
	}

	@Override
	public Collection<Testresult> getAllTestresults() {
		return testresults;
	}

	@Override
	public Collection<Testrun> getAllTestruns() {
		return testruns;
	}

	@Override
	public void saveProject(Project newProject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTestcase(Testcase newTestcase) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTestresult(Testresult newTestresult) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTestrun(Testrun newTestrun) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<Testrun> getTestrunsFromProject(long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Testresult> getTestresultsFromTestrun(long testrunId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Testrun getLastTestrun(Long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Testcase getTestcase(Long testcaseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getProject(Long projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Testrun getTestrun(Long testrunId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Testresult getTestresult(Long testresultId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeProject(Project project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTestcase(Testcase testcase) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTestresult(Testresult testresult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTestrun(Testrun testrun) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Testresult> getTestresultsFromTestcase(long testcaseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
