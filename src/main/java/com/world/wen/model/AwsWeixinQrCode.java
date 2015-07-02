package com.world.wen.model;

/**
 * AwsWeixinQrCode entity. @author MyEclipse Persistence Tools
 */

public class AwsWeixinQrCode implements java.io.Serializable {

	// Fields

	private Integer sceneId;
	private String ticket;
	private String description;
	private Integer subscribeNum;

	// Constructors

	/** default constructor */
	public AwsWeixinQrCode() {
	}

	/** minimal constructor */
	public AwsWeixinQrCode(String description, Integer subscribeNum) {
		this.description = description;
		this.subscribeNum = subscribeNum;
	}

	/** full constructor */
	public AwsWeixinQrCode(String ticket, String description,
			Integer subscribeNum) {
		this.ticket = ticket;
		this.description = description;
		this.subscribeNum = subscribeNum;
	}

	// Property accessors

	public Integer getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}

	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSubscribeNum() {
		return this.subscribeNum;
	}

	public void setSubscribeNum(Integer subscribeNum) {
		this.subscribeNum = subscribeNum;
	}

}