package com.world.wen.model;

/**
 * AwsUsers entity. @author MyEclipse Persistence Tools
 */

public class AwsUsers implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String userName;
	private String email;
	private String mobile;
	private String password;
	private String salt;
	private String avatarFile;
	private Boolean sex;
	private Integer birthday;
	private String province;
	private String city;
	private Integer jobId;
	private Integer regTime;
	private Long regIp;
	private Integer lastLogin;
	private Long lastIp;
	private Integer onlineTime;
	private Integer lastActive;
	private Integer notificationUnread;
	private Integer inboxUnread;
	private Boolean inboxRecv;
	private Integer fansCount;
	private Integer friendCount;
	private Integer inviteCount;
	private Integer articleCount;
	private Integer questionCount;
	private Integer answerCount;
	private Integer topicFocusCount;
	private Integer invitationAvailable;
	private Integer groupId;
	private Integer reputationGroup;
	private Boolean forbidden;
	private Boolean validEmail;
	private Boolean isFirstLogin;
	private Integer agreeCount;
	private Integer thanksCount;
	private Integer viewsCount;
	private Integer reputation;
	private Integer reputationUpdateTime;
	private Boolean weiboVisit;
	private Integer integral;
	private Integer draftCount;
	private String commonEmail;
	private String urlToken;
	private Integer urlTokenUpdate;
	private String verified;
	private String defaultTimezone;
	private String emailSettings;
	private String weixinSettings;
	private String recentTopics;

	// Constructors

	/** default constructor */
	public AwsUsers() {
	}

	/** minimal constructor */
	public AwsUsers(Integer notificationUnread, Integer inboxUnread,
			Boolean inboxRecv, Integer fansCount, Integer friendCount,
			Integer inviteCount, Integer articleCount, Integer questionCount,
			Integer answerCount, Integer topicFocusCount,
			Integer invitationAvailable) {
		this.notificationUnread = notificationUnread;
		this.inboxUnread = inboxUnread;
		this.inboxRecv = inboxRecv;
		this.fansCount = fansCount;
		this.friendCount = friendCount;
		this.inviteCount = inviteCount;
		this.articleCount = articleCount;
		this.questionCount = questionCount;
		this.answerCount = answerCount;
		this.topicFocusCount = topicFocusCount;
		this.invitationAvailable = invitationAvailable;
	}

	/** full constructor */
	public AwsUsers(String userName, String email, String mobile,
			String password, String salt, String avatarFile, Boolean sex,
			Integer birthday, String province, String city, Integer jobId,
			Integer regTime, Long regIp, Integer lastLogin, Long lastIp,
			Integer onlineTime, Integer lastActive, Integer notificationUnread,
			Integer inboxUnread, Boolean inboxRecv, Integer fansCount,
			Integer friendCount, Integer inviteCount, Integer articleCount,
			Integer questionCount, Integer answerCount,
			Integer topicFocusCount, Integer invitationAvailable,
			Integer groupId, Integer reputationGroup, Boolean forbidden,
			Boolean validEmail, Boolean isFirstLogin, Integer agreeCount,
			Integer thanksCount, Integer viewsCount, Integer reputation,
			Integer reputationUpdateTime, Boolean weiboVisit, Integer integral,
			Integer draftCount, String commonEmail, String urlToken,
			Integer urlTokenUpdate, String verified, String defaultTimezone,
			String emailSettings, String weixinSettings, String recentTopics) {
		this.userName = userName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.salt = salt;
		this.avatarFile = avatarFile;
		this.sex = sex;
		this.birthday = birthday;
		this.province = province;
		this.city = city;
		this.jobId = jobId;
		this.regTime = regTime;
		this.regIp = regIp;
		this.lastLogin = lastLogin;
		this.lastIp = lastIp;
		this.onlineTime = onlineTime;
		this.lastActive = lastActive;
		this.notificationUnread = notificationUnread;
		this.inboxUnread = inboxUnread;
		this.inboxRecv = inboxRecv;
		this.fansCount = fansCount;
		this.friendCount = friendCount;
		this.inviteCount = inviteCount;
		this.articleCount = articleCount;
		this.questionCount = questionCount;
		this.answerCount = answerCount;
		this.topicFocusCount = topicFocusCount;
		this.invitationAvailable = invitationAvailable;
		this.groupId = groupId;
		this.reputationGroup = reputationGroup;
		this.forbidden = forbidden;
		this.validEmail = validEmail;
		this.isFirstLogin = isFirstLogin;
		this.agreeCount = agreeCount;
		this.thanksCount = thanksCount;
		this.viewsCount = viewsCount;
		this.reputation = reputation;
		this.reputationUpdateTime = reputationUpdateTime;
		this.weiboVisit = weiboVisit;
		this.integral = integral;
		this.draftCount = draftCount;
		this.commonEmail = commonEmail;
		this.urlToken = urlToken;
		this.urlTokenUpdate = urlTokenUpdate;
		this.verified = verified;
		this.defaultTimezone = defaultTimezone;
		this.emailSettings = emailSettings;
		this.weixinSettings = weixinSettings;
		this.recentTopics = recentTopics;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getAvatarFile() {
		return this.avatarFile;
	}

	public void setAvatarFile(String avatarFile) {
		this.avatarFile = avatarFile;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Integer getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Integer getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Integer regTime) {
		this.regTime = regTime;
	}

	public Long getRegIp() {
		return this.regIp;
	}

	public void setRegIp(Long regIp) {
		this.regIp = regIp;
	}

	public Integer getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Integer lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Long getLastIp() {
		return this.lastIp;
	}

	public void setLastIp(Long lastIp) {
		this.lastIp = lastIp;
	}

	public Integer getOnlineTime() {
		return this.onlineTime;
	}

	public void setOnlineTime(Integer onlineTime) {
		this.onlineTime = onlineTime;
	}

	public Integer getLastActive() {
		return this.lastActive;
	}

	public void setLastActive(Integer lastActive) {
		this.lastActive = lastActive;
	}

	public Integer getNotificationUnread() {
		return this.notificationUnread;
	}

	public void setNotificationUnread(Integer notificationUnread) {
		this.notificationUnread = notificationUnread;
	}

	public Integer getInboxUnread() {
		return this.inboxUnread;
	}

	public void setInboxUnread(Integer inboxUnread) {
		this.inboxUnread = inboxUnread;
	}

	public Boolean getInboxRecv() {
		return this.inboxRecv;
	}

	public void setInboxRecv(Boolean inboxRecv) {
		this.inboxRecv = inboxRecv;
	}

	public Integer getFansCount() {
		return this.fansCount;
	}

	public void setFansCount(Integer fansCount) {
		this.fansCount = fansCount;
	}

	public Integer getFriendCount() {
		return this.friendCount;
	}

	public void setFriendCount(Integer friendCount) {
		this.friendCount = friendCount;
	}

	public Integer getInviteCount() {
		return this.inviteCount;
	}

	public void setInviteCount(Integer inviteCount) {
		this.inviteCount = inviteCount;
	}

	public Integer getArticleCount() {
		return this.articleCount;
	}

	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}

	public Integer getQuestionCount() {
		return this.questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	public Integer getAnswerCount() {
		return this.answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public Integer getTopicFocusCount() {
		return this.topicFocusCount;
	}

	public void setTopicFocusCount(Integer topicFocusCount) {
		this.topicFocusCount = topicFocusCount;
	}

	public Integer getInvitationAvailable() {
		return this.invitationAvailable;
	}

	public void setInvitationAvailable(Integer invitationAvailable) {
		this.invitationAvailable = invitationAvailable;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getReputationGroup() {
		return this.reputationGroup;
	}

	public void setReputationGroup(Integer reputationGroup) {
		this.reputationGroup = reputationGroup;
	}

	public Boolean getForbidden() {
		return this.forbidden;
	}

	public void setForbidden(Boolean forbidden) {
		this.forbidden = forbidden;
	}

	public Boolean getValidEmail() {
		return this.validEmail;
	}

	public void setValidEmail(Boolean validEmail) {
		this.validEmail = validEmail;
	}

	public Boolean getIsFirstLogin() {
		return this.isFirstLogin;
	}

	public void setIsFirstLogin(Boolean isFirstLogin) {
		this.isFirstLogin = isFirstLogin;
	}

	public Integer getAgreeCount() {
		return this.agreeCount;
	}

	public void setAgreeCount(Integer agreeCount) {
		this.agreeCount = agreeCount;
	}

	public Integer getThanksCount() {
		return this.thanksCount;
	}

	public void setThanksCount(Integer thanksCount) {
		this.thanksCount = thanksCount;
	}

	public Integer getViewsCount() {
		return this.viewsCount;
	}

	public void setViewsCount(Integer viewsCount) {
		this.viewsCount = viewsCount;
	}

	public Integer getReputation() {
		return this.reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Integer getReputationUpdateTime() {
		return this.reputationUpdateTime;
	}

	public void setReputationUpdateTime(Integer reputationUpdateTime) {
		this.reputationUpdateTime = reputationUpdateTime;
	}

	public Boolean getWeiboVisit() {
		return this.weiboVisit;
	}

	public void setWeiboVisit(Boolean weiboVisit) {
		this.weiboVisit = weiboVisit;
	}

	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getDraftCount() {
		return this.draftCount;
	}

	public void setDraftCount(Integer draftCount) {
		this.draftCount = draftCount;
	}

	public String getCommonEmail() {
		return this.commonEmail;
	}

	public void setCommonEmail(String commonEmail) {
		this.commonEmail = commonEmail;
	}

	public String getUrlToken() {
		return this.urlToken;
	}

	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}

	public Integer getUrlTokenUpdate() {
		return this.urlTokenUpdate;
	}

	public void setUrlTokenUpdate(Integer urlTokenUpdate) {
		this.urlTokenUpdate = urlTokenUpdate;
	}

	public String getVerified() {
		return this.verified;
	}

	public void setVerified(String verified) {
		this.verified = verified;
	}

	public String getDefaultTimezone() {
		return this.defaultTimezone;
	}

	public void setDefaultTimezone(String defaultTimezone) {
		this.defaultTimezone = defaultTimezone;
	}

	public String getEmailSettings() {
		return this.emailSettings;
	}

	public void setEmailSettings(String emailSettings) {
		this.emailSettings = emailSettings;
	}

	public String getWeixinSettings() {
		return this.weixinSettings;
	}

	public void setWeixinSettings(String weixinSettings) {
		this.weixinSettings = weixinSettings;
	}

	public String getRecentTopics() {
		return this.recentTopics;
	}

	public void setRecentTopics(String recentTopics) {
		this.recentTopics = recentTopics;
	}

}