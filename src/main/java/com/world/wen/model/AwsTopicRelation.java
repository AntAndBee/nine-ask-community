package com.world.wen.model;

/**
 * AwsTopicRelation entity. @author MyEclipse Persistence Tools
 */

public class AwsTopicRelation implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer topicId;
	private Integer itemId;
	private Integer addTime;
	private Integer uid;
	private String type;

	// Constructors

	/** default constructor */
	public AwsTopicRelation() {
	}

	/** full constructor */
	public AwsTopicRelation(Integer topicId, Integer itemId, Integer addTime,
			Integer uid, String type) {
		this.topicId = topicId;
		this.itemId = itemId;
		this.addTime = addTime;
		this.uid = uid;
		this.type = type;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTopicId() {
		return this.topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
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

}