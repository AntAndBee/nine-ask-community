package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsers;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsers entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsers
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersDAO.class);
	// property constants
	public static final String USER_NAME = "userName";
	public static final String EMAIL = "email";
	public static final String MOBILE = "mobile";
	public static final String PASSWORD = "password";
	public static final String SALT = "salt";
	public static final String AVATAR_FILE = "avatarFile";
	public static final String SEX = "sex";
	public static final String BIRTHDAY = "birthday";
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String JOB_ID = "jobId";
	public static final String REG_TIME = "regTime";
	public static final String REG_IP = "regIp";
	public static final String LAST_LOGIN = "lastLogin";
	public static final String LAST_IP = "lastIp";
	public static final String ONLINE_TIME = "onlineTime";
	public static final String LAST_ACTIVE = "lastActive";
	public static final String NOTIFICATION_UNREAD = "notificationUnread";
	public static final String INBOX_UNREAD = "inboxUnread";
	public static final String INBOX_RECV = "inboxRecv";
	public static final String FANS_COUNT = "fansCount";
	public static final String FRIEND_COUNT = "friendCount";
	public static final String INVITE_COUNT = "inviteCount";
	public static final String ARTICLE_COUNT = "articleCount";
	public static final String QUESTION_COUNT = "questionCount";
	public static final String ANSWER_COUNT = "answerCount";
	public static final String TOPIC_FOCUS_COUNT = "topicFocusCount";
	public static final String INVITATION_AVAILABLE = "invitationAvailable";
	public static final String GROUP_ID = "groupId";
	public static final String REPUTATION_GROUP = "reputationGroup";
	public static final String FORBIDDEN = "forbidden";
	public static final String VALID_EMAIL = "validEmail";
	public static final String IS_FIRST_LOGIN = "isFirstLogin";
	public static final String AGREE_COUNT = "agreeCount";
	public static final String THANKS_COUNT = "thanksCount";
	public static final String VIEWS_COUNT = "viewsCount";
	public static final String REPUTATION = "reputation";
	public static final String REPUTATION_UPDATE_TIME = "reputationUpdateTime";
	public static final String WEIBO_VISIT = "weiboVisit";
	public static final String INTEGRAL = "integral";
	public static final String DRAFT_COUNT = "draftCount";
	public static final String COMMON_EMAIL = "commonEmail";
	public static final String URL_TOKEN = "urlToken";
	public static final String URL_TOKEN_UPDATE = "urlTokenUpdate";
	public static final String VERIFIED = "verified";
	public static final String DEFAULT_TIMEZONE = "defaultTimezone";
	public static final String EMAIL_SETTINGS = "emailSettings";
	public static final String WEIXIN_SETTINGS = "weixinSettings";
	public static final String RECENT_TOPICS = "recentTopics";

	public void save(AwsUsers transientInstance) {
		log.debug("saving AwsUsers instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsers persistentInstance) {
		log.debug("deleting AwsUsers instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsers findById(java.lang.Integer id) {
		log.debug("getting AwsUsers instance with id: " + id);
		try {
			AwsUsers instance = (AwsUsers) getSession().get(
					"com.world.wen.AwsUsers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsers instance) {
		log.debug("finding AwsUsers instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsers")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AwsUsers instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsUsers as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByMobile(Object mobile) {
		return findByProperty(MOBILE, mobile);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findBySalt(Object salt) {
		return findByProperty(SALT, salt);
	}

	public List findByAvatarFile(Object avatarFile) {
		return findByProperty(AVATAR_FILE, avatarFile);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByBirthday(Object birthday) {
		return findByProperty(BIRTHDAY, birthday);
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByJobId(Object jobId) {
		return findByProperty(JOB_ID, jobId);
	}

	public List findByRegTime(Object regTime) {
		return findByProperty(REG_TIME, regTime);
	}

	public List findByRegIp(Object regIp) {
		return findByProperty(REG_IP, regIp);
	}

	public List findByLastLogin(Object lastLogin) {
		return findByProperty(LAST_LOGIN, lastLogin);
	}

	public List findByLastIp(Object lastIp) {
		return findByProperty(LAST_IP, lastIp);
	}

	public List findByOnlineTime(Object onlineTime) {
		return findByProperty(ONLINE_TIME, onlineTime);
	}

	public List findByLastActive(Object lastActive) {
		return findByProperty(LAST_ACTIVE, lastActive);
	}

	public List findByNotificationUnread(Object notificationUnread) {
		return findByProperty(NOTIFICATION_UNREAD, notificationUnread);
	}

	public List findByInboxUnread(Object inboxUnread) {
		return findByProperty(INBOX_UNREAD, inboxUnread);
	}

	public List findByInboxRecv(Object inboxRecv) {
		return findByProperty(INBOX_RECV, inboxRecv);
	}

	public List findByFansCount(Object fansCount) {
		return findByProperty(FANS_COUNT, fansCount);
	}

	public List findByFriendCount(Object friendCount) {
		return findByProperty(FRIEND_COUNT, friendCount);
	}

	public List findByInviteCount(Object inviteCount) {
		return findByProperty(INVITE_COUNT, inviteCount);
	}

	public List findByArticleCount(Object articleCount) {
		return findByProperty(ARTICLE_COUNT, articleCount);
	}

	public List findByQuestionCount(Object questionCount) {
		return findByProperty(QUESTION_COUNT, questionCount);
	}

	public List findByAnswerCount(Object answerCount) {
		return findByProperty(ANSWER_COUNT, answerCount);
	}

	public List findByTopicFocusCount(Object topicFocusCount) {
		return findByProperty(TOPIC_FOCUS_COUNT, topicFocusCount);
	}

	public List findByInvitationAvailable(Object invitationAvailable) {
		return findByProperty(INVITATION_AVAILABLE, invitationAvailable);
	}

	public List findByGroupId(Object groupId) {
		return findByProperty(GROUP_ID, groupId);
	}

	public List findByReputationGroup(Object reputationGroup) {
		return findByProperty(REPUTATION_GROUP, reputationGroup);
	}

	public List findByForbidden(Object forbidden) {
		return findByProperty(FORBIDDEN, forbidden);
	}

	public List findByValidEmail(Object validEmail) {
		return findByProperty(VALID_EMAIL, validEmail);
	}

	public List findByIsFirstLogin(Object isFirstLogin) {
		return findByProperty(IS_FIRST_LOGIN, isFirstLogin);
	}

	public List findByAgreeCount(Object agreeCount) {
		return findByProperty(AGREE_COUNT, agreeCount);
	}

	public List findByThanksCount(Object thanksCount) {
		return findByProperty(THANKS_COUNT, thanksCount);
	}

	public List findByViewsCount(Object viewsCount) {
		return findByProperty(VIEWS_COUNT, viewsCount);
	}

	public List findByReputation(Object reputation) {
		return findByProperty(REPUTATION, reputation);
	}

	public List findByReputationUpdateTime(Object reputationUpdateTime) {
		return findByProperty(REPUTATION_UPDATE_TIME, reputationUpdateTime);
	}

	public List findByWeiboVisit(Object weiboVisit) {
		return findByProperty(WEIBO_VISIT, weiboVisit);
	}

	public List findByIntegral(Object integral) {
		return findByProperty(INTEGRAL, integral);
	}

	public List findByDraftCount(Object draftCount) {
		return findByProperty(DRAFT_COUNT, draftCount);
	}

	public List findByCommonEmail(Object commonEmail) {
		return findByProperty(COMMON_EMAIL, commonEmail);
	}

	public List findByUrlToken(Object urlToken) {
		return findByProperty(URL_TOKEN, urlToken);
	}

	public List findByUrlTokenUpdate(Object urlTokenUpdate) {
		return findByProperty(URL_TOKEN_UPDATE, urlTokenUpdate);
	}

	public List findByVerified(Object verified) {
		return findByProperty(VERIFIED, verified);
	}

	public List findByDefaultTimezone(Object defaultTimezone) {
		return findByProperty(DEFAULT_TIMEZONE, defaultTimezone);
	}

	public List findByEmailSettings(Object emailSettings) {
		return findByProperty(EMAIL_SETTINGS, emailSettings);
	}

	public List findByWeixinSettings(Object weixinSettings) {
		return findByProperty(WEIXIN_SETTINGS, weixinSettings);
	}

	public List findByRecentTopics(Object recentTopics) {
		return findByProperty(RECENT_TOPICS, recentTopics);
	}

	public List findAll() {
		log.debug("finding all AwsUsers instances");
		try {
			String queryString = "from AwsUsers";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsers merge(AwsUsers detachedInstance) {
		log.debug("merging AwsUsers instance");
		try {
			AwsUsers result = (AwsUsers) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsers instance) {
		log.debug("attaching dirty AwsUsers instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsers instance) {
		log.debug("attaching clean AwsUsers instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}