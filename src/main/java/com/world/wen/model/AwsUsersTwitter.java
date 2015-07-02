package com.world.wen.model;

/**
 * AwsUsersTwitter entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersTwitter implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer uid;
	private String name;
	private String screenName;
	private String location;
	private String timeZone;
	private String lang;
	private String profileImageUrl;
	private Integer addTime;
	private String accessToken;

	// Constructors

	/** default constructor */
	public AwsUsersTwitter() {
	}

	/** minimal constructor */
	public AwsUsersTwitter(Integer uid, Integer addTime, String accessToken) {
		this.uid = uid;
		this.addTime = addTime;
		this.accessToken = accessToken;
	}

	/** full constructor */
	public AwsUsersTwitter(Integer uid, String name, String screenName,
			String location, String timeZone, String lang,
			String profileImageUrl, Integer addTime, String accessToken) {
		this.uid = uid;
		this.name = name;
		this.screenName = screenName;
		this.location = location;
		this.timeZone = timeZone;
		this.lang = lang;
		this.profileImageUrl = profileImageUrl;
		this.addTime = addTime;
		this.accessToken = accessToken;
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

	public String getScreenName() {
		return this.screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getProfileImageUrl() {
		return this.profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
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

}