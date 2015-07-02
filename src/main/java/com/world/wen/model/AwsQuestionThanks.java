package com.world.wen.model;

/**
 * AwsQuestionThanks entity. @author MyEclipse Persistence Tools
 */

public class AwsQuestionThanks implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer questionId;
	private String userName;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsQuestionThanks() {
	}

	/** full constructor */
	public AwsQuestionThanks(Integer uid, Integer questionId, String userName,
			Integer time) {
		this.uid = uid;
		this.questionId = questionId;
		this.userName = userName;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}