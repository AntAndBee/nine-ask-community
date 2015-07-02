package com.world.wen.model;

/**
 * AwsUserActionHistoryData entity. @author MyEclipse Persistence Tools
 */

public class AwsUserActionHistoryData implements java.io.Serializable {

	// Fields

	private Integer historyId;
	private String associateContent;
	private String associateAttached;
	private String addonData;

	// Constructors

	/** default constructor */
	public AwsUserActionHistoryData() {
	}

	/** full constructor */
	public AwsUserActionHistoryData(String associateContent,
			String associateAttached, String addonData) {
		this.associateContent = associateContent;
		this.associateAttached = associateAttached;
		this.addonData = addonData;
	}

	// Property accessors

	public Integer getHistoryId() {
		return this.historyId;
	}

	public void setHistoryId(Integer historyId) {
		this.historyId = historyId;
	}

	public String getAssociateContent() {
		return this.associateContent;
	}

	public void setAssociateContent(String associateContent) {
		this.associateContent = associateContent;
	}

	public String getAssociateAttached() {
		return this.associateAttached;
	}

	public void setAssociateAttached(String associateAttached) {
		this.associateAttached = associateAttached;
	}

	public String getAddonData() {
		return this.addonData;
	}

	public void setAddonData(String addonData) {
		this.addonData = addonData;
	}

}