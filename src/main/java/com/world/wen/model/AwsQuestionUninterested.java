package com.world.wen.model;

/**
 * AwsQuestionUninterested entity. @author MyEclipse Persistence Tools
 */

public class AwsQuestionUninterested implements java.io.Serializable {

	// Fields

	private Integer interestedId;
	private Integer questionId;
	private Integer uid;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsQuestionUninterested() {
	}

	/** full constructor */
	public AwsQuestionUninterested(Integer questionId, Integer uid,
			Integer addTime) {
		this.questionId = questionId;
		this.uid = uid;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getInterestedId() {
		return this.interestedId;
	}

	public void setInterestedId(Integer interestedId) {
		this.interestedId = interestedId;
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

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}