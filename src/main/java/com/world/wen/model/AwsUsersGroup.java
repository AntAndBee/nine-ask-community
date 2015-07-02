package com.world.wen.model;

/**
 * AwsUsersGroup entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersGroup implements java.io.Serializable {

	// Fields

	private Integer groupId;
	private Short type;
	private Boolean custom;
	private String groupName;
	private Integer reputationLower;
	private Integer reputationHiger;
	private Float reputationFactor;
	private String permission;

	// Constructors

	/** default constructor */
	public AwsUsersGroup() {
	}

	/** minimal constructor */
	public AwsUsersGroup(String groupName) {
		this.groupName = groupName;
	}

	/** full constructor */
	public AwsUsersGroup(Short type, Boolean custom, String groupName,
			Integer reputationLower, Integer reputationHiger,
			Float reputationFactor, String permission) {
		this.type = type;
		this.custom = custom;
		this.groupName = groupName;
		this.reputationLower = reputationLower;
		this.reputationHiger = reputationHiger;
		this.reputationFactor = reputationFactor;
		this.permission = permission;
	}

	// Property accessors

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Boolean getCustom() {
		return this.custom;
	}

	public void setCustom(Boolean custom) {
		this.custom = custom;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getReputationLower() {
		return this.reputationLower;
	}

	public void setReputationLower(Integer reputationLower) {
		this.reputationLower = reputationLower;
	}

	public Integer getReputationHiger() {
		return this.reputationHiger;
	}

	public void setReputationHiger(Integer reputationHiger) {
		this.reputationHiger = reputationHiger;
	}

	public Float getReputationFactor() {
		return this.reputationFactor;
	}

	public void setReputationFactor(Float reputationFactor) {
		this.reputationFactor = reputationFactor;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}