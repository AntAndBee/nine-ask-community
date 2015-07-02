package com.world.wen.model;

/**
 * AwsAnswerComments entity. @author MyEclipse Persistence Tools
 */

public class AwsAnswerComments implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer answerId;
	private Integer uid;
	private String message;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsAnswerComments() {
	}

	/** full constructor */
	public AwsAnswerComments(Integer answerId, Integer uid, String message,
			Integer time) {
		this.answerId = answerId;
		this.uid = uid;
		this.message = message;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}