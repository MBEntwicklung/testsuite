/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

import java.io.Serializable;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

import com.vaadin.ui.Component;
import com.vaadin.ui.Window;

import de.mbentwicklung.testsuite.service.DataProvider;
import de.mbentwicklung.testsuite.web.TestsuiteWindow;
import de.mbentwicklung.testsuite.web.navigation.NavigationEvent;
import de.mbentwicklung.testsuite.web.navigation.NavigationEventListener;

/**
 * @author Marc Bellmann
 * 
 */
public abstract class AbstractSite implements Serializable {

	/** Die Standard Sprache der Anwendung */
	public static final Locale DEFAULT_LANGUAGE = Locale.GERMAN;

	public static final String SPRING_ID ="abstractSite";
	
	private static final long serialVersionUID = -3986460740983776355L;

	protected final static String APPLICATION_NAME = "testsuite";
	protected final static String WINDOW_WIDTH = "800px";

	private MessageSource messageSource;

	protected DataProvider dataProvider;
	
	private NavigationEventListener navigationEventListener;

	private TestsuiteWindow testsuiteWindow;
	
	public abstract Component buildMainComponent(final Object... argumente);

	protected void navigateTo(final NavigationEvent navigationEvent, final Object... argumente) {
		navigationEventListener.navigateTo(navigationEvent, argumente);
	}
	
	/**
	 * Zum Übersetzen von Message Keys in die Standard Sprache
	 * {@value #DEFAULT_LANGUAGE}
	 * 
	 * @param msg
	 *            Message Key
	 * @param params
	 *            Parameter
	 * @return Der Übersetzte String
	 */
	protected String getMessage(final String msg, final String... params) {
		return messageSource.getMessage(msg, params, DEFAULT_LANGUAGE);
	}

	public Window getMainWindow() {
		return testsuiteWindow;
	}
	
	/**
	 * Zum Setzen des {@link NavigationEventListener} mittels Spring
	 * 
	 * @param navigationEventListener
	 *            Der {@link NavigationEventListener}
	 */
	public void setNavigationListener(NavigationEventListener navigationEventListener) {
		this.navigationEventListener = navigationEventListener;
	}

	/**
	 * Zum Setzen der {@link MessageSource} mittels Spring
	 * 
	 * @param messageSource
	 *            Die {@link MessageSource}
	 */
	@Autowired
	@Required
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * Zum Setzen des {@link DataProvider} mittels Spring
	 * 
	 * @param dataProvider
	 *            Der {@link DataProvider}
	 */
	@Autowired
	@Required
	public void setDataProvider(DataProvider dataProvider) {
		this.dataProvider = dataProvider;
	}
	
	@Autowired
	@Required
	public void setTestsuiteWindow(TestsuiteWindow testsuiteWindow) {
		this.testsuiteWindow = testsuiteWindow;
	}
}
