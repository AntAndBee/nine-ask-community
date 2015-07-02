package com.world.wen.model;

/**
 * AwsQuestionInvite entity. @author MyEclipse Persistence Tools
 */

public class AwsQuestionInvite implements java.io.Serializable {

	// Fields

	private Integer questionInviteId;
	private Integer questionId;
	private Integer senderUid;
	private Integer recipientsUid;
	private String email;
	private Integer addTime;
	private Integer availableTime;

	// Constructors

	/** default constructor */
	public AwsQuestionInvite() {
	}

	/** minimal constructor */
	public AwsQuestionInvite(Integer questionId, Integer senderUid) {
		this.questionId = questionId;
		this.senderUid = senderUid;
	}

	/** full constructor */
	public AwsQuestionInvite(Integer questionId, Integer senderUid,
			Integer recipientsUid, String email, Integer addTime,
			Integer availableTime) {
		this.questionId = questionId;
		this.senderUid = senderUid;
		this.recipientsUid = recipientsUid;
		this.email = email;
		this.addTime = addTime;
		this.availableTime = availableTime;
	}

	// Property accessors

	public Integer getQuestionInviteId() {
		return this.questionInviteId;
	}

	public void setQuestionInviteId(Integer questionInviteId) {
		this.questionInviteId = questionInviteId;
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getSenderUid() {
		return this.senderUid;
	}

	public void setSenderUid(Integer senderUid) {
		this.senderUid = senderUid;
	}

	public Integer getRecipientsUid() {
		return this.recipientsUid;
	}

	public void setRecipientsUid(Integer recipientsUid) {
		this.recipientsUid = recipientsUid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getAvailableTime() {
		return this.availableTime;
	}

	public void setAvailableTime(Integer availableTime) {
		this.availableTime = availableTime;
	}

}