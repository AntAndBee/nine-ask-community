package com.world.wen.model;

/**
 * AwsWeixinLogin entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinLogin implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer token;
	private Integer uid;
	private String sessionId;
	private Integer expire;

	// Constructors

	/** default constructor */
	public AwsWeixinLogin() {
	}

	/** minimal constructor */
	public AwsWeixinLogin(Integer token, String sessionId) {
		this.token = token;
		this.sessionId = sessionId;
	}

	/** full constructor */
	public AwsWeixinLogin(Integer token, Integer uid, String sessionId,
			Integer expire) {
		this.token = token;
		this.uid = uid;
		this.sessionId = sessionId;
		this.expire = expire;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getToken() {
		return this.token;
	}

	public void setToken(Integer token) {
		this.token = token;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getExpire() {
		return this.expire;
	}

	public void setExpire(Integer expire) {
		this.expire = expire;
	}

}