package com.world.wen.model;

/**
 * AwsCategory entity. @author MyEclipse Persistence Tools
 */

public class AwsCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String type;
	private String icon;
	private Integer parentId;
	private Short sort;
	private String urlToken;

	// Constructors

	/** default constructor */
	public AwsCategory() {
	}

	/** full constructor */
	public AwsCategory(String title, String type, String icon,
			Integer parentId, Short sort, String urlToken) {
		this.title = title;
		this.type = type;
		this.icon = icon;
		this.parentId = parentId;
		this.sort = sort;
		this.urlToken = urlToken;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Short getSort() {
		return this.sort;
	}

	public void setSort(Short sort) {
		this.sort = sort;
	}

	public String getUrlToken() {
		return this.urlToken;
	}

	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}

}