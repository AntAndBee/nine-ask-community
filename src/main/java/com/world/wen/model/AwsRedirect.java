package com.world.wen.model;

/**
 * AwsRedirect entity. @author MyEclipse Persistence Tools
 */

public class AwsRedirect implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer itemId;
	private Integer targetId;
	private Integer time;
	private Integer uid;

	// Constructors

	/** default constructor */
	public AwsRedirect() {
	}

	/** full constructor */
	public AwsRedirect(Integer itemId, Integer targetId, Integer time,
			Integer uid) {
		this.itemId = itemId;
		this.targetId = targetId;
		this.time = time;
		this.uid = uid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

}