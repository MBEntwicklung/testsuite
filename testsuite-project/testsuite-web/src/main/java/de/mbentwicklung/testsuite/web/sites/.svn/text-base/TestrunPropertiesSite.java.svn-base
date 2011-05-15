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
import com.vaadin.ui.VerticalLayout;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.service.entity.Testrun;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils;

/**
 * @author Marc Bellmann
 * 
 */
public class TestrunPropertiesSite extends AbstractSite {

	private static final long serialVersionUID = -8508687835427899156L;

	public static final String SPRING_ID ="testrunProperties";
	
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
			testrun = new Testrun();
		}

		Panel mainPanel = new Panel("Neuer Testlauf");

		mainPanel.setWidth(WINDOW_WIDTH);

		mainPanel.addComponent(buildNewTestrunTextFieldPanel());

		return mainPanel;
	}

	@SuppressWarnings("serial")
	private Component buildNewTestrunTextFieldPanel() {
		VerticalLayout layout = new VerticalLayout();

		final RichTextArea textAreaComment = new RichTextArea();
		final TextField textAreaAuthor = new TextField();

		textAreaComment.setCaption("Kommentar");
		textAreaAuthor.setCaption("Autor");

		HorizontalLayout buttonLayout = new HorizontalLayout();

		Button newTestrun = new Button("Neuen Testrun anlegen");
		newTestrun.addListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				doCreateNewTestrun(textAreaComment.getValue().toString(), textAreaAuthor.getValue().toString());
			}
		});
		Button backProject = new Button("Zurück zur Übersicht");
		backProject.addListener(new Button.ClickListener() {
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.PROJECT_OVERVIEW), project);
			}
		});

		buttonLayout.addComponent(newTestrun);
		buttonLayout.addComponent(backProject);

		layout.addComponent(textAreaComment);
		layout.addComponent(textAreaAuthor);
		layout.addComponent(buttonLayout);

		return layout;
	}

	private void doCreateNewTestrun(final String comment, final String author) {
		testrun.setAuthor(author);
		testrun.setComment(comment);
		testrun.setDate(System.currentTimeMillis());
		testrun.setProjectId(project.getId());

		dataProvider.saveTestrun(testrun);
		navigateTo(new NavigationEvent(AvailableSites.TESTRUN_OVERVIEW), project, testrun);
	}
}
