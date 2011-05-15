/**
 * 
 */
package de.mbentwicklung.testsuite.service.dao;

import java.util.List;

import org.synyx.hades.dao.GenericDao;

import de.mbentwicklung.testsuite.service.entity.Testrun;

/**
 * @author Marc Bellmann
 *
 */
public interface TestrunDao extends GenericDao<Testrun, Long> {

	List<Testrun> findByProjectId(final Long projectId);
	
}
