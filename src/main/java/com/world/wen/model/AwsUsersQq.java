package com.world.wen.model;

/**
 * AwsUsersQq entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersQq implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer uid;
	private String nickname;
	private String openid;
	private String gender;
	private Integer addTime;
	private String accessToken;
	private String refreshToken;
	private Integer expiresTime;
	private String figureurl;

	// Constructors

	/** default constructor */
	public AwsUsersQq() {
	}

	/** minimal constructor */
	public AwsUsersQq(Integer uid) {
		this.uid = uid;
	}

	/** full constructor */
	public AwsUsersQq(Integer uid, String nickname, String openid,
			String gender, Integer addTime, String accessToken,
			String refreshToken, Integer expiresTime, String figureurl) {
		this.uid = uid;
		this.nickname = nickname;
		this.openid = openid;
		this.gender = gender;
		this.addTime = addTime;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.expiresTime = expiresTime;
		this.figureurl = figureurl;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Integer getExpiresTime() {
		return this.expiresTime;
	}

	public void setExpiresTime(Integer expiresTime) {
		this.expiresTime = expiresTime;
	}

	public String getFigureurl() {
		return this.figureurl;
	}

	public void setFigureurl(String figureurl) {
		this.figureurl = figureurl;
	}

}