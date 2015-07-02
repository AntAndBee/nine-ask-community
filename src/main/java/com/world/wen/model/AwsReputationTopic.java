package com.world.wen.model;

/**
 * AwsReputationTopic entity. @author MyEclipse Persistence Tools
 */

public class AwsReputationTopic implements java.io.Serializable {

	// Fields

	private Integer autoId;
	private Integer uid;
	private Integer topicId;
	private Integer topicCount;
	private Integer updateTime;
	private Integer agreeCount;
	private Integer thanksCount;
	private Integer reputation;

	// Constructors

	/** default constructor */
	public AwsReputationTopic() {
	}

	/** full constructor */
	public AwsReputationTopic(Integer uid, Integer topicId, Integer topicCount,
			Integer updateTime, Integer agreeCount, Integer thanksCount,
			Integer reputation) {
		this.uid = uid;
		this.topicId = topicId;
		this.topicCount = topicCount;
		this.updateTime = updateTime;
		this.agreeCount = agreeCount;
		this.thanksCount = thanksCount;
		this.reputation = reputation;
	}

	// Property accessors

	public Integer getAutoId() {
		return this.autoId;
	}

	public void setAutoId(Integer autoId) {
		this.autoId = autoId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getTopicCount() {
		return this.topicCount;
	}

	public void setTopicCount(Integer topicCount) {
		this.topicCount = topicCount;
	}

	public Integer getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getAgreeCount() {
		return this.agreeCount;
	}

	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}

	public Integer getThanksCount() {
		return this.thanksCount;
	}

	public void setThanksCount(Integer thanksCount) {
		this.thanksCount = thanksCount;
	}

	public Integer getReputation() {
		return this.reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

}