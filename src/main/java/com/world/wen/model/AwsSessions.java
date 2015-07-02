package com.world.wen.model;

/**
 * AwsSessions entity. @author MyEclipse Persistence Tools
 */

public class AwsSessions implements java.io.Serializable {

	// Fields

	private String id;
	private Integer modified;
	private String data;
	private Integer lifetime;

	// Constructors

	/** default constructor */
	public AwsSessions() {
	}

	/** full constructor */
	public AwsSessions(Integer modified, String data, Integer lifetime) {
		this.modified = modified;
		this.data = data;
		this.lifetime = lifetime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getModified() {
		return this.modified;
	}

	public void setModified(Integer modified) {
		this.modified = modified;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getLifetime() {
		return this.lifetime;
	}

	public void setLifetime(Integer lifetime) {
		this.lifetime = lifetime;
	}

}