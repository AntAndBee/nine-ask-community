package com.world.wen.model;

/**
 * AwsFeature entity. @author MyEclipse Persistence Tools
 */

public class AwsFeature implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String description;
	private String icon;
	private Integer topicCount;
	private String css;
	private String urlToken;
	private String seoTitle;
	private Boolean enabled;

	// Constructors

	/** default constructor */
	public AwsFeature() {
	}

	/** minimal constructor */
	public AwsFeature(Integer topicCount, Boolean enabled) {
		this.topicCount = topicCount;
		this.enabled = enabled;
	}

	/** full constructor */
	public AwsFeature(String title, String description, String icon,
			Integer topicCount, String css, String urlToken, String seoTitle,
			Boolean enabled) {
		this.title = title;
		this.description = description;
		this.icon = icon;
		this.topicCount = topicCount;
		this.css = css;
		this.urlToken = urlToken;
		this.seoTitle = seoTitle;
		this.enabled = enabled;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getTopicCount() {
		return this.topicCount;
	}

	public void setTopicCount(Integer topicCount) {
		this.topicCount = topicCount;
	}

	public String getCss() {
		return this.css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getUrlToken() {
		return this.urlToken;
	}

	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}

	public String getSeoTitle() {
		return this.seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}