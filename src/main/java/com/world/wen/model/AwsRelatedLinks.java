package com.world.wen.model;

/**
 * AwsRelatedLinks entity. @author MyEclipse Persistence Tools
 */

public class AwsRelatedLinks implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String itemType;
	private Integer itemId;
	private String link;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsRelatedLinks() {
	}

	/** minimal constructor */
	public AwsRelatedLinks(Integer uid, String itemType, Integer itemId,
			String link) {
		this.uid = uid;
		this.itemType = itemType;
		this.itemId = itemId;
		this.link = link;
	}

	/** full constructor */
	public AwsRelatedLinks(Integer uid, String itemType, Integer itemId,
			String link, Integer addTime) {
		this.uid = uid;
		this.itemType = itemType;
		this.itemId = itemId;
		this.link = link;
		this.addTime = addTime;
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

	public String getItemType() {
		return this.itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}