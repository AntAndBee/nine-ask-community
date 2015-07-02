package com.world.wen.model;

/**
 * AwsTopicFocus entity. @author MyEclipse Persistence Tools
 */

public class AwsTopicFocus implements java.io.Serializable {

	// Fields

	private Integer focusId;
	private Integer topicId;
	private Integer uid;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsTopicFocus() {
	}

	/** full constructor */
	public AwsTopicFocus(Integer topicId, Integer uid, Integer addTime) {
		this.topicId = topicId;
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

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
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