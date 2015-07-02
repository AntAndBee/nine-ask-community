package com.world.wen.model;

/**
 * AwsFavoriteTag entity. @author MyEclipse Persistence Tools
 */

public class AwsFavoriteTag implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String title;
	private Integer itemId;
	private String type;

	// Constructors

	/** default constructor */
	public AwsFavoriteTag() {
	}

	/** minimal constructor */
	public AwsFavoriteTag(String type) {
		this.type = type;
	}

	/** full constructor */
	public AwsFavoriteTag(Integer uid, String title, Integer itemId, String type) {
		this.uid = uid;
		this.title = title;
		this.itemId = itemId;
		this.type = type;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}