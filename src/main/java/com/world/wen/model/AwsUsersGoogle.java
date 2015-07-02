package com.world.wen.model;

/**
 * AwsUsersGoogle entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersGoogle implements java.io.Serializable {

	// Fields

	private String id;
	private Integer uid;
	private String name;
	private String locale;
	private String picture;
	private String gender;
	private String email;
	private String link;
	private Integer addTime;
	private String accessToken;
	private String refreshToken;
	private Integer expiresTime;

	// Constructors

	/** default constructor */
	public AwsUsersGoogle() {
	}

	/** minimal constructor */
	public AwsUsersGoogle(Integer uid, Integer addTime, Integer expiresTime) {
		this.uid = uid;
		this.addTime = addTime;
		this.expiresTime = expiresTime;
	}

	/** full constructor */
	public AwsUsersGoogle(Integer uid, String name, String locale,
			String picture, String gender, String email, String link,
			Integer addTime, String accessToken, String refreshToken,
			Integer expiresTime) {
		this.uid = uid;
		this.name = name;
		this.locale = locale;
		this.picture = picture;
		this.gender = gender;
		this.email = email;
		this.link = link;
		this.addTime = addTime;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.expiresTime = expiresTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

}