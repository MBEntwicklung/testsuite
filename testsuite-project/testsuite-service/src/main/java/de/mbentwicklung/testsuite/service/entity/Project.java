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
public class Project implements Persistable<Long> {

	private Long id;

	private String name;
	private String description;

	/**
	 * Für Hibernate
	 */
	public Project() {
	}

	public Project(String name, String description) {
		super();

		this.name = name;
		this.description = description;
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

	@Override
	public boolean isNew() {
		return id == null;
	}
}
