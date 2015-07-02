package com.world.wen.model;

/**
 * AwsReceivingEmailConfig entity. @author MyEclipse Persistence Tools
 */

public class AwsReceivingEmailConfig implements java.io.Serializable {

	// Fields

	private Integer id;
	private String protocol;
	private String server;
	private Boolean ssl;
	private Short port;
	private String username;
	private String password;
	private Integer uid;
	private String accessKey;
	private Boolean hasAttach;

	// Constructors

	/** default constructor */
	public AwsReceivingEmailConfig() {
	}

	/** minimal constructor */
	public AwsReceivingEmailConfig(String protocol, String server, Boolean ssl,
			String username, String password, Integer uid, String accessKey,
			Boolean hasAttach) {
		this.protocol = protocol;
		this.server = server;
		this.ssl = ssl;
		this.username = username;
		this.password = password;
		this.uid = uid;
		this.accessKey = accessKey;
		this.hasAttach = hasAttach;
	}

	/** full constructor */
	public AwsReceivingEmailConfig(String protocol, String server, Boolean ssl,
			Short port, String username, String password, Integer uid,
			String accessKey, Boolean hasAttach) {
		this.protocol = protocol;
		this.server = server;
		this.ssl = ssl;
		this.port = port;
		this.username = username;
		this.password = password;
		this.uid = uid;
		this.accessKey = accessKey;
		this.hasAttach = hasAttach;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public Boolean getSsl() {
		return this.ssl;
	}

	public void setSsl(Boolean ssl) {
		this.ssl = ssl;
	}

	public Short getPort() {
		return this.port;
	}

	public void setPort(Short port) {
		this.port = port;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public Boolean getHasAttach() {
		return this.hasAttach;
	}

	public void setHasAttach(Boolean hasAttach) {
		this.hasAttach = hasAttach;
	}

}