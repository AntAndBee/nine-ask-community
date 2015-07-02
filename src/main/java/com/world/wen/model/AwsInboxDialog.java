package com.world.wen.model;

/**
 * AwsInboxDialog entity. @author MyEclipse Persistence Tools
 */

public class AwsInboxDialog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer senderUid;
	private Integer senderUnread;
	private Integer recipientUid;
	private Integer recipientUnread;
	private Integer addTime;
	private Integer updateTime;
	private Integer senderCount;
	private Integer recipientCount;

	// Constructors

	/** default constructor */
	public AwsInboxDialog() {
	}

	/** full constructor */
	public AwsInboxDialog(Integer senderUid, Integer senderUnread,
			Integer recipientUid, Integer recipientUnread, Integer addTime,
			Integer updateTime, Integer senderCount, Integer recipientCount) {
		this.senderUid = senderUid;
		this.senderUnread = senderUnread;
		this.recipientUid = recipientUid;
		this.recipientUnread = recipientUnread;
		this.addTime = addTime;
		this.updateTime = updateTime;
		this.senderCount = senderCount;
		this.recipientCount = recipientCount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSenderUid() {
		return this.senderUid;
	}

	public void setSenderUid(Integer senderUid) {
		this.senderUid = senderUid;
	}

	public Integer getSenderUnread() {
		return this.senderUnread;
	}

	public void setSenderUnread(Integer senderUnread) {
		this.senderUnread = senderUnread;
	}

	public Integer getRecipientUid() {
		return this.recipientUid;
	}

	public void setRecipientUid(Integer recipientUid) {
		this.recipientUid = recipientUid;
	}

	public Integer getRecipientUnread() {
		return this.recipientUnread;
	}

	public void setRecipientUnread(Integer recipientUnread) {
		this.recipientUnread = recipientUnread;
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

	public Integer getSenderCount() {
		return this.senderCount;
	}

	public void setSenderCount(Integer senderCount) {
		this.senderCount = senderCount;
	}

	public Integer getRecipientCount() {
		return this.recipientCount;
	}

	public void setRecipientCount(Integer recipientCount) {
		this.recipientCount = recipientCount;
	}

}