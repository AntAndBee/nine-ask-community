package com.world.wen.model;

/**
 * AwsWeixinMsg entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinMsg implements java.io.Serializable {

	// Fields

	private Integer id;
	private Long msgId;
	private String groupName;
	private String status;
	private Integer errorNum;
	private String mainMsg;
	private String articlesInfo;
	private String questionsInfo;
	private Integer createTime;
	private Integer filterCount;

	// Constructors

	/** default constructor */
	public AwsWeixinMsg() {
	}

	/** minimal constructor */
	public AwsWeixinMsg(Long msgId, String groupName, String status,
			Integer createTime, Integer filterCount) {
		this.msgId = msgId;
		this.groupName = groupName;
		this.status = status;
		this.createTime = createTime;
		this.filterCount = filterCount;
	}

	/** full constructor */
	public AwsWeixinMsg(Long msgId, String groupName, String status,
			Integer errorNum, String mainMsg, String articlesInfo,
			String questionsInfo, Integer createTime, Integer filterCount) {
		this.msgId = msgId;
		this.groupName = groupName;
		this.status = status;
		this.errorNum = errorNum;
		this.mainMsg = mainMsg;
		this.articlesInfo = articlesInfo;
		this.questionsInfo = questionsInfo;
		this.createTime = createTime;
		this.filterCount = filterCount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getErrorNum() {
		return this.errorNum;
	}

	public void setErrorNum(Integer errorNum) {
		this.errorNum = errorNum;
	}

	public String getMainMsg() {
		return this.mainMsg;
	}

	public void setMainMsg(String mainMsg) {
		this.mainMsg = mainMsg;
	}

	public String getArticlesInfo() {
		return this.articlesInfo;
	}

	public void setArticlesInfo(String articlesInfo) {
		this.articlesInfo = articlesInfo;
	}

	public String getQuestionsInfo() {
		return this.questionsInfo;
	}

	public void setQuestionsInfo(String questionsInfo) {
		this.questionsInfo = questionsInfo;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getFilterCount() {
		return this.filterCount;
	}

	public void setFilterCount(Integer filterCount) {
		this.filterCount = filterCount;
	}

}