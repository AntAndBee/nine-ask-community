package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsQuestion;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsQuestion entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsQuestion
 * @author MyEclipse Persistence Tools
 */
public class AwsQuestionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsQuestionDAO.class);
	// property constants
	public static final String QUESTION_CONTENT = "questionContent";
	public static final String QUESTION_DETAIL = "questionDetail";
	public static final String ADD_TIME = "addTime";
	public static final String UPDATE_TIME = "updateTime";
	public static final String PUBLISHED_UID = "publishedUid";
	public static final String ANSWER_COUNT = "answerCount";
	public static final String ANSWER_USERS = "answerUsers";
	public static final String VIEW_COUNT = "viewCount";
	public static final String FOCUS_COUNT = "focusCount";
	public static final String COMMENT_COUNT = "commentCount";
	public static final String ACTION_HISTORY_ID = "actionHistoryId";
	public static final String CATEGORY_ID = "categoryId";
	public static final String AGREE_COUNT = "agreeCount";
	public static final String AGAINST_COUNT = "againstCount";
	public static final String BEST_ANSWER = "bestAnswer";
	public static final String HAS_ATTACH = "hasAttach";
	public static final String UNVERIFIED_MODIFY = "unverifiedModify";
	public static final String UNVERIFIED_MODIFY_COUNT = "unverifiedModifyCount";
	public static final String IP = "ip";
	public static final String LAST_ANSWER = "lastAnswer";
	public static final String POPULAR_VALUE = "popularValue";
	public static final String POPULAR_VALUE_UPDATE = "popularValueUpdate";
	public static final String LOCK = "lock";
	public static final String ANONYMOUS = "anonymous";
	public static final String THANKS_COUNT = "thanksCount";
	public static final String QUESTION_CONTENT_FULLTEXT = "questionContentFulltext";
	public static final String IS_RECOMMEND = "isRecommend";
	public static final String WEIBO_MSG_ID = "weiboMsgId";
	public static final String RECEIVED_EMAIL_ID = "receivedEmailId";
	public static final String CHAPTER_ID = "chapterId";
	public static final String SORT = "sort";

	public void save(AwsQuestion transientInstance) {
		log.debug("saving AwsQuestion instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsQuestion persistentInstance) {
		log.debug("deleting AwsQuestion instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsQuestion findById(java.lang.Integer id) {
		log.debug("getting AwsQuestion instance with id: " + id);
		try {
			AwsQuestion instance = (AwsQuestion) getSession().get(
					"com.world.wen.AwsQuestion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsQuestion instance) {
		log.debug("finding AwsQuestion instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsQuestion")
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
		log.debug("finding AwsQuestion instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsQuestion as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestionContent(Object questionContent) {
		return findByProperty(QUESTION_CONTENT, questionContent);
	}

	public List findByQuestionDetail(Object questionDetail) {
		return findByProperty(QUESTION_DETAIL, questionDetail);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByUpdateTime(Object updateTime) {
		return findByProperty(UPDATE_TIME, updateTime);
	}

	public List findByPublishedUid(Object publishedUid) {
		return findByProperty(PUBLISHED_UID, publishedUid);
	}

	public List findByAnswerCount(Object answerCount) {
		return findByProperty(ANSWER_COUNT, answerCount);
	}

	public List findByAnswerUsers(Object answerUsers) {
		return findByProperty(ANSWER_USERS, answerUsers);
	}

	public List findByViewCount(Object viewCount) {
		return findByProperty(VIEW_COUNT, viewCount);
	}

	public List findByFocusCount(Object focusCount) {
		return findByProperty(FOCUS_COUNT, focusCount);
	}

	public List findByCommentCount(Object commentCount) {
		return findByProperty(COMMENT_COUNT, commentCount);
	}

	public List findByActionHistoryId(Object actionHistoryId) {
		return findByProperty(ACTION_HISTORY_ID, actionHistoryId);
	}

	public List findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List findByAgreeCount(Object agreeCount) {
		return findByProperty(AGREE_COUNT, agreeCount);
	}

	public List findByAgainstCount(Object againstCount) {
		return findByProperty(AGAINST_COUNT, againstCount);
	}

	public List findByBestAnswer(Object bestAnswer) {
		return findByProperty(BEST_ANSWER, bestAnswer);
	}

	public List findByHasAttach(Object hasAttach) {
		return findByProperty(HAS_ATTACH, hasAttach);
	}

	public List findByUnverifiedModify(Object unverifiedModify) {
		return findByProperty(UNVERIFIED_MODIFY, unverifiedModify);
	}

	public List findByUnverifiedModifyCount(Object unverifiedModifyCount) {
		return findByProperty(UNVERIFIED_MODIFY_COUNT, unverifiedModifyCount);
	}

	public List findByIp(Object ip) {
		return findByProperty(IP, ip);
	}

	public List findByLastAnswer(Object lastAnswer) {
		return findByProperty(LAST_ANSWER, lastAnswer);
	}

	public List findByPopularValue(Object popularValue) {
		return findByProperty(POPULAR_VALUE, popularValue);
	}

	public List findByPopularValueUpdate(Object popularValueUpdate) {
		return findByProperty(POPULAR_VALUE_UPDATE, popularValueUpdate);
	}

	public List findByLock(Object lock) {
		return findByProperty(LOCK, lock);
	}

	public List findByAnonymous(Object anonymous) {
		return findByProperty(ANONYMOUS, anonymous);
	}

	public List findByThanksCount(Object thanksCount) {
		return findByProperty(THANKS_COUNT, thanksCount);
	}

	public List findByQuestionContentFulltext(Object questionContentFulltext) {
		return findByProperty(QUESTION_CONTENT_FULLTEXT,
				questionContentFulltext);
	}

	public List findByIsRecommend(Object isRecommend) {
		return findByProperty(IS_RECOMMEND, isRecommend);
	}

	public List findByWeiboMsgId(Object weiboMsgId) {
		return findByProperty(WEIBO_MSG_ID, weiboMsgId);
	}

	public List findByReceivedEmailId(Object receivedEmailId) {
		return findByProperty(RECEIVED_EMAIL_ID, receivedEmailId);
	}

	public List findByChapterId(Object chapterId) {
		return findByProperty(CHAPTER_ID, chapterId);
	}

	public List findBySort(Object sort) {
		return findByProperty(SORT, sort);
	}

	public List findAll() {
		log.debug("finding all AwsQuestion instances");
		try {
			String queryString = "from AwsQuestion";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsQuestion merge(AwsQuestion detachedInstance) {
		log.debug("merging AwsQuestion instance");
		try {
			AwsQuestion result = (AwsQuestion) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsQuestion instance) {
		log.debug("attaching dirty AwsQuestion instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsQuestion instance) {
		log.debug("attaching clean AwsQuestion instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}