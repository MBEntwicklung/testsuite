/**
 * 
 */
package de.mbentwicklung.testsuite.service.entity;

import javax.persistence.Entity;

import org.synyx.hades.domain.Persistable;

/**
 * @author marc
 * 
 */
@Entity
public class Testrun implements Persistable<Long> {

	private Long id;
	private Long projectId;

	private long date;
	private String comment;
	private String author;

	/**
	 * Für Hibernate
	 */
	public Testrun() {
	}

	public Testrun(final Long projectId, final long date, final String comment, final String author) {
		super();
		this.projectId = projectId;
		this.date = date;
		this.comment = comment;
		this.author = author;
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
	 * @return the date
	 */
	public long getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(long date) {
		this.date = date;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean isNew() {
		return id == null;
	}
}
