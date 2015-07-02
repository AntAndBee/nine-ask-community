package com.world.wen.model;

/**
 * AwsQuestion entity. @author MyEclipse Persistence Tools
 */

public class AwsQuestion implements java.io.Serializable {

	// Fields

	private Integer questionId;
	private String questionContent;
	private String questionDetail;
	private Integer addTime;
	private Integer updateTime;
	private Integer publishedUid;
	private Integer answerCount;
	private Integer answerUsers;
	private Integer viewCount;
	private Integer focusCount;
	private Integer commentCount;
	private Integer actionHistoryId;
	private Integer categoryId;
	private Integer agreeCount;
	private Integer againstCount;
	private Integer bestAnswer;
	private Boolean hasAttach;
	private String unverifiedModify;
	private Integer unverifiedModifyCount;
	private Long ip;
	private Integer lastAnswer;
	private Double popularValue;
	private Integer popularValueUpdate;
	private Boolean lock;
	private Boolean anonymous;
	private Integer thanksCount;
	private String questionContentFulltext;
	private Boolean isRecommend;
	private Long weiboMsgId;
	private Integer receivedEmailId;
	private Integer chapterId;
	private Short sort;

	// Constructors

	/** default constructor */
	public AwsQuestion() {
	}

	/** minimal constructor */
	public AwsQuestion(String questionContent, Integer addTime,
			Integer answerCount, Integer answerUsers, Integer viewCount,
			Integer focusCount, Integer commentCount, Integer actionHistoryId,
			Integer categoryId, Integer agreeCount, Integer againstCount,
			Integer bestAnswer, Boolean hasAttach,
			Integer unverifiedModifyCount, Integer lastAnswer,
			Double popularValue, Integer popularValueUpdate, Boolean lock,
			Boolean anonymous, Integer thanksCount, Boolean isRecommend,
			Short sort) {
		this.questionContent = questionContent;
		this.addTime = addTime;
		this.answerCount = answerCount;
		this.answerUsers = answerUsers;
		this.viewCount = viewCount;
		this.focusCount = focusCount;
		this.commentCount = commentCount;
		this.actionHistoryId = actionHistoryId;
		this.categoryId = categoryId;
		this.agreeCount = agreeCount;
		this.againstCount = againstCount;
		this.bestAnswer = bestAnswer;
		this.hasAttach = hasAttach;
		this.unverifiedModifyCount = unverifiedModifyCount;
		this.lastAnswer = lastAnswer;
		this.popularValue = popularValue;
		this.popularValueUpdate = popularValueUpdate;
		this.lock = lock;
		this.anonymous = anonymous;
		this.thanksCount = thanksCount;
		this.isRecommend = isRecommend;
		this.sort = sort;
	}

	/** full constructor */
	public AwsQuestion(String questionContent, String questionDetail,
			Integer addTime, Integer updateTime, Integer publishedUid,
			Integer answerCount, Integer answerUsers, Integer viewCount,
			Integer focusCount, Integer commentCount, Integer actionHistoryId,
			Integer categoryId, Integer agreeCount, Integer againstCount,
			Integer bestAnswer, Boolean hasAttach, String unverifiedModify,
			Integer unverifiedModifyCount, Long ip, Integer lastAnswer,
			Double popularValue, Integer popularValueUpdate, Boolean lock,
			Boolean anonymous, Integer thanksCount,
			String questionContentFulltext, Boolean isRecommend,
			Long weiboMsgId, Integer receivedEmailId, Integer chapterId,
			Short sort) {
		this.questionContent = questionContent;
		this.questionDetail = questionDetail;
		this.addTime = addTime;
		this.updateTime = updateTime;
		this.publishedUid = publishedUid;
		this.answerCount = answerCount;
		this.answerUsers = answerUsers;
		this.viewCount = viewCount;
		this.focusCount = focusCount;
		this.commentCount = commentCount;
		this.actionHistoryId = actionHistoryId;
		this.categoryId = categoryId;
		this.agreeCount = agreeCount;
		this.againstCount = againstCount;
		this.bestAnswer = bestAnswer;
		this.hasAttach = hasAttach;
		this.unverifiedModify = unverifiedModify;
		this.unverifiedModifyCount = unverifiedModifyCount;
		this.ip = ip;
		this.lastAnswer = lastAnswer;
		this.popularValue = popularValue;
		this.popularValueUpdate = popularValueUpdate;
		this.lock = lock;
		this.anonymous = anonymous;
		this.thanksCount = thanksCount;
		this.questionContentFulltext = questionContentFulltext;
		this.isRecommend = isRecommend;
		this.weiboMsgId = weiboMsgId;
		this.receivedEmailId = receivedEmailId;
		this.chapterId = chapterId;
		this.sort = sort;
	}

