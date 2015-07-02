package com.world.wen.model;

/**
 * AwsInbox entity. @author MyEclipse Persistence Tools
 */

public class AwsInbox implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer dialogId;
	private String message;
	private Integer addTime;
	private Boolean senderRemove;
	private Boolean recipientRemove;
	private Integer receipt;

	// Constructors

	/** default constructor */
	public AwsInbox() {
	}

	/** full constructor */
	public AwsInbox(Integer uid, Integer dialogId, String message,
			Integer addTime, Boolean senderRemove, Boolean recipientRemove,
			Integer receipt) {
		this.uid = uid;
		this.dialogId = dialogId;
		this.message = message;
		this.addTime = addTime;
		this.senderRemove = senderRemove;
		this.recipientRemove = recipientRemove;
		this.receipt = receipt;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getDialogId() {
		return this.dialogId;
	}

	public void setDialogId(Integer dialogId) {
		this.dialogId = dialogId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Boolean getSenderRemove() {
		return this.senderRemove;
	}

	public void setSenderRemove(Boolean senderRemove) {
		this.senderRemove = senderRemove;
	}

	public Boolean getRecipientRemove() {
		return this.recipientRemove;
	}

	public void setRecipientRemove(Boolean recipientRemove) {
		this.recipientRemove = recipientRemove;
	}

	public Integer getReceipt() {
		return this.receipt;
	}

	public void setReceipt(Integer receipt) {
		this.receipt = receipt;
	}

}