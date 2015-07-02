package com.world.wen.model;

/**
 * AwsVerifyApply entity. @author MyEclipse Persistence Tools
 */

public class AwsVerifyApply implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String reason;
	private String attach;
	private Integer time;
	private String name;
	private String data;
	private Boolean status;
	private String type;

	// Constructors

	/** default constructor */
	public AwsVerifyApply() {
	}

	/** minimal constructor */
	public AwsVerifyApply(Integer uid, String reason, Integer time) {
		this.uid = uid;
		this.reason = reason;
		this.time = time;
	}

	/** full constructor */
	public AwsVerifyApply(Integer uid, String reason, String attach,
			Integer time, String name, String data, Boolean status, String type) {
		this.uid = uid;
		this.reason = reason;
		this.attach = attach;
		this.time = time;
		this.name = name;
		this.data = data;
		this.status = status;
		this.type = type;
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

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAttach() {
		return this.attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}