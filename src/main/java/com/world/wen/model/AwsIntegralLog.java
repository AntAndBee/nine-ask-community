package com.world.wen.model;

/**
 * AwsIntegralLog entity. @author MyEclipse Persistence Tools
 */

public class AwsIntegralLog implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String action;
	private Integer integral;
	private String note;
	private Integer balance;
	private Integer itemId;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsIntegralLog() {
	}

	/** full constructor */
	public AwsIntegralLog(Integer uid, String action, Integer integral,
			String note, Integer balance, Integer itemId, Integer time) {
		this.uid = uid;
		this.action = action;
		this.integral = integral;
		this.note = note;
		this.balance = balance;
		this.itemId = itemId;
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

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getBalance() {
		return this.balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
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

}