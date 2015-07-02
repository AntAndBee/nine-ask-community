package com.world.wen.model;

/**
 * AwsEdmUsergroup entity. @author MyEclipse Persistence Tools
 */

public class AwsEdmUsergroup implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsEdmUsergroup() {
	}

	/** full constructor */
	public AwsEdmUsergroup(String title, Integer time) {
		this.title = title;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}