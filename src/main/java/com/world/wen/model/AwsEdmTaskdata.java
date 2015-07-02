package com.world.wen.model;

/**
 * AwsEdmTaskdata entity. @author MyEclipse Persistence Tools
 */

public class AwsEdmTaskdata implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer taskid;
	private String email;
	private Integer sentTime;
	private Integer viewTime;

	// Constructors

	/** default constructor */
	public AwsEdmTaskdata() {
	}

	/** full constructor */
	public AwsEdmTaskdata(Integer taskid, String email, Integer sentTime,
			Integer viewTime) {
		this.taskid = taskid;
		this.email = email;
		this.sentTime = sentTime;
		this.viewTime = viewTime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTaskid() {
		return this.taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSentTime() {
		return this.sentTime;
	}

	public void setSentTime(Integer sentTime) {
		this.sentTime = sentTime;
	}

	public Integer getViewTime() {
		return this.viewTime;
	}

	public void setViewTime(Integer viewTime) {
		this.viewTime = viewTime;
	}

}