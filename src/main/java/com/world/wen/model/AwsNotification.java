package com.world.wen.model;

/**
 * AwsNotification entity. @author MyEclipse Persistence Tools
 */

public class AwsNotification implements java.io.Serializable {

	// Fields

	private Integer notificationId;
	private Integer senderUid;
	private Integer recipientUid;
	private Integer actionType;
	private Short modelType;
	private String sourceId;
	private Integer addTime;
	private Boolean readFlag;

	// Constructors

	/** default constructor */
	public AwsNotification() {
	}

	/** minimal constructor */
	public AwsNotification(Short modelType, String sourceId) {
		this.modelType = modelType;
		this.sourceId = sourceId;
	}

	/** full constructor */
	public AwsNotification(Integer senderUid, Integer recipientUid,
			Integer actionType, Short modelType, String sourceId,
			Integer addTime, Boolean readFlag) {
		this.senderUid = senderUid;
		this.recipientUid = recipientUid;
		this.actionType = actionType;
		this.modelType = modelType;
		this.sourceId = sourceId;
		this.addTime = addTime;
		this.readFlag = readFlag;
	}

	// Property accessors

	public Integer getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	public Integer getSenderUid() {
		return this.senderUid;
	}

	public void setSenderUid(Integer senderUid) {
		this.senderUid = senderUid;
	}

	public Integer getRecipientUid() {
		return this.recipientUid;
	}

	public void setRecipientUid(Integer recipientUid) {
		this.recipientUid = recipientUid;
	}

	public Integer getActionType() {
		return this.actionType;
	}

	public void setActionType(Integer actionType) {
		this.actionType = actionType;
	}

	public Short getModelType() {
		return this.modelType;
	}

	public void setModelType(Short modelType) {
		this.modelType = modelType;
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Boolean getReadFlag() {
		return this.readFlag;
	}

	public void setReadFlag(Boolean readFlag) {
		this.readFlag = readFlag;
	}

}