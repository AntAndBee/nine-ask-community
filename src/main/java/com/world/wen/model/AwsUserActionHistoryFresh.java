package com.world.wen.model;

/**
 * AwsUserActionHistoryFresh entity. @author MyEclipse Persistence Tools
 */

public class AwsUserActionHistoryFresh implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer historyId;
	private Integer associateId;
	private Boolean associateType;
	private Short associateAction;
	private Integer addTime;
	private Integer uid;
	private Boolean anonymous;

	// Constructors

	/** default constructor */
	public AwsUserActionHistoryFresh() {
	}

	/** full constructor */
	public AwsUserActionHistoryFresh(Integer historyId, Integer associateId,
			Boolean associateType, Short associateAction, Integer addTime,
			Integer uid, Boolean anonymous) {
		this.historyId = historyId;
		this.associateId = associateId;
		this.associateType = associateType;
		this.associateAction = associateAction;
		this.addTime = addTime;
		this.uid = uid;
		this.anonymous = anonymous;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	public Integer getAssociateId() {
		return this.associateId;
	}

	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
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

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Boolean getAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

}