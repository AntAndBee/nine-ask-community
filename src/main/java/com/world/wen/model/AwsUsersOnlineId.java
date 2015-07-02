package com.world.wen.model;

/**
 * AwsUsersOnlineId entity. @author MyEclipse Persistence Tools
 */

public class AwsUsersOnlineId implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Integer lastActive;
	private Long ip;
	private String activeUrl;
	private String userAgent;

	// Constructors

	/** default constructor */
	public AwsUsersOnlineId() {
	}

	/** minimal constructor */
	public AwsUsersOnlineId(Integer uid) {
		this.uid = uid;
	}

	/** full constructor */
	public AwsUsersOnlineId(Integer uid, Integer lastActive, Long ip,
			String activeUrl, String userAgent) {
		this.uid = uid;
		this.lastActive = lastActive;
		this.ip = ip;
		this.activeUrl = activeUrl;
		this.userAgent = userAgent;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getLastActive() {
		return this.lastActive;
	}

	public void setLastActive(Integer lastActive) {
		this.lastActive = lastActive;
	}

	public Long getIp() {
		return this.ip;
	}

	public void setIp(Long ip) {
		this.ip = ip;
	}

	public String getActiveUrl() {
		return this.activeUrl;
	}

	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AwsUsersOnlineId))
			return false;
		AwsUsersOnlineId castOther = (AwsUsersOnlineId) other;

		return ((this.getUid() == castOther.getUid()) || (this.getUid() != null
				&& castOther.getUid() != null && this.getUid().equals(
				castOther.getUid())))
				&& ((this.getLastActive() == castOther.getLastActive()) || (this
						.getLastActive() != null
						&& castOther.getLastActive() != null && this
						.getLastActive().equals(castOther.getLastActive())))
				&& ((this.getIp() == castOther.getIp()) || (this.getIp() != null
						&& castOther.getIp() != null && this.getIp().equals(
						castOther.getIp())))
				&& ((this.getActiveUrl() == castOther.getActiveUrl()) || (this
						.getActiveUrl() != null
						&& castOther.getActiveUrl() != null && this
						.getActiveUrl().equals(castOther.getActiveUrl())))
				&& ((this.getUserAgent() == castOther.getUserAgent()) || (this
						.getUserAgent() != null
						&& castOther.getUserAgent() != null && this
						.getUserAgent().equals(castOther.getUserAgent())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUid() == null ? 0 : this.getUid().hashCode());
		result = 37
				* result
				+ (getLastActive() == null ? 0 : this.getLastActive()
						.hashCode());
		result = 37 * result + (getIp() == null ? 0 : this.getIp().hashCode());
		result = 37 * result
				+ (getActiveUrl() == null ? 0 : this.getActiveUrl().hashCode());
		result = 37 * result
				+ (getUserAgent() == null ? 0 : this.getUserAgent().hashCode());
		return result;
	}

}