package com.world.wen.model;

/**
 * AwsQuestionComments entity. @author MyEclipse Persistence Tools
 */

public class AwsQuestionComments implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer questionId;
	private Integer uid;
	private String message;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsQuestionComments() {
	}

	/** full constructor */
	public AwsQuestionComments(Integer questionId, Integer uid, String message,
			Integer time) {
		this.questionId = questionId;
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

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
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