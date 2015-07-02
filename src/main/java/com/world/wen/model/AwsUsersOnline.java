package com.world.wen.model;

/**
 * AwsUsersOnline entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersOnline implements java.io.Serializable {

	// Fields

	private AwsUsersOnlineId id;

	// Constructors

	/** default constructor */
	public AwsUsersOnline() {
	}

	/** full constructor */
	public AwsUsersOnline(AwsUsersOnlineId id) {
		this.id = id;
	}

	// Property accessors

	public AwsUsersOnlineId getId() {
		return this.id;
	}

	public void setId(AwsUsersOnlineId id) {
		this.id = id;
	}

}