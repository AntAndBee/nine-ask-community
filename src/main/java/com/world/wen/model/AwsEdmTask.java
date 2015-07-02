package com.world.wen.model;

/**
 * AwsEdmTask entity. @author MyEclipse Persistence Tools
 */

public class AwsEdmTask implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String message;
	private String subject;
	private String fromName;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsEdmTask() {
	}

	/** full constructor */
	public AwsEdmTask(String title, String message, String subject,
			String fromName, Integer time) {
		this.title = title;
		this.message = message;
		this.subject = subject;
		this.fromName = fromName;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}