package com.world.wen.model;

/**
 * AwsNotificationData entity. @author MyEclipse Persistence Tools
 */

public class AwsNotificationData implements java.io.Serializable {

	// Fields

	private Integer notificationId;
	private String data;

	// Constructors

	/** default constructor */
	public AwsNotificationData() {
	}

	/** full constructor */
	public AwsNotificationData(String data) {
		this.data = data;
	}

	// Property accessors

	public Integer getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

}