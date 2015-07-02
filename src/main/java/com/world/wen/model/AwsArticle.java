package com.world.wen.model;

/**
 * AwsArticle entity. @author MyEclipse Persistence Tools
 */

public class AwsArticle implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String title;
	private String message;
	private Integer comments;
	private Integer views;
	private Integer addTime;
	private Boolean hasAttach;
	private Integer lock;
	private Integer votes;
	private String titleFulltext;
	private Integer categoryId;
	private Boolean isRecommend;
	private Integer chapterId;
	private Short sort;

	// Constructors

	/** default constructor */
	public AwsArticle() {
	}

	/** minimal constructor */
	public AwsArticle(Integer uid, String title, Boolean hasAttach,
			Integer lock, Short sort) {
		this.uid = uid;
		this.title = title;
		this.hasAttach = hasAttach;
		this.lock = lock;
		this.sort = sort;
	}

	/** full constructor */
	public AwsArticle(Integer uid, String title, String message,
			Integer comments, Integer views, Integer addTime,
			Boolean hasAttach, Integer lock, Integer votes,
			String titleFulltext, Integer categoryId, Boolean isRecommend,
			Integer chapterId, Short sort) {
		this.uid = uid;
		this.title = title;
		this.message = message;
		this.comments = comments;
		this.views = views;
		this.addTime = addTime;
		this.hasAttach = hasAttach;
		this.lock = lock;
		this.votes = votes;
		this.titleFulltext = titleFulltext;
		this.categoryId = categoryId;
		this.isRecommend = isRecommend;
		this.chapterId = chapterId;
		this.sort = sort;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Boolean getHasAttach() {
		return this.hasAttach;
	}

	public void setHasAttach(Boolean hasAttach) {
		this.hasAttach = hasAttach;
	}

	public Integer getLock() {
		return this.lock;
	}

	public void setLock(Integer lock) {
		this.lock = lock;
	}

	public Integer getVotes() {
		return this.votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public String getTitleFulltext() {
		return this.titleFulltext;
	}

	public void setTitleFulltext(String titleFulltext) {
		this.titleFulltext = titleFulltext;
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

	public Integer getChapterId() {
		return this.chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}

	public Short getSort() {
		return this.sort;
	}

	public void setSort(Short sort) {
		this.sort = sort;
	}

}