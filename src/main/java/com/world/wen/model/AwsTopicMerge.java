package com.world.wen.model;

/**
 * AwsTopicMerge entity. @author MyEclipse Persistence Tools
 */

public class AwsTopicMerge implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer sourceId;
	private Integer targetId;
	private Integer uid;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsTopicMerge() {
	}

	/** minimal constructor */
	public AwsTopicMerge(Integer sourceId, Integer targetId) {
		this.sourceId = sourceId;
		this.targetId = targetId;
	}

	/** full constructor */
	public AwsTopicMerge(Integer sourceId, Integer targetId, Integer uid,
			Integer time) {
		this.sourceId = sourceId;
		this.targetId = targetId;
		this.uid = uid;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Integer getTargetId() {
		return this.targetId;
	}

	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}