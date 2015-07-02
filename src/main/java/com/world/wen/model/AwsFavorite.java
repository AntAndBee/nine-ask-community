package com.world.wen.model;

/**
 * AwsFavorite entity. @author MyEclipse Persistence Tools
 */

public class AwsFavorite implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer itemId;
	private Integer time;
	private String type;

	// Constructors

	/** default constructor */
	public AwsFavorite() {
	}

	/** minimal constructor */
	public AwsFavorite(String type) {
		this.type = type;
	}

	/** full constructor */
	public AwsFavorite(Integer uid, Integer itemId, Integer time, String type) {
		this.uid = uid;
		this.itemId = itemId;
		this.time = time;
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

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}