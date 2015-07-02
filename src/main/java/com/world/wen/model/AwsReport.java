package com.world.wen.model;

/**
 * AwsReport entity. @author MyEclipse Persistence Tools
 */

public class AwsReport implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String type;
	private Integer targetId;
	private String reason;
	private String url;
	private Integer addTime;
	private Boolean status;

	// Constructors

	/** default constructor */
	public AwsReport() {
	}

	/** minimal constructor */
	public AwsReport(Boolean status) {
		this.status = status;
	}

	/** full constructor */
	public AwsReport(Integer uid, String type, Integer targetId, String reason,
			String url, Integer addTime, Boolean status) {
		this.uid = uid;
		this.type = type;
		this.targetId = targetId;
		this.reason = reason;
		this.url = url;
		this.addTime = addTime;
		this.status = status;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}