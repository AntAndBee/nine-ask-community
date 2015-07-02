package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsEdmUsergroup;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsEdmUsergroup entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsEdmUsergroup
 * @author MyEclipse Persistence Tools
 */
public class AwsEdmUsergroupDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsEdmUsergroupDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String TIME = "time";

	public void save(AwsEdmUsergroup transientInstance) {
		log.debug("saving AwsEdmUsergroup instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsEdmUsergroup persistentInstance) {
		log.debug("deleting AwsEdmUsergroup instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsEdmUsergroup findById(java.lang.Integer id) {
		log.debug("getting AwsEdmUsergroup instance with id: " + id);
		try {
			AwsEdmUsergroup instance = (AwsEdmUsergroup) getSession().get(
					"com.world.wen.AwsEdmUsergroup", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsEdmUsergroup instance) {
		log.debug("finding AwsEdmUsergroup instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsEdmUsergroup")
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
		log.debug("finding AwsEdmUsergroup instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsEdmUsergroup as model where model."
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

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsEdmUsergroup instances");
		try {
			String queryString = "from AwsEdmUsergroup";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsEdmUsergroup merge(AwsEdmUsergroup detachedInstance) {
		log.debug("merging AwsEdmUsergroup instance");
		try {
			AwsEdmUsergroup result = (AwsEdmUsergroup) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsEdmUsergroup instance) {
		log.debug("attaching dirty AwsEdmUsergroup instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsEdmUsergroup instance) {
		log.debug("attaching clean AwsEdmUsergroup instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}