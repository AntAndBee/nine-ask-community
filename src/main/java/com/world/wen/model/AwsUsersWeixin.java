package com.world.wen.model;

/**
 * AwsUsersWeixin entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersWeixin implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String openid;
	private Integer expiresIn;
	private String accessToken;
	private String refreshToken;
	private String scope;
	private String headimgurl;
	private String nickname;
	private Boolean sex;
	private String province;
	private String city;
	private String country;
	private Integer addTime;
	private Float latitude;
	private Float longitude;
	private Integer locationUpdate;

	// Constructors

	/** default constructor */
	public AwsUsersWeixin() {
	}

	/** minimal constructor */
	public AwsUsersWeixin(Integer uid, String openid, Integer addTime) {
		this.uid = uid;
		this.openid = openid;
		this.addTime = addTime;
	}

	/** full constructor */
	public AwsUsersWeixin(Integer uid, String openid, Integer expiresIn,
			String accessToken, String refreshToken, String scope,
			String headimgurl, String nickname, Boolean sex, String province,
			String city, String country, Integer addTime, Float latitude,
			Float longitude, Integer locationUpdate) {
		this.uid = uid;
		this.openid = openid;
		this.expiresIn = expiresIn;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.scope = scope;
		this.headimgurl = headimgurl;
		this.nickname = nickname;
		this.sex = sex;
		this.province = province;
		this.city = city;
		this.country = country;
		this.addTime = addTime;
		this.latitude = latitude;
		this.longitude = longitude;
		this.locationUpdate = locationUpdate;
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

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Integer getExpiresIn() {
		return this.expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
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

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Integer getLocationUpdate() {
		return this.locationUpdate;
	}

	public void setLocationUpdate(Integer locationUpdate) {
		this.locationUpdate = locationUpdate;
	}

}