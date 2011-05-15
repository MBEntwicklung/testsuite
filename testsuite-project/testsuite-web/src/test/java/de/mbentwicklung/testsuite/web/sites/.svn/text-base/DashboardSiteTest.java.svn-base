package de.mbentwicklung.testsuite.web.sites;

import static junit.framework.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DashboardSiteTest {

	private WebDriver webDriver;

	@Before
	public void initWebDriver() throws Exception {
		webDriver = new FirefoxDriver();
		webDriver.get("localhost:8080/testsuite-web");
	}

	@Test
	public void testLoadDashboard() throws Exception {
		assertEquals("Dashboard - Testsuite", webDriver.getTitle());
	}

	@Test
	public void testShowHelloText() throws Exception {
		webDriver.findElements(By.xpath("//div[text()='Ein erster testsuite Test']"));
	}

	@Test
	public void testShowProject() throws Exception {
		webDriver.findElements(By.xpath("//div[text()='Alle Projekte']"));
	}

	@Test
	public void testShowConfigLinks() throws Exception {
		webDriver.findElements(By.xpath("//div[text()='Testsuite Konfiguration']"));
	}

	@After
	public void closeWebDriver() throws Exception {
		webDriver.close();
	}
}
