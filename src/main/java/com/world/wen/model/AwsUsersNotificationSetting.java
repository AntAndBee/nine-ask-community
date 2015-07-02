package com.world.wen.model;

/**
 * AwsUsersNotificationSetting entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersNotificationSetting implements java.io.Serializable {

	// Fields

	private Integer noticeSettingId;
	private Integer uid;
	private String data;

	// Constructors

	/** default constructor */
	public AwsUsersNotificationSetting() {
	}

	/** minimal constructor */
	public AwsUsersNotificationSetting(Integer uid) {
		this.uid = uid;
	}

	/** full constructor */
	public AwsUsersNotificationSetting(Integer uid, String data) {
		this.uid = uid;
		this.data = data;
	}

	// Property accessors

	public Integer getNoticeSettingId() {
		return this.noticeSettingId;
	}

	public void setNoticeSettingId(Integer noticeSettingId) {
		this.noticeSettingId = noticeSettingId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

}