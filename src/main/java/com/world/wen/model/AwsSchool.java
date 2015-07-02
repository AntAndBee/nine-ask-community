package com.world.wen.model;

/**
 * AwsSchool entity. @author MyEclipse Persistence Tools
 */

public class AwsSchool implements java.io.Serializable {

	// Fields

	private Integer schoolId;
	private Short schoolType;
	private Integer schoolCode;
	private String schoolName;
	private Integer areaCode;

	// Constructors

	/** default constructor */
	public AwsSchool() {
	}

	/** full constructor */
	public AwsSchool(Short schoolType, Integer schoolCode, String schoolName,
			Integer areaCode) {
		this.schoolType = schoolType;
		this.schoolCode = schoolCode;
		this.schoolName = schoolName;
		this.areaCode = areaCode;
	}

	// Property accessors

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public Short getSchoolType() {
		return this.schoolType;
	}

	public void setSchoolType(Short schoolType) {
		this.schoolType = schoolType;
	}

	public Integer getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(Integer schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

}