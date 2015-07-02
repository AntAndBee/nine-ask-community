package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsFeatureTopic;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsFeatureTopic entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsFeatureTopic
 * @author MyEclipse Persistence Tools
 */
public class AwsFeatureTopicDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsFeatureTopicDAO.class);
	// property constants
	public static final String FEATURE_ID = "featureId";
	public static final String TOPIC_ID = "topicId";

	public void save(AwsFeatureTopic transientInstance) {
		log.debug("saving AwsFeatureTopic instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsFeatureTopic persistentInstance) {
		log.debug("deleting AwsFeatureTopic instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsFeatureTopic findById(java.lang.Integer id) {
		log.debug("getting AwsFeatureTopic instance with id: " + id);
		try {
			AwsFeatureTopic instance = (AwsFeatureTopic) getSession().get(
					"com.world.wen.AwsFeatureTopic", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsFeatureTopic instance) {
		log.debug("finding AwsFeatureTopic instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsFeatureTopic")
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
		log.debug("finding AwsFeatureTopic instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsFeatureTopic as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFeatureId(Object featureId) {
		return findByProperty(FEATURE_ID, featureId);
	}

	public List findByTopicId(Object topicId) {
		return findByProperty(TOPIC_ID, topicId);
	}

	public List findAll() {
		log.debug("finding all AwsFeatureTopic instances");
		try {
			String queryString = "from AwsFeatureTopic";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsFeatureTopic merge(AwsFeatureTopic detachedInstance) {
		log.debug("merging AwsFeatureTopic instance");
		try {
			AwsFeatureTopic result = (AwsFeatureTopic) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsFeatureTopic instance) {
		log.debug("attaching dirty AwsFeatureTopic instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsFeatureTopic instance) {
		log.debug("attaching clean AwsFeatureTopic instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}