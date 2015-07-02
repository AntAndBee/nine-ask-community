package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsEdmTaskdata;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsEdmTaskdata entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsEdmTaskdata
 * @author MyEclipse Persistence Tools
 */
public class AwsEdmTaskdataDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsEdmTaskdataDAO.class);
	// property constants
	public static final String TASKID = "taskid";
	public static final String EMAIL = "email";
	public static final String SENT_TIME = "sentTime";
	public static final String VIEW_TIME = "viewTime";

	public void save(AwsEdmTaskdata transientInstance) {
		log.debug("saving AwsEdmTaskdata instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsEdmTaskdata persistentInstance) {
		log.debug("deleting AwsEdmTaskdata instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsEdmTaskdata findById(java.lang.Integer id) {
		log.debug("getting AwsEdmTaskdata instance with id: " + id);
		try {
			AwsEdmTaskdata instance = (AwsEdmTaskdata) getSession().get(
					"com.world.wen.AwsEdmTaskdata", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsEdmTaskdata instance) {
		log.debug("finding AwsEdmTaskdata instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsEdmTaskdata")
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
		log.debug("finding AwsEdmTaskdata instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsEdmTaskdata as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTaskid(Object taskid) {
		return findByProperty(TASKID, taskid);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findBySentTime(Object sentTime) {
		return findByProperty(SENT_TIME, sentTime);
	}

	public List findByViewTime(Object viewTime) {
		return findByProperty(VIEW_TIME, viewTime);
	}

	public List findAll() {
		log.debug("finding all AwsEdmTaskdata instances");
		try {
			String queryString = "from AwsEdmTaskdata";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsEdmTaskdata merge(AwsEdmTaskdata detachedInstance) {
		log.debug("merging AwsEdmTaskdata instance");
		try {
			AwsEdmTaskdata result = (AwsEdmTaskdata) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsEdmTaskdata instance) {
		log.debug("attaching dirty AwsEdmTaskdata instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsEdmTaskdata instance) {
		log.debug("attaching clean AwsEdmTaskdata instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}