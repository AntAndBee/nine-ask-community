package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsRelatedTopic;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsRelatedTopic entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsRelatedTopic
 * @author MyEclipse Persistence Tools
 */
public class AwsRelatedTopicDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsRelatedTopicDAO.class);
	// property constants
	public static final String TOPIC_ID = "topicId";
	public static final String RELATED_ID = "relatedId";

	public void save(AwsRelatedTopic transientInstance) {
		log.debug("saving AwsRelatedTopic instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsRelatedTopic persistentInstance) {
		log.debug("deleting AwsRelatedTopic instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsRelatedTopic findById(java.lang.Integer id) {
		log.debug("getting AwsRelatedTopic instance with id: " + id);
		try {
			AwsRelatedTopic instance = (AwsRelatedTopic) getSession().get(
					"com.world.wen.AwsRelatedTopic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsRelatedTopic instance) {
		log.debug("finding AwsRelatedTopic instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsRelatedTopic")
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
		log.debug("finding AwsRelatedTopic instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsRelatedTopic as model where model."
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

	public List findByRelatedId(Object relatedId) {
		return findByProperty(RELATED_ID, relatedId);
	}

	public List findAll() {
		log.debug("finding all AwsRelatedTopic instances");
		try {
			String queryString = "from AwsRelatedTopic";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsRelatedTopic merge(AwsRelatedTopic detachedInstance) {
		log.debug("merging AwsRelatedTopic instance");
		try {
			AwsRelatedTopic result = (AwsRelatedTopic) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsRelatedTopic instance) {
		log.debug("attaching dirty AwsRelatedTopic instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsRelatedTopic instance) {
		log.debug("attaching clean AwsRelatedTopic instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}