package com.world.wen.model;

/**
 * AwsAnswerThanks entity. @author MyEclipse Persistence Tools
 */

public class AwsAnswerThanks implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer answerId;
	private String userName;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsAnswerThanks() {
	}

	/** full constructor */
	public AwsAnswerThanks(Integer uid, Integer answerId, String userName,
			Integer time) {
		this.uid = uid;
		this.answerId = answerId;
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

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
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