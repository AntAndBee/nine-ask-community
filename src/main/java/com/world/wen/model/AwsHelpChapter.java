package com.world.wen.model;

/**
 * AwsHelpChapter entity. @author MyEclipse Persistence Tools
 */

public class AwsHelpChapter implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String description;
	private String urlToken;
	private Short sort;

	// Constructors

	/** default constructor */
	public AwsHelpChapter() {
	}

	/** minimal constructor */
	public AwsHelpChapter(String title, Short sort) {
		this.title = title;
		this.sort = sort;
	}

	/** full constructor */
	public AwsHelpChapter(String title, String description, String urlToken,
			Short sort) {
		this.title = title;
		this.description = description;
		this.urlToken = urlToken;
		this.sort = sort;
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

	public String getUrlToken() {
		return this.urlToken;
	}

	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}

	public Short getSort() {
		return this.sort;
	}

	public void setSort(Short sort) {
		this.sort = sort;
	}

}