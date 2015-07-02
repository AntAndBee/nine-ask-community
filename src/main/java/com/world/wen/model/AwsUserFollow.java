package com.world.wen.model;

/**
 * AwsUserFollow entity. @author MyEclipse Persistence Tools
 */

public class AwsUserFollow implements java.io.Serializable {

	// Fields

	private Integer followId;
	private Integer fansUid;
	private Integer friendUid;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsUserFollow() {
	}

	/** full constructor */
	public AwsUserFollow(Integer fansUid, Integer friendUid, Integer addTime) {
		this.fansUid = fansUid;
		this.friendUid = friendUid;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getFollowId() {
		return this.followId;
	}

	public void setFollowId(Integer followId) {
		this.followId = followId;
	}

	public Integer getFansUid() {
		return this.fansUid;
	}

	public void setFansUid(Integer fansUid) {
		this.fansUid = fansUid;
	}

	public Integer getFriendUid() {
		return this.friendUid;
	}

	public void setFriendUid(Integer friendUid) {
		this.friendUid = friendUid;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}