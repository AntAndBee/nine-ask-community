package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsEdmUserdata;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsEdmUserdata entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsEdmUserdata
 * @author MyEclipse Persistence Tools
 */
public class AwsEdmUserdataDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsEdmUserdataDAO.class);
	// property constants
	public static final String USERGROUP = "usergroup";
	public static final String EMAIL = "email";

	public void save(AwsEdmUserdata transientInstance) {
		log.debug("saving AwsEdmUserdata instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsEdmUserdata persistentInstance) {
		log.debug("deleting AwsEdmUserdata instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsEdmUserdata findById(java.lang.Integer id) {
		log.debug("getting AwsEdmUserdata instance with id: " + id);
		try {
			AwsEdmUserdata instance = (AwsEdmUserdata) getSession().get(
					"com.world.wen.AwsEdmUserdata", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsEdmUserdata instance) {
		log.debug("finding AwsEdmUserdata instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsEdmUserdata")
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
		log.debug("finding AwsEdmUserdata instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsEdmUserdata as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsergroup(Object usergroup) {
		return findByProperty(USERGROUP, usergroup);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findAll() {
		log.debug("finding all AwsEdmUserdata instances");
		try {
			String queryString = "from AwsEdmUserdata";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsEdmUserdata merge(AwsEdmUserdata detachedInstance) {
		log.debug("merging AwsEdmUserdata instance");
		try {
			AwsEdmUserdata result = (AwsEdmUserdata) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsEdmUserdata instance) {
		log.debug("attaching dirty AwsEdmUserdata instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsEdmUserdata instance) {
		log.debug("attaching clean AwsEdmUserdata instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}