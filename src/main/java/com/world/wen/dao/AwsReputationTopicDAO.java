package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsReputationTopic;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsReputationTopic entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsReputationTopic
 * @author MyEclipse Persistence Tools
 */
public class AwsReputationTopicDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsReputationTopicDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String TOPIC_ID = "topicId";
	public static final String TOPIC_COUNT = "topicCount";
	public static final String UPDATE_TIME = "updateTime";
	public static final String AGREE_COUNT = "agreeCount";
	public static final String THANKS_COUNT = "thanksCount";
	public static final String REPUTATION = "reputation";

	public void save(AwsReputationTopic transientInstance) {
		log.debug("saving AwsReputationTopic instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsReputationTopic persistentInstance) {
		log.debug("deleting AwsReputationTopic instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsReputationTopic findById(java.lang.Integer id) {
		log.debug("getting AwsReputationTopic instance with id: " + id);
		try {
			AwsReputationTopic instance = (AwsReputationTopic) getSession()
					.get("com.world.wen.AwsReputationTopic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsReputationTopic instance) {
		log.debug("finding AwsReputationTopic instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsReputationTopic")
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
		log.debug("finding AwsReputationTopic instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsReputationTopic as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByTopicId(Object topicId) {
		return findByProperty(TOPIC_ID, topicId);
	}

	public List findByTopicCount(Object topicCount) {
		return findByProperty(TOPIC_COUNT, topicCount);
	}

	public List findByUpdateTime(Object updateTime) {
		return findByProperty(UPDATE_TIME, updateTime);
	}

	public List findByAgreeCount(Object agreeCount) {
		return findByProperty(AGREE_COUNT, agreeCount);
	}

	public List findByThanksCount(Object thanksCount) {
		return findByProperty(THANKS_COUNT, thanksCount);
	}

	public List findByReputation(Object reputation) {
		return findByProperty(REPUTATION, reputation);
	}

	public List findAll() {
		log.debug("finding all AwsReputationTopic instances");
		try {
			String queryString = "from AwsReputationTopic";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsReputationTopic merge(AwsReputationTopic detachedInstance) {
		log.debug("merging AwsReputationTopic instance");
		try {
			AwsReputationTopic result = (AwsReputationTopic) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsReputationTopic instance) {
		log.debug("attaching dirty AwsReputationTopic instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsReputationTopic instance) {
		log.debug("attaching clean AwsReputationTopic instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}