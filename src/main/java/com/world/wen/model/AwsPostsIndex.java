package com.world.wen.model;

/**
 * AwsPostsIndex entity. @author MyEclipse Persistence Tools
 */

public class AwsPostsIndex implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer postId;
	private String postType;
	private Integer addTime;
	private Integer updateTime;
	private Integer categoryId;
	private Boolean isRecommend;
	private Integer viewCount;
	private Boolean anonymous;
	private Integer popularValue;
	private Integer uid;
	private Boolean lock;
	private Integer agreeCount;
	private Integer answerCount;

	// Constructors

	/** default constructor */
	public AwsPostsIndex() {
	}

	/** minimal constructor */
	public AwsPostsIndex(Integer postId, String postType, Integer addTime,
			Integer uid) {
		this.postId = postId;
		this.postType = postType;
		this.addTime = addTime;
		this.uid = uid;
	}

	/** full constructor */
	public AwsPostsIndex(Integer postId, String postType, Integer addTime,
			Integer updateTime, Integer categoryId, Boolean isRecommend,
			Integer viewCount, Boolean anonymous, Integer popularValue,
			Integer uid, Boolean lock, Integer agreeCount, Integer answerCount) {
		this.postId = postId;
		this.postType = postType;
		this.addTime = addTime;
		this.updateTime = updateTime;
		this.categoryId = categoryId;
		this.isRecommend = isRecommend;
		this.viewCount = viewCount;
		this.anonymous = anonymous;
		this.popularValue = popularValue;
		this.uid = uid;
		this.lock = lock;
		this.agreeCount = agreeCount;
		this.answerCount = answerCount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostType() {
		return this.postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Boolean getIsRecommend() {
		return this.isRecommend;
	}

	public void setIsRecommend(Boolean isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Boolean getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	public Integer getPopularValue() {
		return this.popularValue;
	}

	public void setPopularValue(Integer popularValue) {
		this.popularValue = popularValue;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Boolean getLock() {
		return this.lock;
	}

	public void setLock(Boolean lock) {
		this.lock = lock;
	}

	public Integer getAgreeCount() {
		return this.agreeCount;
	}

	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}

	public Integer getAnswerCount() {
		return this.answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

}