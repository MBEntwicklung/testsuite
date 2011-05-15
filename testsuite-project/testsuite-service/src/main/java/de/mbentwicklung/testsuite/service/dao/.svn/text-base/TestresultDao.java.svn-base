/**
 * 
 */
package de.mbentwicklung.testsuite.service.dao;

import java.util.List;

import org.synyx.hades.dao.GenericDao;

import de.mbentwicklung.testsuite.service.entity.Testresult;

/**
 * @author Marc Bellmann
 * 
 */
public interface TestresultDao extends GenericDao<Testresult, Long> {
	
	List<Testresult> findByTestrunId(final Long testrunId);

	List<Testresult> findByTestcaseId(final Long testcaseId);
}
