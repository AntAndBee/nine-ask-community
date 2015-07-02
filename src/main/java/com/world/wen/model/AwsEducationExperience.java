package com.world.wen.model;

/**
 * AwsEducationExperience entity. @author MyEclipse Persistence Tools
 */

public class AwsEducationExperience implements java.io.Serializable {

	// Fields

	private Integer educationId;
	private Integer uid;
	private Integer educationYears;
	private String schoolName;
	private Short schoolType;
	private String departments;
	private Integer addTime;

	// Constructors

	/** default constructor */
	public AwsEducationExperience() {
	}

	/** full constructor */
	public AwsEducationExperience(Integer uid, Integer educationYears,
			String schoolName, Short schoolType, String departments,
			Integer addTime) {
		this.uid = uid;
		this.educationYears = educationYears;
		this.schoolName = schoolName;
		this.schoolType = schoolType;
		this.departments = departments;
		this.addTime = addTime;
	}

	// Property accessors

	public Integer getEducationId() {
		return this.educationId;
	}

	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getEducationYears() {
		return this.educationYears;
	}

	public void setEducationYears(Integer educationYears) {
		this.educationYears = educationYears;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Short getSchoolType() {
		return this.schoolType;
	}

	public void setSchoolType(Short schoolType) {
		this.schoolType = schoolType;
	}

	public String getDepartments() {
		return this.departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	public Integer getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}

}