package com.world.wen.model;

/**
 * AwsArticleVote entity. @author MyEclipse Persistence Tools
 */

public class AwsArticleVote implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String type;
	private Integer itemId;
	private Boolean rating;
	private Integer time;
	private Integer reputationFactor;
	private Integer itemUid;

	// Constructors

	/** default constructor */
	public AwsArticleVote() {
	}

	/** minimal constructor */
	public AwsArticleVote(Integer uid, Integer itemId, Integer time) {
		this.uid = uid;
		this.itemId = itemId;
		this.time = time;
	}

	/** full constructor */
	public AwsArticleVote(Integer uid, String type, Integer itemId,
			Boolean rating, Integer time, Integer reputationFactor,
			Integer itemUid) {
		this.uid = uid;
		this.type = type;
		this.itemId = itemId;
		this.rating = rating;
		this.time = time;
		this.reputationFactor = reputationFactor;
		this.itemUid = itemUid;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Boolean getRating() {
		return this.rating;
	}

	public void setRating(Boolean rating) {
		this.rating = rating;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getReputationFactor() {
		return this.reputationFactor;
	}

	public void setReputationFactor(Integer reputationFactor) {
		this.reputationFactor = reputationFactor;
	}

	public Integer getItemUid() {
		return this.itemUid;
	}

	public void setItemUid(Integer itemUid) {
		this.itemUid = itemUid;
	}

}