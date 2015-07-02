package com.world.wen.model;

/**
 * AwsWeixinMessage entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinMessage implements java.io.Serializable {

	// Fields

	private Integer id;
	private String weixinId;
	private String content;
	private String action;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsWeixinMessage() {
	}

	/** minimal constructor */
	public AwsWeixinMessage(String weixinId, String content) {
		this.weixinId = weixinId;
		this.content = content;
	}

	/** full constructor */
	public AwsWeixinMessage(String weixinId, String content, String action,
			Integer time) {
		this.weixinId = weixinId;
		this.content = content;
		this.action = action;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWeixinId() {
		return this.weixinId;
	}

	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}