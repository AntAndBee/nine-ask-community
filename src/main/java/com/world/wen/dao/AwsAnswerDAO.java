package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsAnswer;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsAnswer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsAnswer
 * @author MyEclipse Persistence Tools
 */
public class AwsAnswerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsAnswerDAO.class);
	// property constants
	public static final String QUESTION_ID = "questionId";
	public static final String ANSWER_CONTENT = "answerContent";
	public static final String ADD_TIME = "addTime";
	public static final String AGAINST_COUNT = "againstCount";
	public static final String AGREE_COUNT = "agreeCount";
	public static final String UID = "uid";
	public static final String COMMENT_COUNT = "commentCount";
	public static final String UNINTERESTED_COUNT = "uninterestedCount";
	public static final String THANKS_COUNT = "thanksCount";
	public static final String CATEGORY_ID = "categoryId";
	public static final String HAS_ATTACH = "hasAttach";
	public static final String IP = "ip";
	public static final String FORCE_FOLD = "forceFold";
	public static final String ANONYMOUS = "anonymous";
	public static final String PUBLISH_SOURCE = "publishSource";

	public void save(AwsAnswer transientInstance) {
		log.debug("saving AwsAnswer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsAnswer persistentInstance) {
		log.debug("deleting AwsAnswer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsAnswer findById(java.lang.Integer id) {
		log.debug("getting AwsAnswer instance with id: " + id);
		try {
			AwsAnswer instance = (AwsAnswer) getSession().get(
					"com.world.wen.AwsAnswer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsAnswer instance) {
		log.debug("finding AwsAnswer instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsAnswer")
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
		log.debug("finding AwsAnswer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsAnswer as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestionId(Object questionId) {
		return findByProperty(QUESTION_ID, questionId);
	}

	public List findByAnswerContent(Object answerContent) {
		return findByProperty(ANSWER_CONTENT, answerContent);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAgainstCount(Object againstCount) {
		return findByProperty(AGAINST_COUNT, againstCount);
	}

	public List findByAgreeCount(Object agreeCount) {
		return findByProperty(AGREE_COUNT, agreeCount);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByCommentCount(Object commentCount) {
		return findByProperty(COMMENT_COUNT, commentCount);
	}

	public List findByUninterestedCount(Object uninterestedCount) {
		return findByProperty(UNINTERESTED_COUNT, uninterestedCount);
	}

	public List findByThanksCount(Object thanksCount) {
		return findByProperty(THANKS_COUNT, thanksCount);
	}

	public List findByCategoryId(Object categoryId) {
		return findByProperty(CATEGORY_ID, categoryId);
	}

	public List findByHasAttach(Object hasAttach) {
		return findByProperty(HAS_ATTACH, hasAttach);
	}

	public List findByIp(Object ip) {
		return findByProperty(IP, ip);
	}

	public List findByForceFold(Object forceFold) {
		return findByProperty(FORCE_FOLD, forceFold);
	}

	public List findByAnonymous(Object anonymous) {
		return findByProperty(ANONYMOUS, anonymous);
	}

	public List findByPublishSource(Object publishSource) {
		return findByProperty(PUBLISH_SOURCE, publishSource);
	}

	public List findAll() {
		log.debug("finding all AwsAnswer instances");
		try {
			String queryString = "from AwsAnswer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsAnswer merge(AwsAnswer detachedInstance) {
		log.debug("merging AwsAnswer instance");
		try {
			AwsAnswer result = (AwsAnswer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsAnswer instance) {
		log.debug("attaching dirty AwsAnswer instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsAnswer instance) {
		log.debug("attaching clean AwsAnswer instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}