package de.mbentwicklung.testsuite.web.sites;

import static de.mbentwicklung.testsuite.service.utils.TestrunUtils.calculateTestresultStatusSuccessful;
import static de.mbentwicklung.testsuite.service.utils.TestrunUtils.getLastTestresults;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.ProgressIndicator;
import com.vaadin.ui.Table;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.Reindeer;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.service.entity.Testrun;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils;

/**
 * 
 * @author Marc Bellmann
 * 
 */
public class ProjectOverviewSite extends AbstractSite {

	/** serialVersionUID */
	private static final long serialVersionUID = -8497922918846406789L;

	public static final String SPRING_ID = "projectOverview";

	private Project project;

	@Override
	public Component buildMainComponent(Object... argumente) {

		project = TestsuiteWebUtils.getProjectFromArguments(argumente);

		if (project == null) {
			navigateTo(new NavigationEvent(AvailableSites.DASHBOARD));
			return new Label("Fehlerhafter Link");
		}

		Panel mainPanel = new Panel("Projektübersicht");

		mainPanel.setWidth(WINDOW_WIDTH);

		mainPanel.addComponent(createProjectInfos());
		mainPanel.addComponent(createProjectProgressPanel());
		mainPanel.addComponent(createProjectConfigPanel());
		mainPanel.addComponent(createProjectTestcasePanel());
		mainPanel.addComponent(createProjectTestrunPanel());

		return mainPanel;
	}

	private Component createProjectInfos() {
		Panel projectInfos = new Panel(project.getName());

		Label descritionLabel = new Label(project.getDescription());

		descritionLabel.setContentMode(Label.CONTENT_XHTML);

		projectInfos.addComponent(descritionLabel);

		return projectInfos;
	}

	private Component createProjectProgressPanel() {
		Panel projectProgressPanel = new Panel("Projekt Status:");

		float percentProjectSuccessful = calculateTestresultStatusSuccessful(getLastTestresults(dataProvider, project));

		ProgressIndicator progress = new ProgressIndicator(percentProjectSuccessful);
		progress.setWidth("100%");

		projectProgressPanel.addComponent(progress);

		return projectProgressPanel;
	}

	private Component createProjectTestcasePanel() {
		Panel projectTestsPanel = new Panel("Alle Testfälle");

		Table table = new Table();
		table.setSelectable(true);
		table.setMultiSelect(false);
		table.setWidth("100%");
		table.setPageLength(10);

		table.addContainerProperty("Name", String.class, "Name");
		table.addContainerProperty("Beschreibung", String.class, "Beschreibung des Testfalls");
		table.addContainerProperty("Aktionen", Panel.class, null);

		for (final Testcase testcase : dataProvider.getTestcasesFromProject(project.getId())) {
			table.addItem(new Object[] { testcase.getName(), testcase.getDescription(),
					createTableTestcaseActionPanel(testcase) }, testcase);
		}
		projectTestsPanel.addComponent(table);
		return projectTestsPanel;
	}

