package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsEdmUnsubscription;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsEdmUnsubscription entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsEdmUnsubscription
 * @author MyEclipse Persistence Tools
 */
public class AwsEdmUnsubscriptionDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsEdmUnsubscriptionDAO.class);
	// property constants
	public static final String EMAIL = "email";
	public static final String TIME = "time";

	public void save(AwsEdmUnsubscription transientInstance) {
		log.debug("saving AwsEdmUnsubscription instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsEdmUnsubscription persistentInstance) {
		log.debug("deleting AwsEdmUnsubscription instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsEdmUnsubscription findById(java.lang.Integer id) {
		log.debug("getting AwsEdmUnsubscription instance with id: " + id);
		try {
			AwsEdmUnsubscription instance = (AwsEdmUnsubscription) getSession()
					.get("com.world.wen.AwsEdmUnsubscription", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsEdmUnsubscription instance) {
		log.debug("finding AwsEdmUnsubscription instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsEdmUnsubscription")
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
		log.debug("finding AwsEdmUnsubscription instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsEdmUnsubscription as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsEdmUnsubscription instances");
		try {
			String queryString = "from AwsEdmUnsubscription";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsEdmUnsubscription merge(AwsEdmUnsubscription detachedInstance) {
		log.debug("merging AwsEdmUnsubscription instance");
		try {
			AwsEdmUnsubscription result = (AwsEdmUnsubscription) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsEdmUnsubscription instance) {
		log.debug("attaching dirty AwsEdmUnsubscription instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsEdmUnsubscription instance) {
		log.debug("attaching clean AwsEdmUnsubscription instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}