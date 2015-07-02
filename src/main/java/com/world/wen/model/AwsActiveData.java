package com.world.wen.model;

/**
 * AwsActiveData entity. @author MyEclipse Persistence Tools
 */

public class AwsActiveData implements java.io.Serializable {

	// Fields

	private Integer activeId;
	private Integer uid;
	private Integer expireTime;
	private String activeCode;
	private String activeTypeCode;
	private Integer addTime;
	private Long addIp;
	private Integer activeTime;
	private Long activeIp;

	// Constructors

	/** default constructor */
	public AwsActiveData() {
	}

	/** full constructor */
	public AwsActiveData(Integer uid, Integer expireTime, String activeCode,
			String activeTypeCode, Integer addTime, Long addIp,
			Integer activeTime, Long activeIp) {
		this.uid = uid;
		this.expireTime = expireTime;
		this.activeCode = activeCode;
		this.activeTypeCode = activeTypeCode;
		this.addTime = addTime;
		this.addIp = addIp;
		this.activeTime = activeTime;
		this.activeIp = activeIp;
	}

	// Property accessors

	public Integer getActiveId() {
		return this.activeId;
	}

	public void setActiveId(Integer activeId) {
		this.activeId = activeId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
	}

	public String getActiveCode() {
		return this.activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public String getActiveTypeCode() {
		return this.activeTypeCode;
	}

	public void setActiveTypeCode(String activeTypeCode) {
		this.activeTypeCode = activeTypeCode;
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

}