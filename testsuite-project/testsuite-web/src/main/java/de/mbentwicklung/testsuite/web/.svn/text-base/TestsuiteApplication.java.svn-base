package de.mbentwicklung.testsuite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.vaadin.Application;

import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.navigation.NavigationEventListener;
import de.mbentwicklung.testsuite.web.sites.AvailableSites;

public class TestsuiteApplication extends Application {
	
	/** */
	private static final long serialVersionUID = 4693996396439205431L;

	
	private NavigationEventListener navigationEventListener;

	@Override
	public void init() {
		setTheme("testsuite");
		setMainWindow(navigationEventListener.getMainWindow());
		navigationEventListener.navigateTo(new NavigationEvent(AvailableSites.DASHBOARD));
	}
	
	@Autowired
	@Required
	public void setNavigationEventListener(NavigationEventListener navigationEventListener) {
		this.navigationEventListener = navigationEventListener;
	}
}
