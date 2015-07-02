package com.world.wen.model;

/**
 * AwsQuestionFocus entity. @author MyEclipse Persistence Tools
 */

public class AwsQuestionFocus implements java.io.Serializable {

	// Fields

	private Integer focusId;
	private Integer questionId;
	private Integer uid;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsQuestionFocus() {
	}

	/** full constructor */
	public AwsQuestionFocus(Integer questionId, Integer uid, Integer addTime) {
		this.questionId = questionId;
		this.uid = uid;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getFocusId() {
		return this.focusId;
	}

	public void setFocusId(Integer focusId) {
		this.focusId = focusId;
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