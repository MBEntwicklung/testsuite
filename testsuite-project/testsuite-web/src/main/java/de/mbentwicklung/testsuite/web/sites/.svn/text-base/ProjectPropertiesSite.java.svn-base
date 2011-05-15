/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Button.ClickEvent;

import de.mbentwicklung.testsuite.service.entity.Project;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.utils.TestsuiteWebUtils;

/**
 * @author Marc Bellmann
 *
 */
public class ProjectPropertiesSite extends AbstractSite {

	/** */
	private static final long serialVersionUID = -8672921420195879580L;

	public static final String SPRING_ID ="projectProperties";
	
	private Project project;
	
	/* (non-Javadoc)
	 * @see de.mbentwicklung.testsuite.web.sites.Site#generateMainComponent()
	 */
	@SuppressWarnings("serial")
	@Override
	public Component buildMainComponent(Object... argumente) {
		
		Panel mainPanel = new Panel("Neues Projekt");
		mainPanel.setWidth(WINDOW_WIDTH);
		
		final TextField projectName = new TextField("Projektname");
		projectName.setWidth("250px");

		final RichTextArea projectDescription = new RichTextArea("Projektbeschreibung");
		projectDescription.setWidth("500px");
		

		if (TestsuiteWebUtils.getProjectFromArguments(argumente) != null) {
			project = TestsuiteWebUtils.getProjectFromArguments(argumente);
			
			projectDescription.setValue(project.getDescription());
			projectName.setValue(project.getName());
		} else {
			project = new Project();
		}
		
		Button saveButton = new Button("Erstellen und Zurück zum Dashboard");
		saveButton.addListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				
				project.setDescription(projectDescription.getValue().toString());
				project.setName(projectName.getValue().toString());

				dataProvider.saveProject(project);
				navigateTo(new NavigationEvent(AvailableSites.DASHBOARD));
			}
		});
		
		Button returnButton = new Button("Zurück zum Dashboard");
		returnButton.addListener(new Button.ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.DASHBOARD));
			}
		});
		
		HorizontalLayout buttonLayout = new HorizontalLayout();
		
		buttonLayout.addComponent(returnButton);
		buttonLayout.addComponent(saveButton);
		
		mainPanel.addComponent(projectName);
		mainPanel.addComponent(projectDescription);
		mainPanel.addComponent(buttonLayout);
		
		return mainPanel;
	}
}
