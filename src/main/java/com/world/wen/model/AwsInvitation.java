package com.world.wen.model;

/**
 * AwsInvitation entity. @author MyEclipse Persistence Tools
 */

public class AwsInvitation implements java.io.Serializable {

	// Fields

	private Integer invitationId;
	private Integer uid;
	private String invitationCode;
	private String invitationEmail;
	private Integer addTime;
	private Long addIp;
	private Boolean activeExpire;
	private Integer activeTime;
	private Long activeIp;
	private Short activeStatus;
	private Integer activeUid;

	// Constructors

	/** default constructor */
	public AwsInvitation() {
	}

	/** full constructor */
	public AwsInvitation(Integer uid, String invitationCode,
			String invitationEmail, Integer addTime, Long addIp,
			Boolean activeExpire, Integer activeTime, Long activeIp,
			Short activeStatus, Integer activeUid) {
		this.uid = uid;
		this.invitationCode = invitationCode;
		this.invitationEmail = invitationEmail;
		this.addTime = addTime;
		this.addIp = addIp;
		this.activeExpire = activeExpire;
		this.activeTime = activeTime;
		this.activeIp = activeIp;
		this.activeStatus = activeStatus;
		this.activeUid = activeUid;
	}

	// Property accessors

	public Integer getInvitationId() {
		return this.invitationId;
	}

	public void setInvitationId(Integer invitationId) {
		this.invitationId = invitationId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getInvitationCode() {
		return this.invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public String getInvitationEmail() {
		return this.invitationEmail;
	}

	public void setInvitationEmail(String invitationEmail) {
		this.invitationEmail = invitationEmail;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Long getAddIp() {
		return this.addIp;
	}

	public void setAddIp(Long addIp) {
		this.addIp = addIp;
	}

	public Boolean getActiveExpire() {
		return this.activeExpire;
	}

	public void setActiveExpire(Boolean activeExpire) {
		this.activeExpire = activeExpire;
	}

	public Integer getActiveTime() {
		return this.activeTime;
	}

	public void setActiveTime(Integer activeTime) {
		this.activeTime = activeTime;
	}

	public Long getActiveIp() {
		return this.activeIp;
	}

	public void setActiveIp(Long activeIp) {
		this.activeIp = activeIp;
	}

	public Short getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(Short activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Integer getActiveUid() {
		return this.activeUid;
	}

	public void setActiveUid(Integer activeUid) {
		this.activeUid = activeUid;
	}

}