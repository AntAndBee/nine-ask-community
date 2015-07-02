package com.world.wen.model;

/**
 * AwsTopic entity. @author MyEclipse Persistence Tools
 */

public class AwsTopic implements java.io.Serializable {

	// Fields

	private Integer topicId;
	private String topicTitle;
	private Integer addTime;
	private Integer discussCount;
	private String topicDescription;
	private String topicPic;
	private Short topicLock;
	private Integer focusCount;
	private Boolean userRelated;
	private String urlToken;
	private Integer mergedId;
	private String seoTitle;
	private Integer parentId;
	private Boolean isParent;
	private Integer discussCountLastWeek;
	private Integer discussCountLastMonth;
	private Integer discussCountUpdate;

	// Constructors

	/** default constructor */
	public AwsTopic() {
	}

	/** minimal constructor */
	public AwsTopic(Short topicLock) {
		this.topicLock = topicLock;
	}

	/** full constructor */
	public AwsTopic(String topicTitle, Integer addTime, Integer discussCount,
			String topicDescription, String topicPic, Short topicLock,
			Integer focusCount, Boolean userRelated, String urlToken,
			Integer mergedId, String seoTitle, Integer parentId,
			Boolean isParent, Integer discussCountLastWeek,
			Integer discussCountLastMonth, Integer discussCountUpdate) {
		this.topicTitle = topicTitle;
		this.addTime = addTime;
		this.discussCount = discussCount;
		this.topicDescription = topicDescription;
		this.topicPic = topicPic;
		this.topicLock = topicLock;
		this.focusCount = focusCount;
		this.userRelated = userRelated;
		this.urlToken = urlToken;
		this.mergedId = mergedId;
		this.seoTitle = seoTitle;
		this.parentId = parentId;
		this.isParent = isParent;
		this.discussCountLastWeek = discussCountLastWeek;
		this.discussCountLastMonth = discussCountLastMonth;
		this.discussCountUpdate = discussCountUpdate;
	}

	// Property accessors

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTopicTitle() {
		return this.topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getDiscussCount() {
		return this.discussCount;
	}

	public void setDiscussCount(Integer discussCount) {
		this.discussCount = discussCount;
	}

	public String getTopicDescription() {
		return this.topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public String getTopicPic() {
		return this.topicPic;
	}

	public void setTopicPic(String topicPic) {
		this.topicPic = topicPic;
	}

	public Short getTopicLock() {
		return this.topicLock;
	}

	public void setTopicLock(Short topicLock) {
		this.topicLock = topicLock;
	}

	public Integer getFocusCount() {
		return this.focusCount;
	}

	public void setFocusCount(Integer focusCount) {
		this.focusCount = focusCount;
	}

	public Boolean getUserRelated() {
		return this.userRelated;
	}

	public void setUserRelated(Boolean userRelated) {
		this.userRelated = userRelated;
	}

	public String getUrlToken() {
		return this.urlToken;
	}

	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}

	public Integer getMergedId() {
		return this.mergedId;
	}

	public void setMergedId(Integer mergedId) {
		this.mergedId = mergedId;
	}

	public String getSeoTitle() {
		return this.seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Boolean getIsParent() {
		return this.isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public Integer getDiscussCountLastWeek() {
		return this.discussCountLastWeek;
	}

	public void setDiscussCountLastWeek(Integer discussCountLastWeek) {
		this.discussCountLastWeek = discussCountLastWeek;
	}

	public Integer getDiscussCountLastMonth() {
		return this.discussCountLastMonth;
	}

	public void setDiscussCountLastMonth(Integer discussCountLastMonth) {
		this.discussCountLastMonth = discussCountLastMonth;
	}

	public Integer getDiscussCountUpdate() {
		return this.discussCountUpdate;
	}

	public void setDiscussCountUpdate(Integer discussCountUpdate) {
		this.discussCountUpdate = discussCountUpdate;
	}

}