package com.world.wen.model;

/**
 * AwsEdmUserdata entity. @author MyEclipse Persistence Tools
 */

public class AwsEdmUserdata implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer usergroup;
	private String email;

	// Constructors

	/** default constructor */
	public AwsEdmUserdata() {
	}

	/** full constructor */
	public AwsEdmUserdata(Integer usergroup, String email) {
		this.usergroup = usergroup;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUsergroup() {
		return this.usergroup;
	}

	public void setUsergroup(Integer usergroup) {
		this.usergroup = usergroup;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}