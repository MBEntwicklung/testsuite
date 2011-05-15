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
public class Testresult implements Persistable<Long> {

	/** serialVersionUID */
	private static final long serialVersionUID = 2496112866703431285L;

	private Long id;
	private Long testrunId;
	private Long testcaseId;

	private String author;
	private long date;
	private ProjectState status;
	private String comment;

	/**
	 * Für Hibernate
	 */
	public Testresult() {
	}

	public Testresult(Long testrunId, Long testcaseId, String author, long date, ProjectState status, String comment) {
		super();
		this.testrunId = testrunId;
		this.testcaseId = testcaseId;
		this.author = author;
		this.date = date;
		this.status = status;
		this.comment = comment;
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
	public Long getTestrunId() {
		return testrunId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setTestrunId(Long testrunId) {
		this.testrunId = testrunId;
	}

	/**
	 * @return the testcaseId
	 */
	public Long getTestcaseId() {
		return testcaseId;
	}

	/**
	 * @param testcaseId
	 *            the testcaseId to set
	 */
	public void setTestcaseId(Long testcaseId) {
		this.testcaseId = testcaseId;
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
	 * @return the status
	 */
	public ProjectState getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(ProjectState status) {
		this.status = status;
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

	@Override
	public boolean isNew() {
		return id == null;
	}

}
