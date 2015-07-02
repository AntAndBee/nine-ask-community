package com.world.wen.model;

/**
 * AwsSystemSetting entity. @author MyEclipse Persistence Tools
 */

public class AwsSystemSetting implements java.io.Serializable {

	// Fields

	private Integer id;
	private String varname;
	private String value;

	// Constructors

	/** default constructor */
	public AwsSystemSetting() {
	}

	/** minimal constructor */
	public AwsSystemSetting(String varname) {
		this.varname = varname;
	}

	/** full constructor */
	public AwsSystemSetting(String varname, String value) {
		this.varname = varname;
		this.value = value;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVarname() {
		return this.varname;
	}

	public void setVarname(String varname) {
		this.varname = varname;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}