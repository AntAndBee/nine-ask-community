package com.world.wen.model;

/**
 * AwsUsersSina entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersSina implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer uid;
	private String name;
	private String location;
	private String description;
	private String url;
	private String profileImageUrl;
	private String gender;
	private Integer addTime;
	private Integer expiresTime;
	private String accessToken;
	private Long lastMsgId;

	// Constructors

	/** default constructor */
	public AwsUsersSina() {
	}

	/** minimal constructor */
	public AwsUsersSina(Integer uid) {
		this.uid = uid;
	}

	/** full constructor */
	public AwsUsersSina(Integer uid, String name, String location,
			String description, String url, String profileImageUrl,
			String gender, Integer addTime, Integer expiresTime,
			String accessToken, Long lastMsgId) {
		this.uid = uid;
		this.name = name;
		this.location = location;
		this.description = description;
		this.url = url;
		this.profileImageUrl = profileImageUrl;
		this.gender = gender;
		this.addTime = addTime;
		this.expiresTime = expiresTime;
		this.accessToken = accessToken;
		this.lastMsgId = lastMsgId;
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProfileImageUrl() {
		return this.profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
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

	public Integer getExpiresTime() {
		return this.expiresTime;
	}

	public void setExpiresTime(Integer expiresTime) {
		this.expiresTime = expiresTime;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getLastMsgId() {
		return this.lastMsgId;
	}

	public void setLastMsgId(Long lastMsgId) {
		this.lastMsgId = lastMsgId;
	}

}