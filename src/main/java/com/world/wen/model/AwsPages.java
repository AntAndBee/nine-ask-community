package com.world.wen.model;

/**
 * AwsPages entity. @author MyEclipse Persistence Tools
 */

public class AwsPages implements java.io.Serializable {

	// Fields

	private Integer id;
	private String urlToken;
	private String title;
	private String keywords;
	private String description;
	private String contents;
	private Boolean enabled;

	// Constructors

	/** default constructor */
	public AwsPages() {
	}

	/** minimal constructor */
	public AwsPages(String urlToken, Boolean enabled) {
		this.urlToken = urlToken;
		this.enabled = enabled;
	}

	/** full constructor */
	public AwsPages(String urlToken, String title, String keywords,
			String description, String contents, Boolean enabled) {
		this.urlToken = urlToken;
		this.title = title;
		this.keywords = keywords;
		this.description = description;
		this.contents = contents;
		this.enabled = enabled;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrlToken() {
		return this.urlToken;
	}

	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}