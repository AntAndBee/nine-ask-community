package com.world.wen.model;

/**
 * AwsWorkExperience entity. @author MyEclipse Persistence Tools
 */

public class AwsWorkExperience implements java.io.Serializable {

	// Fields

	private Integer workId;
	private Integer uid;
	private Integer startYear;
	private Integer endYear;
	private String companyName;
	private Integer jobId;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsWorkExperience() {
	}

	/** full constructor */
	public AwsWorkExperience(Integer uid, Integer startYear, Integer endYear,
			String companyName, Integer jobId, Integer addTime) {
		this.uid = uid;
		this.startYear = startYear;
		this.endYear = endYear;
		this.companyName = companyName;
		this.jobId = jobId;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getWorkId() {
		return this.workId;
	}

	public void setWorkId(Integer workId) {
		this.workId = workId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getStartYear() {
		return this.startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getEndYear() {
		return this.endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}