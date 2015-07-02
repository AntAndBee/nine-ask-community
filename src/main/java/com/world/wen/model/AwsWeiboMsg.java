package com.world.wen.model;

/**
 * AwsWeiboMsg entity. @author MyEclipse Persistence Tools
 */

public class AwsWeiboMsg implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer createdAt;
	private Long msgAuthorUid;
	private String text;
	private String accessKey;
	private Boolean hasAttach;
	private Integer uid;
	private Long weiboUid;
	private Integer questionId;
	private Integer ticketId;

	// Constructors

	/** default constructor */
	public AwsWeiboMsg() {
	}

	/** minimal constructor */
	public AwsWeiboMsg(Integer createdAt, Long msgAuthorUid, String text,
			String accessKey, Boolean hasAttach, Integer uid, Long weiboUid) {
		this.createdAt = createdAt;
		this.msgAuthorUid = msgAuthorUid;
		this.text = text;
		this.accessKey = accessKey;
		this.hasAttach = hasAttach;
		this.uid = uid;
		this.weiboUid = weiboUid;
	}

	/** full constructor */
	public AwsWeiboMsg(Integer createdAt, Long msgAuthorUid, String text,
			String accessKey, Boolean hasAttach, Integer uid, Long weiboUid,
			Integer questionId, Integer ticketId) {
		this.createdAt = createdAt;
		this.msgAuthorUid = msgAuthorUid;
		this.text = text;
		this.accessKey = accessKey;
		this.hasAttach = hasAttach;
		this.uid = uid;
		this.weiboUid = weiboUid;
		this.questionId = questionId;
		this.ticketId = ticketId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	public Long getMsgAuthorUid() {
		return this.msgAuthorUid;
	}

	public void setMsgAuthorUid(Long msgAuthorUid) {
		this.msgAuthorUid = msgAuthorUid;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public Boolean getHasAttach() {
		return this.hasAttach;
	}

	public void setHasAttach(Boolean hasAttach) {
		this.hasAttach = hasAttach;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Long getWeiboUid() {
		return this.weiboUid;
	}

	public void setWeiboUid(Long weiboUid) {
		this.weiboUid = weiboUid;
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

}