/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Select;
import com.vaadin.ui.Table;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.BaseTheme;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.ProjectState;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testresult;
import de.mbentwicklung.testsuite.service.entity.Testrun;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils;

/**
 * @author Marc Bellmann
 * 
 */
public class TestrunOverviewSite extends AbstractSite {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8508687835427899156L;

	public static final String SPRING_ID = "testrunOverview";

	private Project project;
	private Testrun testrun;

	@Override
	public Component buildMainComponent(Object... argumente) {

		project = TestsuiteWebUtils.getProjectFromArguments(argumente);
		testrun = TestsuiteWebUtils.getTestrunFromArguments(argumente);

		if (project == null) {
			throw new IllegalArgumentException("project is not Set");
		}

		if (testrun == null) {
			throw new IllegalArgumentException("testrun is not Set");
		}

		Panel mainPanel = new Panel("Testlauf");

		mainPanel.setWidth(WINDOW_WIDTH);

		mainPanel.addComponent(buildTestcaseTable());
		mainPanel.addComponent(buildActionPanel());

		return mainPanel;
	}

	private Component buildTestcaseTable() {
		Panel testcasePanel = new Panel();

		Table table = new Table();
		table.setSelectable(true);
		table.setMultiSelect(false);
		table.setWidth("100%");
		table.setPageLength(20);

		table.addContainerProperty("Weitere Infos", Button.class, "Weitere Infos");
		table.addContainerProperty("Name", String.class, "Name");
		table.addContainerProperty("Status", Select.class, "Beschreibung des Testfalls");

		for (final Testresult testresult : dataProvider.getTestresultsFromTestrun(testrun.getId())) {

			Testcase testcase = dataProvider.getTestcase(testresult.getTestcaseId());

			table.addItem(new Object[] { buildMoreInfoButton(testcase, testresult), testcase.getName(),
					buildStatusSelect(testresult), }, testresult);
		}

		testcasePanel.addComponent(table);

		return testcasePanel;
	}

	@SuppressWarnings("serial")
	private Button buildMoreInfoButton(final Testcase testcase, final Testresult testresult) {
		Button moreInfoButton = new Button("+");
		moreInfoButton.setStyleName(BaseTheme.BUTTON_LINK);

		moreInfoButton.addListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				Window window = new Window("Weitere Informationen");
				window.setWidth("400px");
				window.setHeight("400px");
				window.setModal(true);
				window.setContent(buildMoreInformationPanel(testcase, testresult));
				
				getMainWindow().addWindow(window);

			}
		});

		return moreInfoButton;
	}

	private Panel buildMoreInformationPanel(final Testcase testcase, final Testresult testresult) {
		final Panel panel = new Panel();
		final Table table = new Table();

		table.addContainerProperty("Name", String.class, "-Name-");
		table.addContainerProperty("Beschreibung", Component.class, new Label("-Component-"));
		table.setPageLength(5);

		table.addItem(new Object[] { "Name", new Label(testcase.getName()) }, 1);
		table.addItem(new Object[] { "Beschreibung", new Label(testcase.getDescription()) }, 2);
		table.addItem(new Object[] { "Notwendige Schritte", new Label(testcase.getSteps()) }, 3);
		table.addItem(new Object[] { "Erwartetes Ergebnis", new Label(testcase.getResult()) }, 4);
		table.addItem(new Object[] { "Status", buildStatusSelect(testresult) }, 5);

		panel.addComponent(table);

		return panel;
	}

	@SuppressWarnings("serial")
	private Select buildStatusSelect(final Testresult testresult) {
		Select select = new Select();
		select.setNullSelectionAllowed(false);

		for (ProjectState tmpProjectState : ProjectState.values()) {
			select.addItem(tmpProjectState);
		}

		select.setValue(testresult.getStatus());

		select.addListener(new Property.ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				ProjectState projectState = null;
				if (event.getProperty().getValue() instanceof ProjectState) {
					projectState = (ProjectState) event.getProperty().getValue();
				}
				testresult.setStatus(projectState);

				dataProvider.saveTestresult(testresult);
			}
		});

		return select;
	}

	@SuppressWarnings("serial")
	private Component buildActionPanel() {

		Button button = new Button("Zurück zur Projektseite");

		button.addListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_OVERVIEW), project);

			}
		});

		Panel actionPanel = new Panel();

		actionPanel.addComponent(button);

		return actionPanel;
	}
}
