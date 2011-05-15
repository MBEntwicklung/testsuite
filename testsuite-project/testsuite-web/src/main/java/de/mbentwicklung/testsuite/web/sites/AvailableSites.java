/**
 * 
 */
package de.mbentwicklung.testsuite.web.sites;

/**
 * @author Marc Bellmann
 * 
 */
public enum AvailableSites {

	DASHBOARD(DashboardSite.SPRING_ID), 
	SETTING(SettingSite.SPRING_ID),
	OVER_US(OverUsSite.SPRING_ID), 
	PROJECT_PROPERTIES(ProjectPropertiesSite.SPRING_ID), 
	TESTCASE_PROPERTIES(TestcasePropertiesSite.SPRING_ID), 
	TESTRUN_PROPERTIES(TestrunPropertiesSite.SPRING_ID), 
	PROJECT_OVERVIEW(ProjectOverviewSite.SPRING_ID), 
	TESTCASE_OVERVIEW(TestcaseOverviewSite.SPRING_ID), 
	TESTRUN_OVERVIEW(TestrunOverviewSite.SPRING_ID);

	private final String siteId;

	private AvailableSites(final String siteId) {
		this.siteId = siteId;
	}

	public String getSiteId() {
		return siteId;
	}
}
