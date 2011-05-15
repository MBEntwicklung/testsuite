package de.mbentwicklung.testsuite.web.sites;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Button.ClickEvent;

import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;

public class OverUsSite extends AbstractSite {

	private static final long serialVersionUID = -7863976455105300636L;

	public static final String SPRING_ID ="overUs";
	
	@Override
	public Component buildMainComponent(Object... argumente) {
		Panel mainPanel = new Panel("Über Testsuite");
		
		mainPanel.setWidth(WINDOW_WIDTH);
		
		mainPanel.addComponent(buildButtonLayout());
		
		return mainPanel;
	}

	private Component buildButtonLayout() {
		HorizontalLayout buttonLayout = new HorizontalLayout();
		
		buttonLayout.addComponent(createReturnButton());
		
		return buttonLayout;
	}
	
	@SuppressWarnings("serial")
	private Button createReturnButton() {
		Button returnButton = new Button("Zurück zur Übersicht");
		returnButton.addListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				navigateTo(new NavigationEvent(AvailableSites.DASHBOARD));	
			}
		});
		return returnButton;
	}

}
