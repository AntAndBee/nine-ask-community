package com.world.wen.model;

/**
 * AwsReputationCategory entity. @author MyEclipse Persistence Tools
 */

public class AwsReputationCategory implements java.io.Serializable {

	// Fields

	private Integer autoId;
	private Integer uid;
	private Short categoryId;
	private Integer updateTime;
	private Integer reputation;
	private Integer thanksCount;
	private Integer agreeCount;
	private Integer questionCount;

	// Constructors

	/** default constructor */
	public AwsReputationCategory() {
	}

	/** full constructor */
	public AwsReputationCategory(Integer uid, Short categoryId,
			Integer updateTime, Integer reputation, Integer thanksCount,
			Integer agreeCount, Integer questionCount) {
		this.uid = uid;
		this.categoryId = categoryId;
		this.updateTime = updateTime;
		this.reputation = reputation;
		this.thanksCount = thanksCount;
		this.agreeCount = agreeCount;
		this.questionCount = questionCount;
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

	public Short getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getReputation() {
		return this.reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Integer getThanksCount() {
		return this.thanksCount;
	}

	public void setThanksCount(Integer thanksCount) {
		this.thanksCount = thanksCount;
	}

	public Integer getAgreeCount() {
		return this.agreeCount;
	}

	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}

	public Integer getQuestionCount() {
		return this.questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

}