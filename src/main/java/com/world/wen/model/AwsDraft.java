package com.world.wen.model;

/**
 * AwsDraft entity. @author MyEclipse Persistence Tools
 */

public class AwsDraft implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String type;
	private Integer itemId;
	private String data;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsDraft() {
	}

	/** full constructor */
	public AwsDraft(Integer uid, String type, Integer itemId, String data,
			Integer time) {
		this.uid = uid;
		this.type = type;
		this.itemId = itemId;
		this.data = data;
		this.time = time;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}