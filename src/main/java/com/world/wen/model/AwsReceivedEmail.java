package com.world.wen.model;

/**
 * AwsReceivedEmail entity. @author MyEclipse Persistence Tools
 */

public class AwsReceivedEmail implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer configId;
	private String messageId;
	private Integer date;
	private String from;
	private String subject;
	private String content;
	private Integer questionId;
	private Integer ticketId;

	// Constructors

	/** default constructor */
	public AwsReceivedEmail() {
	}

	/** minimal constructor */
	public AwsReceivedEmail(Integer uid, Integer configId, String messageId,
			Integer date, String from) {
		this.uid = uid;
		this.configId = configId;
		this.messageId = messageId;
		this.date = date;
		this.from = from;
	}

	/** full constructor */
	public AwsReceivedEmail(Integer uid, Integer configId, String messageId,
			Integer date, String from, String subject, String content,
			Integer questionId, Integer ticketId) {
		this.uid = uid;
		this.configId = configId;
		this.messageId = messageId;
		this.date = date;
		this.from = from;
		this.subject = subject;
		this.content = content;
		this.questionId = questionId;
		this.ticketId = ticketId;
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

	public Integer getConfigId() {
		return this.configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Integer getDate() {
		return this.date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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