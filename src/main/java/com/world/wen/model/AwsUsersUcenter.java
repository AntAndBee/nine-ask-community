package com.world.wen.model;

/**
 * AwsUsersUcenter entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersUcenter implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer ucUid;
	private String username;
	private String email;

	// Constructors

	/** default constructor */
	public AwsUsersUcenter() {
	}

	/** full constructor */
	public AwsUsersUcenter(Integer uid, Integer ucUid, String username,
			String email) {
		this.uid = uid;
		this.ucUid = ucUid;
		this.username = username;
		this.email = email;
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

	public Integer getUcUid() {
		return this.ucUid;
	}

	public void setUcUid(Integer ucUid) {
		this.ucUid = ucUid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}