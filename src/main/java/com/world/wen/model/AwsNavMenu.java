package com.world.wen.model;

/**
 * AwsNavMenu entity. @author MyEclipse Persistence Tools
 */

public class AwsNavMenu implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String description;
	private String type;
	private Integer typeId;
	private String link;
	private String icon;
	private Short sort;

	// Constructors

	/** default constructor */
	public AwsNavMenu() {
	}

	/** full constructor */
	public AwsNavMenu(String title, String description, String type,
			Integer typeId, String link, String icon, Short sort) {
		this.title = title;
		this.description = description;
		this.type = type;
		this.typeId = typeId;
		this.link = link;
		this.icon = icon;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Short getSort() {
		return this.sort;
	}

	public void setSort(Short sort) {
		this.sort = sort;
	}

}