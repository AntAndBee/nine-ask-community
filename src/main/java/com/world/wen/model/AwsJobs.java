package com.world.wen.model;

/**
 * AwsJobs entity. @author MyEclipse Persistence Tools
 */

public class AwsJobs implements java.io.Serializable {

	// Fields

	private Integer id;
	private String jobName;

	// Constructors

	/** default constructor */
	public AwsJobs() {
	}

	/** full constructor */
	public AwsJobs(String jobName) {
		this.jobName = jobName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

}