	// Property accessors

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionContent() {
		return this.questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public String getQuestionDetail() {
		return this.questionDetail;
	}

	public void setQuestionDetail(String questionDetail) {
		this.questionDetail = questionDetail;
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

	public Integer getPublishedUid() {
		return this.publishedUid;
	}

	public void setPublishedUid(Integer publishedUid) {
		this.publishedUid = publishedUid;
	}

	public Integer getAnswerCount() {
		return this.answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public Integer getAnswerUsers() {
		return this.answerUsers;
	}

	public void setAnswerUsers(Integer answerUsers) {
		this.answerUsers = answerUsers;
	}

	public Integer getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public Integer getFocusCount() {
		return this.focusCount;
	}

	public void setFocusCount(Integer focusCount) {
		this.focusCount = focusCount;
	}

	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public Integer getActionHistoryId() {
		return this.actionHistoryId;
	}

	public void setActionHistoryId(Integer actionHistoryId) {
		this.actionHistoryId = actionHistoryId;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getAgreeCount() {
		return this.agreeCount;
	}

	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}

	public Integer getAgainstCount() {
		return this.againstCount;
	}

	public void setAgainstCount(Integer againstCount) {
		this.againstCount = againstCount;
	}

	public Integer getBestAnswer() {
		return this.bestAnswer;
	}

	public void setBestAnswer(Integer bestAnswer) {
		this.bestAnswer = bestAnswer;
	}

	public Boolean getHasAttach() {
		return this.hasAttach;
	}

	public void setHasAttach(Boolean hasAttach) {
		this.hasAttach = hasAttach;
	}

	public String getUnverifiedModify() {
		return this.unverifiedModify;
	}

	public void setUnverifiedModify(String unverifiedModify) {
		this.unverifiedModify = unverifiedModify;
	}

	public Integer getUnverifiedModifyCount() {
		return this.unverifiedModifyCount;
	}

	public void setUnverifiedModifyCount(Integer unverifiedModifyCount) {
		this.unverifiedModifyCount = unverifiedModifyCount;
	}

	public Long getIp() {
		return this.ip;
	}

	public void setIp(Long ip) {
		this.ip = ip;
	}

	public Integer getLastAnswer() {
		return this.lastAnswer;
	}

	public void setLastAnswer(Integer lastAnswer) {
		this.lastAnswer = lastAnswer;
	}

	public Double getPopularValue() {
		return this.popularValue;
	}

	public void setPopularValue(Double popularValue) {
		this.popularValue = popularValue;
	}

	public Integer getPopularValueUpdate() {
		return this.popularValueUpdate;
	}

	public void setPopularValueUpdate(Integer popularValueUpdate) {
		this.popularValueUpdate = popularValueUpdate;
	}

	public Boolean getLock() {
		return this.lock;
	}

	public void setLock(Boolean lock) {
		this.lock = lock;
	}

	public Boolean getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	public Integer getThanksCount() {
		return this.thanksCount;
	}

	public void setThanksCount(Integer thanksCount) {
		this.thanksCount = thanksCount;
	}

	public String getQuestionContentFulltext() {
		return this.questionContentFulltext;
	}

	public void setQuestionContentFulltext(String questionContentFulltext) {
		this.questionContentFulltext = questionContentFulltext;
	}

	public Boolean getIsRecommend() {
		return this.isRecommend;
	}

	public void setIsRecommend(Boolean isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Long getWeiboMsgId() {
		return this.weiboMsgId;
	}

	public void setWeiboMsgId(Long weiboMsgId) {
		this.weiboMsgId = weiboMsgId;
	}

	public Integer getReceivedEmailId() {
		return this.receivedEmailId;
	}

	public void setReceivedEmailId(Integer receivedEmailId) {
		this.receivedEmailId = receivedEmailId;
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