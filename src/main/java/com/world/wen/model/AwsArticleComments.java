package com.world.wen.model;

/**
 * AwsArticleComments entity. @author MyEclipse Persistence Tools
 */

public class AwsArticleComments implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer articleId;
	private String message;
	private Integer addTime;
	private Integer atUid;
	private Integer votes;

	// Constructors

	/** default constructor */
	public AwsArticleComments() {
	}

	/** minimal constructor */
	public AwsArticleComments(Integer uid, Integer articleId, String message,
			Integer addTime) {
		this.uid = uid;
		this.articleId = articleId;
		this.message = message;
		this.addTime = addTime;
	}

	/** full constructor */
	public AwsArticleComments(Integer uid, Integer articleId, String message,
			Integer addTime, Integer atUid, Integer votes) {
		this.uid = uid;
		this.articleId = articleId;
		this.message = message;
		this.addTime = addTime;
		this.atUid = atUid;
		this.votes = votes;
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

	public Integer getArticleId() {
		return this.articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getAtUid() {
		return this.atUid;
	}

	public void setAtUid(Integer atUid) {
		this.atUid = atUid;
	}

	public Integer getVotes() {
		return this.votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

}