/**
 * 
 */
package de.mbentwicklung.testsuite.service.entity;

import javax.persistence.Entity;

import org.synyx.hades.domain.Persistable;

/**
 * @author Marc Bellmann
 * 
 */
@Entity
public final class Testcase implements Persistable<Long> {

	private Long id;
	private Long projectId;

	private String name;
	private String description;
	private String steps;
	private String result;

	/**
	 * Für Hibernate
	 */
	public Testcase() {
	}

	public Testcase(final Long projectId, final String name, final String description, final String steps,
			final String result) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.description = description;
		this.steps = steps;
		this.result = result;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the projectId
	 */
	public Long getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the steps
	 */
	public String getSteps() {
		return steps;
	}

	/**
	 * @param steps
	 *            the steps to set
	 */
	public void setSteps(String steps) {
		this.steps = steps;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public boolean isNew() {
		return id == null;
	}
}
