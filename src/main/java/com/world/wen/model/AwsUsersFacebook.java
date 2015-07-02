package com.world.wen.model;

/**
 * AwsUsersFacebook entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersFacebook implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer uid;
	private String name;
	private String email;
	private String link;
	private String gender;
	private String locale;
	private Short timezone;
	private String picture;
	private String accessToken;
	private Integer expiresTime;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsUsersFacebook() {
	}

	/** minimal constructor */
	public AwsUsersFacebook(Integer uid, Integer expiresTime, Integer addTime) {
		this.uid = uid;
		this.expiresTime = expiresTime;
		this.addTime = addTime;
	}

	/** full constructor */
	public AwsUsersFacebook(Integer uid, String name, String email,
			String link, String gender, String locale, Short timezone,
			String picture, String accessToken, Integer expiresTime,
			Integer addTime) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.link = link;
		this.gender = gender;
		this.locale = locale;
		this.timezone = timezone;
		this.picture = picture;
		this.accessToken = accessToken;
		this.expiresTime = expiresTime;
		this.addTime = addTime;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Short getTimezone() {
		return this.timezone;
	}

	public void setTimezone(Short timezone) {
		this.timezone = timezone;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresTime() {
		return this.expiresTime;
	}

	public void setExpiresTime(Integer expiresTime) {
		this.expiresTime = expiresTime;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}