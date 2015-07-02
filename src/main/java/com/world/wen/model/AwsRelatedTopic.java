package com.world.wen.model;

/**
 * AwsRelatedTopic entity. @author MyEclipse Persistence Tools
 */

public class AwsRelatedTopic implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer topicId;
	private Integer relatedId;

	// Constructors

	/** default constructor */
	public AwsRelatedTopic() {
	}

	/** full constructor */
	public AwsRelatedTopic(Integer topicId, Integer relatedId) {
		this.topicId = topicId;
		this.relatedId = relatedId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getRelatedId() {
		return this.relatedId;
	}

	public void setRelatedId(Integer relatedId) {
		this.relatedId = relatedId;
	}

}