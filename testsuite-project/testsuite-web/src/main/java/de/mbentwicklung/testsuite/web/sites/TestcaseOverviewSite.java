/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils;

/**
 * @author Marc Bellmann
 * 
 */
public class TestcaseOverviewSite extends AbstractSite {

	private static final long serialVersionUID = 6811220839826098793L;

	public static final String SPRING_ID ="testcaseOverview";
	
	private Testcase testcase;
	private Project project;

	@Override
	public Component buildMainComponent(Object... argumente) {

		testcase = TestsuiteWebUtils.getTestcaseFromArguments(argumente);
		project = TestsuiteWebUtils.getProjectFromArguments(argumente);

		if (testcase == null || project == null ) {
			throw new IllegalArgumentException("testcase or project not set");
		}
		
		Panel mainPanel = new Panel(testcase.getName());

		mainPanel.setWidth(WINDOW_WIDTH);

		
		mainPanel.addComponent(buildButtonPanel());
		
		return mainPanel;
	}

	@SuppressWarnings("serial")
	private Component buildButtonPanel() {
		Panel panel = new Panel();
		
		Button backProject = new Button("Zurück zum Projekt");
		backProject.addListener(new Button.ClickListener() {
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_OVERVIEW), project);
			}
		});
		
		panel.addComponent(backProject);
		
		return panel;
	}

}
