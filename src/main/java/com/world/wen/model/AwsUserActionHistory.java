package com.world.wen.model;

/**
 * AwsUserActionHistory entity. @author MyEclipse Persistence Tools
 */

public class AwsUserActionHistory implements java.io.Serializable {

	// Fields

	private Integer historyId;
	private Integer uid;
	private Boolean associateType;
	private Short associateAction;
	private Integer associateId;
	private Integer addTime;
	private Integer associateAttached;
	private Boolean anonymous;
	private Boolean foldStatus;

	// Constructors

	/** default constructor */
	public AwsUserActionHistory() {
	}

	/** minimal constructor */
	public AwsUserActionHistory(Integer uid) {
		this.uid = uid;
	}

	/** full constructor */
	public AwsUserActionHistory(Integer uid, Boolean associateType,
			Short associateAction, Integer associateId, Integer addTime,
			Integer associateAttached, Boolean anonymous, Boolean foldStatus) {
		this.uid = uid;
		this.associateType = associateType;
		this.associateAction = associateAction;
		this.associateId = associateId;
		this.addTime = addTime;
		this.associateAttached = associateAttached;
		this.anonymous = anonymous;
		this.foldStatus = foldStatus;
	}

	// Property accessors

	public Integer getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Boolean getAssociateType() {
		return this.associateType;
	}

	public void setAssociateType(Boolean associateType) {
		this.associateType = associateType;
	}

	public Short getAssociateAction() {
		return this.associateAction;
	}

	public void setAssociateAction(Short associateAction) {
		this.associateAction = associateAction;
	}

	public Integer getAssociateId() {
		return this.associateId;
	}

	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getAssociateAttached() {
		return this.associateAttached;
	}

	public void setAssociateAttached(Integer associateAttached) {
		this.associateAttached = associateAttached;
	}

	public Boolean getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	public Boolean getFoldStatus() {
		return this.foldStatus;
	}

	public void setFoldStatus(Boolean foldStatus) {
		this.foldStatus = foldStatus;
	}

}