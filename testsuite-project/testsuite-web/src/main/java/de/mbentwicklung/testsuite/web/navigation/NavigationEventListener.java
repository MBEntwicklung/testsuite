/**
 * 
 */
package de.mbentwicklung.testsuite.web.navigation;

import java.io.Serializable;
import java.util.Map;

import javax.swing.text.View;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import de.mbentwicklung.testsuite.web.TestsuiteWindow;
import de.mbentwicklung.testsuite.web.sites.AbstractSite;

/**
 * @author Marc Bellmann
 * 
 */
public class NavigationEventListener implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 2200187349810980267L;

	/** Logger */
	private final Logger logger = LoggerFactory.getLogger(NavigationEventListener.class);

	private TestsuiteWindow testsuiteWindow;
	
	@Autowired
	private Map<String, AbstractSite> siteMap;

	public NavigationEventListener() {
		logger.info("Create NavigationEventListener");
	}

	/**
	 * Springt zu einer neuen "Seite". Das Ziel wird in einem
	 * {@link NavigationEvent} übergeben. Bevor die neue Seite geladen wird,
	 * werden mit Hilfe des mainWindow erst alle alten Komponenten gelöscht.
	 * Anschließend werden die Komponenten der neuen {@link View} an das
	 * mainWindow gehangen.<br>
	 * 
	 * Die Ziel Adresse muss mit dem Key des neuen Views in der views Map
	 * übereinstimmen und vorhanden sein.
	 * 
	 * @param event
	 *            Das {@link NavigationEvent} mit dem Key des neuen {@link View}
	 */
	public void navigateTo(NavigationEvent navigationEvent, final Object... argumente) {
		if (!siteMap.containsKey(navigationEvent.getTargetSite())) {
			throw new IllegalArgumentException("viewId " + navigationEvent.getTargetSite() + " doesn't exist!");
		}

		AbstractSite site = siteMap.get(navigationEvent.getTargetSite());
		site.setNavigationListener(this);
		
		testsuiteWindow.removeAllComponents();
		testsuiteWindow.addComponent(site.buildMainComponent(argumente));
	}
	
	public TestsuiteWindow getMainWindow() {
		return testsuiteWindow;
	}
	
	@Autowired
	@Required
	public void setTestsuiteWindow(TestsuiteWindow testsuiteWindow) {
		this.testsuiteWindow = testsuiteWindow;
	}
}
