package com.world.wen.model;

/**
 * AwsEdmUnsubscription entity. @author MyEclipse Persistence Tools
 */

public class AwsEdmUnsubscription implements java.io.Serializable {

	// Fields

	private Integer id;
	private String email;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsEdmUnsubscription() {
	}

	/** full constructor */
	public AwsEdmUnsubscription(String email, Integer time) {
		this.email = email;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}