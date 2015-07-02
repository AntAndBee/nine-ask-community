package com.world.wen.model;

/**
 * AwsWeixinReplyRule entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinReplyRule implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer accountId;
	private String keyword;
	private String title;
	private String imageFile;
	private String description;
	private String link;
	private Boolean enabled;
	private Integer sortStatus;

	// Constructors

	/** default constructor */
	public AwsWeixinReplyRule() {
	}

	/** minimal constructor */
	public AwsWeixinReplyRule(Integer accountId, String keyword, String title) {
		this.accountId = accountId;
		this.keyword = keyword;
		this.title = title;
	}

	/** full constructor */
	public AwsWeixinReplyRule(Integer accountId, String keyword, String title,
			String imageFile, String description, String link, Boolean enabled,
			Integer sortStatus) {
		this.accountId = accountId;
		this.keyword = keyword;
		this.title = title;
		this.imageFile = imageFile;
		this.description = description;
		this.link = link;
		this.enabled = enabled;
		this.sortStatus = sortStatus;
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageFile() {
		return this.imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getSortStatus() {
		return this.sortStatus;
	}

	public void setSortStatus(Integer sortStatus) {
		this.sortStatus = sortStatus;
	}

}