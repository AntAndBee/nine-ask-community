package com.world.wen.model;

/**
 * AwsAnswer entity. @author MyEclipse Persistence Tools
 */

public class AwsAnswer implements java.io.Serializable {

	// Fields

	private Integer answerId;
	private Integer questionId;
	private String answerContent;
	private Integer addTime;
	private Integer againstCount;
	private Integer agreeCount;
	private Integer uid;
	private Integer commentCount;
	private Integer uninterestedCount;
	private Integer thanksCount;
	private Integer categoryId;
	private Boolean hasAttach;
	private Long ip;
	private Boolean forceFold;
	private Boolean anonymous;
	private String publishSource;

	// Constructors

	/** default constructor */
	public AwsAnswer() {
	}

	/** minimal constructor */
	public AwsAnswer(Integer questionId, Integer againstCount,
			Integer agreeCount) {
		this.questionId = questionId;
		this.againstCount = againstCount;
		this.agreeCount = agreeCount;
	}

	/** full constructor */
	public AwsAnswer(Integer questionId, String answerContent, Integer addTime,
			Integer againstCount, Integer agreeCount, Integer uid,
			Integer commentCount, Integer uninterestedCount,
			Integer thanksCount, Integer categoryId, Boolean hasAttach,
			Long ip, Boolean forceFold, Boolean anonymous, String publishSource) {
		this.questionId = questionId;
		this.answerContent = answerContent;
		this.addTime = addTime;
		this.againstCount = againstCount;
		this.agreeCount = agreeCount;
		this.uid = uid;
		this.commentCount = commentCount;
		this.uninterestedCount = uninterestedCount;
		this.thanksCount = thanksCount;
		this.categoryId = categoryId;
		this.hasAttach = hasAttach;
		this.ip = ip;
		this.forceFold = forceFold;
		this.anonymous = anonymous;
		this.publishSource = publishSource;
	}

	// Property accessors

	public Integer getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getAnswerContent() {
		return this.answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getAgainstCount() {
		return this.againstCount;
	}

	public void setAgainstCount(Integer againstCount) {
		this.againstCount = againstCount;
	}

	public Integer getAgreeCount() {
		return this.agreeCount;
	}

	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Integer getUninterestedCount() {
		return this.uninterestedCount;
	}

	public void setUninterestedCount(Integer uninterestedCount) {
		this.uninterestedCount = uninterestedCount;
	}

	public Integer getThanksCount() {
		return this.thanksCount;
	}

	public void setThanksCount(Integer thanksCount) {
		this.thanksCount = thanksCount;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Boolean getHasAttach() {
		return this.hasAttach;
	}

	public void setHasAttach(Boolean hasAttach) {
		this.hasAttach = hasAttach;
	}

	public Long getIp() {
		return this.ip;
	}

	public void setIp(Long ip) {
		this.ip = ip;
	}

	public Boolean getForceFold() {
		return this.forceFold;
	}

	public void setForceFold(Boolean forceFold) {
		this.forceFold = forceFold;
	}

	public Boolean getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	public String getPublishSource() {
		return this.publishSource;
	}

	public void setPublishSource(String publishSource) {
		this.publishSource = publishSource;
	}

}