package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsTopicFocus;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsTopicFocus entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsTopicFocus
 * @author MyEclipse Persistence Tools
 */
public class AwsTopicFocusDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsTopicFocusDAO.class);
	// property constants
	public static final String TOPIC_ID = "topicId";
	public static final String UID = "uid";
	public static final String ADD_TIME = "addTime";

	public void save(AwsTopicFocus transientInstance) {
		log.debug("saving AwsTopicFocus instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsTopicFocus persistentInstance) {
		log.debug("deleting AwsTopicFocus instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsTopicFocus findById(java.lang.Integer id) {
		log.debug("getting AwsTopicFocus instance with id: " + id);
		try {
			AwsTopicFocus instance = (AwsTopicFocus) getSession().get(
					"com.world.wen.AwsTopicFocus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsTopicFocus instance) {
		log.debug("finding AwsTopicFocus instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsTopicFocus")
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
		log.debug("finding AwsTopicFocus instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsTopicFocus as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTopicId(Object topicId) {
		return findByProperty(TOPIC_ID, topicId);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsTopicFocus instances");
		try {
			String queryString = "from AwsTopicFocus";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsTopicFocus merge(AwsTopicFocus detachedInstance) {
		log.debug("merging AwsTopicFocus instance");
		try {
			AwsTopicFocus result = (AwsTopicFocus) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsTopicFocus instance) {
		log.debug("attaching dirty AwsTopicFocus instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsTopicFocus instance) {
		log.debug("attaching clean AwsTopicFocus instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}