package com.world.wen.model;

/**
 * AwsSearchCache entity. @author MyEclipse Persistence Tools
 */

public class AwsSearchCache implements java.io.Serializable {

	// Fields

	private Integer id;
	private String hash;
	private String data;
	private Integer time;

	// Constructors

	/** default constructor */
	public AwsSearchCache() {
	}

	/** full constructor */
	public AwsSearchCache(String hash, String data, Integer time) {
		this.hash = hash;
		this.data = data;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}