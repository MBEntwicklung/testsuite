/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

import com.vaadin.event.MouseEvents;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.ProgressIndicator;
import com.vaadin.ui.themes.Reindeer;

import de.mbentwicklung.testsuite.service.entity.Project;
import static de.mbentwicklung.testsuite.service.utils.TestrunUtils.*;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;

/**
 * @author Marc Bellmann
 * 
 */
public class DashboardSite extends AbstractSite {

	/** */
	private static final long serialVersionUID = 3672822844706741504L;

	public static final String SPRING_ID = "dashboard";

	@Override
	public Component buildMainComponent(Object... argumente) {
		Panel mainPanel = new Panel("Dashboard");

		mainPanel.setWidth(WINDOW_WIDTH);

		mainPanel.addComponent(createTestsuiteInfoPanel());
		mainPanel.addComponent(createProjectPreviewsPanel());
		mainPanel.addComponent(createConfigPanel());
		return mainPanel;
	}

	private Component createTestsuiteInfoPanel() {
		Panel panel = new Panel("Testsuite");

		Label testsuiteDescription = new Label(getMessage("testsuite.sites.dashboard.welcome-text"));

		testsuiteDescription.setContentMode(Label.CONTENT_XHTML);

		panel.addComponent(testsuiteDescription);

		return panel;
	}

	private Component createProjectPreviewsPanel() {
		Panel projectPreviewsPanel = new Panel("Alle Projekte");

		projectPreviewsPanel.setContent(new GridLayout(3, 1));

		if (dataProvider.getAllProjects().isEmpty()) {
			projectPreviewsPanel.addComponent(new Label("Es existieren noch keine Projekte."));
		}

		for (Project project : dataProvider.getAllProjects()) {
			projectPreviewsPanel.addComponent(createProjectItem(project));
		}

		return projectPreviewsPanel;
	}

	@SuppressWarnings("serial")
	private Component createProjectItem(final Project project) {
		Panel projectPreviewPanel = new Panel();
		projectPreviewPanel.setStyleName(Reindeer.PANEL_LIGHT);
		projectPreviewPanel.setWidth("253px");

		float percentProjectSuccessful = calculateTestresultStatusSuccessful(getLastTestresults(dataProvider, project));

		ProgressIndicator progress = new ProgressIndicator();
		progress.setWidth("190px");
		progress.setValue(percentProjectSuccessful);

		projectPreviewPanel.addComponent(new Label(project.getName()));
		projectPreviewPanel.addComponent(progress);
		projectPreviewPanel.addComponent(new Label(percentProjectSuccessful * 100 + "% von "
				+ dataProvider.getTestcasesFromProject(project.getId()).size() + " Tests erfolgreich"));

		projectPreviewPanel.addListener(new MouseEvents.ClickListener() {
			public void click(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_OVERVIEW), project);
			}
		});

		return projectPreviewPanel;
	}

	@SuppressWarnings("serial")
	private Component createConfigPanel() {
		Panel configPanel = new Panel("Testsuite Konfiguration");
		HorizontalLayout config = new HorizontalLayout();

		Button newProject = new Button("Neues Projekt anlegen");
		newProject.addListener(new Button.ClickListener() {

			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_PROPERTIES));
			}
		});

		Button settings = new Button("Einstellungen");
		settings.addListener(new Button.ClickListener() {

			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.SETTING));
			}
		});

		Button testsuite = new Button("Über Testsuite");
		testsuite.addListener(new Button.ClickListener() {

			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.OVER_US));
			}
		});

		config.addComponent(newProject);
		config.addComponent(settings);
		config.addComponent(testsuite);
		
		configPanel.setContent(config);

		return configPanel;
	}
}
