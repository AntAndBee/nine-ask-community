package com.world.wen.model;

/**
 * AwsWeixinAccounts entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinAccounts implements java.io.Serializable {

	// Fields

	private Integer id;
	private String weixinMpToken;
	private String weixinAccountRole;
	private String weixinAppId;
	private String weixinAppSecret;
	private String weixinMpMenu;
	private String weixinSubscribeMessageKey;
	private String weixinNoResultMessageKey;
	private String weixinEncodingAesKey;

	// Constructors

	/** default constructor */
	public AwsWeixinAccounts() {
	}

	/** minimal constructor */
	public AwsWeixinAccounts(String weixinMpToken) {
		this.weixinMpToken = weixinMpToken;
	}

	/** full constructor */
	public AwsWeixinAccounts(String weixinMpToken, String weixinAccountRole,
			String weixinAppId, String weixinAppSecret, String weixinMpMenu,
			String weixinSubscribeMessageKey, String weixinNoResultMessageKey,
			String weixinEncodingAesKey) {
		this.weixinMpToken = weixinMpToken;
		this.weixinAccountRole = weixinAccountRole;
		this.weixinAppId = weixinAppId;
		this.weixinAppSecret = weixinAppSecret;
		this.weixinMpMenu = weixinMpMenu;
		this.weixinSubscribeMessageKey = weixinSubscribeMessageKey;
		this.weixinNoResultMessageKey = weixinNoResultMessageKey;
		this.weixinEncodingAesKey = weixinEncodingAesKey;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeixinMpToken() {
		return this.weixinMpToken;
	}

	public void setWeixinMpToken(String weixinMpToken) {
		this.weixinMpToken = weixinMpToken;
	}

	public String getWeixinAccountRole() {
		return this.weixinAccountRole;
	}

	public void setWeixinAccountRole(String weixinAccountRole) {
		this.weixinAccountRole = weixinAccountRole;
	}

	public String getWeixinAppId() {
		return this.weixinAppId;
	}

	public void setWeixinAppId(String weixinAppId) {
		this.weixinAppId = weixinAppId;
	}

	public String getWeixinAppSecret() {
		return this.weixinAppSecret;
	}

	public void setWeixinAppSecret(String weixinAppSecret) {
		this.weixinAppSecret = weixinAppSecret;
	}

	public String getWeixinMpMenu() {
		return this.weixinMpMenu;
	}

	public void setWeixinMpMenu(String weixinMpMenu) {
		this.weixinMpMenu = weixinMpMenu;
	}

	public String getWeixinSubscribeMessageKey() {
		return this.weixinSubscribeMessageKey;
	}

	public void setWeixinSubscribeMessageKey(String weixinSubscribeMessageKey) {
		this.weixinSubscribeMessageKey = weixinSubscribeMessageKey;
	}

	public String getWeixinNoResultMessageKey() {
		return this.weixinNoResultMessageKey;
	}

	public void setWeixinNoResultMessageKey(String weixinNoResultMessageKey) {
		this.weixinNoResultMessageKey = weixinNoResultMessageKey;
	}

	public String getWeixinEncodingAesKey() {
		return this.weixinEncodingAesKey;
	}

	public void setWeixinEncodingAesKey(String weixinEncodingAesKey) {
		this.weixinEncodingAesKey = weixinEncodingAesKey;
	}

}