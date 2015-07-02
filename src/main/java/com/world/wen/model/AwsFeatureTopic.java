package com.world.wen.model;

/**
 * AwsFeatureTopic entity. @author MyEclipse Persistence Tools
 */

public class AwsFeatureTopic implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer featureId;
	private Integer topicId;

	// Constructors

	/** default constructor */
	public AwsFeatureTopic() {
	}

	/** full constructor */
	public AwsFeatureTopic(Integer featureId, Integer topicId) {
		this.featureId = featureId;
		this.topicId = topicId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFeatureId() {
		return this.featureId;
	}

	public void setFeatureId(Integer featureId) {
		this.featureId = featureId;
	}

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

}