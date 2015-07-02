package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsEdmTask;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsEdmTask entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsEdmTask
 * @author MyEclipse Persistence Tools
 */
public class AwsEdmTaskDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsEdmTaskDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String MESSAGE = "message";
	public static final String SUBJECT = "subject";
	public static final String FROM_NAME = "fromName";
	public static final String TIME = "time";

	public void save(AwsEdmTask transientInstance) {
		log.debug("saving AwsEdmTask instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsEdmTask persistentInstance) {
		log.debug("deleting AwsEdmTask instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsEdmTask findById(java.lang.Integer id) {
		log.debug("getting AwsEdmTask instance with id: " + id);
		try {
			AwsEdmTask instance = (AwsEdmTask) getSession().get(
					"com.world.wen.AwsEdmTask", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsEdmTask instance) {
		log.debug("finding AwsEdmTask instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsEdmTask")
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
		log.debug("finding AwsEdmTask instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsEdmTask as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findBySubject(Object subject) {
		return findByProperty(SUBJECT, subject);
	}

	public List findByFromName(Object fromName) {
		return findByProperty(FROM_NAME, fromName);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsEdmTask instances");
		try {
			String queryString = "from AwsEdmTask";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsEdmTask merge(AwsEdmTask detachedInstance) {
		log.debug("merging AwsEdmTask instance");
		try {
			AwsEdmTask result = (AwsEdmTask) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsEdmTask instance) {
		log.debug("attaching dirty AwsEdmTask instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsEdmTask instance) {
		log.debug("attaching clean AwsEdmTask instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}