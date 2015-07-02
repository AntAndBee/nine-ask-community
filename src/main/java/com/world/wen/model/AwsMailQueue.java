package com.world.wen.model;

/**
 * AwsMailQueue entity. @author MyEclipse Persistence Tools
 */

public class AwsMailQueue implements java.io.Serializable {

	// Fields

	private Integer id;
	private String sendTo;
	private String subject;
	private String message;
	private Boolean isError;
	private String errorMessage;

	// Constructors

	/** default constructor */
	public AwsMailQueue() {
	}

	/** minimal constructor */
	public AwsMailQueue(String sendTo, String subject, String message,
			Boolean isError) {
		this.sendTo = sendTo;
		this.subject = subject;
		this.message = message;
		this.isError = isError;
	}

	/** full constructor */
	public AwsMailQueue(String sendTo, String subject, String message,
			Boolean isError, String errorMessage) {
		this.sendTo = sendTo;
		this.subject = subject;
		this.message = message;
		this.isError = isError;
		this.errorMessage = errorMessage;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSendTo() {
		return this.sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsError() {
		return this.isError;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}