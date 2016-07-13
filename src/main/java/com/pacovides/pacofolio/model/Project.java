package com.pacovides.pacofolio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8303164788119011264L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String description;

	/**
	 * The date where the project was first started (kickoff). This refers to
	 * the actual project. Not the project entry.
	 */
	@Temporal(TemporalType.TIME)
	private Date projectStarted;

	/**
	 * The date where the project was last updated This refers to the actual
	 * project. Not the project entry.
	 */
	@Temporal(TemporalType.TIME)
	private Date projectLastUpdated;

	public Project() {
		// Needed by JPA
	}

	public Project(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getProjectStarted() {
		return projectStarted;
	}

	public void setProjectStarted(Date projectStarted) {
		this.projectStarted = projectStarted;
	}

	public Date getProjectLastUpdated() {
		return projectLastUpdated;
	}

	public void setProjectLastUpdated(Date projectLastUpdated) {
		this.projectLastUpdated = projectLastUpdated;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}

	// TODO Image thumbnail,
	// TODO List<Content> contents,
	// TODO List<Tag> tags,

}
