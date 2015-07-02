package com.world.wen.model;

/**
 * AwsUsersAttrib entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersAttrib implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private String introduction;
	private String signature;
	private Long qq;
	private String homepage;

	// Constructors

	/** default constructor */
	public AwsUsersAttrib() {
	}

	/** full constructor */
	public AwsUsersAttrib(Integer uid, String introduction, String signature,
			Long qq, String homepage) {
		this.uid = uid;
		this.introduction = introduction;
		this.signature = signature;
		this.qq = qq;
		this.homepage = homepage;
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

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Long getQq() {
		return this.qq;
	}

	public void setQq(Long qq) {
		this.qq = qq;
	}

	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

}