/**
 * 
 */
package de.mbentwicklung.testsuite.web.spring;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.AbstractApplicationServlet;

/**
 * @author bellmann
 * 
 */
public class TestsuiteSpringApplicationServlet extends AbstractApplicationServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3775098785159773336L;
	private ApplicationContext applicationContext;
	private Class<? extends Application> applicationClass;

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		super.init(servletConfig);
		applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletConfig.getServletContext());
		applicationClass = applicationContext.getBean("testsuiteApplication", Application.class).getClass();
	}

	@Override
	protected Application getNewApplication(HttpServletRequest request) throws ServletException {
		return applicationContext.getBean("testsuiteApplication", Application.class);
	}

	@Override
	protected Class<? extends Application> getApplicationClass() throws ClassNotFoundException {
		return applicationClass;
	}

}
