package com.world.wen.model;

/**
 * AwsWeixinThirdPartyApi entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinThirdPartyApi implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer accountId;
	private String url;
	private String token;
	private Boolean enabled;
	private Short rank;

	// Constructors

	/** default constructor */
	public AwsWeixinThirdPartyApi() {
	}

	/** full constructor */
	public AwsWeixinThirdPartyApi(Integer accountId, String url, String token,
			Boolean enabled, Short rank) {
		this.accountId = accountId;
		this.url = url;
		this.token = token;
		this.enabled = enabled;
		this.rank = rank;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Short getRank() {
		return this.rank;
	}

	public void setRank(Short rank) {
		this.rank = rank;
	}

}