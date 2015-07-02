package com.world.wen.model;

/**
 * AwsApproval entity. @author MyEclipse Persistence Tools
 */

public class AwsApproval implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private String data;
	private Integer uid;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsApproval() {
	}

	/** minimal constructor */
	public AwsApproval(String data, Integer uid, Integer time) {
		this.data = data;
		this.uid = uid;
		this.time = time;
	}

	/** full constructor */
	public AwsApproval(String type, String data, Integer uid, Integer time) {
		this.type = type;
		this.data = data;
		this.uid = uid;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}