	@SuppressWarnings("serial")
	private Component createProjectConfigPanel() {
		Panel projectTestsPanel = new Panel("Projekt Konfiguration");
		HorizontalLayout config = new HorizontalLayout();

		Button newTest = new Button("Neuen Testfall anlegen");
		newTest.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.TESTCASE_PROPERTIES), project);
			}
		});
		config.addComponent(newTest);

		Button testrun = new Button("Neuen Testlauf starten");
		testrun.addListener(new Button.ClickListener() {
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.TESTRUN_PROPERTIES), project);
			}
		});
		config.addComponent(testrun);

		Button editButton = new Button("Projekt bearbeiten");
		editButton.addListener(new Button.ClickListener() {
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_PROPERTIES), project);
			}
		});

		config.addComponent(editButton);
		Button backDashboard = new Button("Zurück zur Übersicht");
		backDashboard.addListener(new Button.ClickListener() {
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.DASHBOARD));
			}
		});
		config.addComponent(backDashboard);

		config.setComponentAlignment(newTest, Alignment.MIDDLE_RIGHT);
		config.setComponentAlignment(backDashboard, Alignment.MIDDLE_RIGHT);

		projectTestsPanel.addComponent(config);

		return projectTestsPanel;
	}

	/**
	 * @param testcase
	 * @return
	 */
	@SuppressWarnings("serial")
	private Panel createTableTestcaseActionPanel(final Testcase testcase) {
		Panel panel = new Panel();
		panel.setStyleName(Reindeer.PANEL_LIGHT);
		panel.setContent(new HorizontalLayout());

		Button viewButton = new Button();
		Button editButton = new Button();
		Button deleButton = new Button();

		viewButton.setStyleName(Reindeer.BUTTON_LINK);
		editButton.setStyleName(Reindeer.BUTTON_LINK);
		deleButton.setStyleName(Reindeer.BUTTON_LINK);

		viewButton.setIcon(new ThemeResource("icons/View_16.png"));
		editButton.setIcon(new ThemeResource("icons/Edit_16.png"));
		deleButton.setIcon(new ThemeResource("icons/Delete_16.png"));

		viewButton.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.TESTCASE_OVERVIEW), testcase, project);
			}
		});

		editButton.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.TESTCASE_PROPERTIES), testcase, project);
			}
		});

		deleButton.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				createDeletePopupWindow(testcase);
			}
		});

		panel.addComponent(viewButton);
		panel.addComponent(editButton);
		panel.addComponent(deleButton);
		return panel;
	}

	private Component createProjectTestrunPanel() {
		Panel testrunPanel = new Panel("Alle Testläufe");

		Table table = new Table();
		table.setSelectable(true);
		table.setMultiSelect(false);
		table.setWidth("100%");
		table.setPageLength(10);

		table.addContainerProperty("Datum - Erstellt", String.class, "Name");
		table.addContainerProperty("Datum - Letzte Änderung", String.class, "Beschreibung des Testfalls");
		table.addContainerProperty("Erfolgreich", String.class, "Offen");
		table.addContainerProperty("Offen", String.class, "Offen");
		table.addContainerProperty("Erfolgreich", String.class, "Offen");
		table.addContainerProperty("Aktionen", Panel.class, null);

		for (final Testrun testrun : dataProvider.getTestrunsFromProject(project.getId())) {
			table.addItem(new Object[] { new SimpleDateFormat().format(new Date(testrun.getDate())), testrun.getId(),
					"0", "0", createTableTestrunActionPanel(testrun) }, testrun);
		}

		testrunPanel.addComponent(table);

		return testrunPanel;
	}

	/**
	 * @param testcase
	 * @return
	 */
	@SuppressWarnings("serial")
	private Panel createTableTestrunActionPanel(final Testrun testrun) {
		Panel panel = new Panel();
		panel.setStyleName(Reindeer.PANEL_LIGHT);
		panel.setContent(new HorizontalLayout());

		Button forwardButton = new Button();
		Button archivButton = new Button();
		Button deleButton = new Button();

		forwardButton.setStyleName(Reindeer.BUTTON_LINK);
		archivButton.setStyleName(Reindeer.BUTTON_LINK);
		deleButton.setStyleName(Reindeer.BUTTON_LINK);

		forwardButton.setIcon(new ThemeResource("icons/Forward_16.png"));
		archivButton.setIcon(new ThemeResource("icons/Save_16.png"));
		deleButton.setIcon(new ThemeResource("icons/Delete_16.png"));

		forwardButton.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.TESTRUN_OVERVIEW), testrun, project);
			}
		});

		archivButton.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				// TODO: Archivieren
			}
		});

		panel.addComponent(forwardButton);
		panel.addComponent(archivButton);
		// panel.addComponent(deleButton);
		return panel;
	}

	@SuppressWarnings("serial")
	private void createDeletePopupWindow(final Testcase testcase) {
		final Window deleteWindow = new Window();
		deleteWindow.setWidth("500px");
		deleteWindow.setHeight("200px");
		deleteWindow.setModal(true);

		Panel panel = new Panel("Wollen die den Testcase \"" + testcase.getName() + "\" wirklich löschen?");
		panel.setContent(new HorizontalLayout());

		Button yes = new Button("Ja");
		yes.addListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				dataProvider.removeTestcase(testcase);
				deleteWindow.getParent().removeWindow(deleteWindow);
			}
		});

		Button no = new Button("Nein");
		no.addListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				deleteWindow.getParent().removeWindow(deleteWindow);
			}
		});

		panel.addComponent(yes);
		panel.addComponent(no);
		deleteWindow.addComponent(panel);

		getMainWindow().addWindow(deleteWindow);
	}
}
