/**
 * 
 */
package de.mbentwicklung.testsuite.web;

import com.vaadin.ui.Window;

/**
 * @author marc
 *
 */
@SuppressWarnings("serial")
public class TestsuiteWindow extends Window {

	public static final String WINDOW_CAPTION = "Testsuite";
	
	public TestsuiteWindow() {
		setCaption(WINDOW_CAPTION);
		setSizeFull();
	}
}
