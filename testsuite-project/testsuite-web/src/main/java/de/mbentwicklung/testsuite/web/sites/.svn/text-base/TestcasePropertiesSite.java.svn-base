/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testcase;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils;

/**
 * @author marc
 * 
 */
public class TestcasePropertiesSite extends AbstractSite {

	private static final long serialVersionUID = 4797737343141349626L;

	public static final String SPRING_ID ="testcaseProperties";
	
	private boolean editMode = false;
	private Testcase testcase;
	private Project project;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.mbentwicklung.testsuite.web.sites.Site#generateMainComponent()
	 */
	@SuppressWarnings("serial")
	@Override
	public Component buildMainComponent(Object... argumente) {

		project = TestsuiteWebUtils.getProjectFromArguments(argumente);
		testcase = TestsuiteWebUtils.getTestcaseFromArguments(argumente);

		if (project == null) {
			throw new IllegalArgumentException("project is not set");
		}

		if (testcase != null) {
			editMode = true;
		} else {
			testcase = new Testcase();
		}

		Panel mainPanel = new Panel();
		mainPanel.setWidth(WINDOW_WIDTH);

		if (editMode) {
			mainPanel.setCaption("Testfall bearbeiten");
		} else {
			mainPanel.setCaption("Neuen Testfall anlegen");
		}

		final TextField titleField = new TextField();
		final RichTextArea descriptionField = createNewTextArea("Beschreibung");
		final RichTextArea stepsField = createNewTextArea("Schritte");
		final RichTextArea resultField = createNewTextArea("Erwartetes Ergebnis");

		Button saveButton = new Button("Erstellen und Zurück zur Projektübersicht");
		saveButton.addListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				doCreateNewTestcase(titleField.getValue().toString(), descriptionField.getValue().toString(),
						stepsField.getValue().toString(), resultField.getValue().toString());
			}
		});
		Button returnButton = new Button("Zurück zur Projektübersicht");
		returnButton.addListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_OVERVIEW), project);
			}
		});

		titleField.setCaption("Name");

		if (editMode) {
			titleField.setValue(testcase.getName());
			descriptionField.setValue(testcase.getDescription());
			stepsField.setValue(testcase.getSteps());
			resultField.setValue(testcase.getResult());
		}

		HorizontalLayout buttonLayout = new HorizontalLayout();

		buttonLayout.addComponent(returnButton);
		buttonLayout.addComponent(saveButton);

		mainPanel.addComponent(titleField);
		mainPanel.addComponent(descriptionField);
		mainPanel.addComponent(stepsField);
		mainPanel.addComponent(resultField);

		mainPanel.addComponent(buttonLayout);

		return mainPanel;
	}

	private RichTextArea createNewTextArea(final String caption) {
		RichTextArea textArea = new RichTextArea();

		textArea.setCaption(caption);
		textArea.setWidth("100%");

		return textArea;
	}

	/**
	 * 
	 */
	private void doCreateNewTestcase(final String name, final String description, final String steps,
			final String result) {

		testcase.setName(name);
		testcase.setDescription(description);
		testcase.setSteps(steps);
		testcase.setResult(result);
		testcase.setProjectId(project.getId());
		
		// TODO: Daten überprüfen
		dataProvider.saveTestcase(testcase);
		navigateTo(new NavigationEvent(AvailableSites.PROJECT_OVERVIEW), project);
	}
}
