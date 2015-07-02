package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersUcenter;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersUcenter entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersUcenter
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersUcenterDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersUcenterDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String UC_UID = "ucUid";
	public static final String USERNAME = "username";
	public static final String EMAIL = "email";

	public void save(AwsUsersUcenter transientInstance) {
		log.debug("saving AwsUsersUcenter instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersUcenter persistentInstance) {
		log.debug("deleting AwsUsersUcenter instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersUcenter findById(java.lang.Integer id) {
		log.debug("getting AwsUsersUcenter instance with id: " + id);
		try {
			AwsUsersUcenter instance = (AwsUsersUcenter) getSession().get(
					"com.world.wen.AwsUsersUcenter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersUcenter instance) {
		log.debug("finding AwsUsersUcenter instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersUcenter")
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
		log.debug("finding AwsUsersUcenter instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersUcenter as model where model."
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

	public List findByUcUid(Object ucUid) {
		return findByProperty(UC_UID, ucUid);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findAll() {
		log.debug("finding all AwsUsersUcenter instances");
		try {
			String queryString = "from AwsUsersUcenter";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersUcenter merge(AwsUsersUcenter detachedInstance) {
		log.debug("merging AwsUsersUcenter instance");
		try {
			AwsUsersUcenter result = (AwsUsersUcenter) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersUcenter instance) {
		log.debug("attaching dirty AwsUsersUcenter instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersUcenter instance) {
		log.debug("attaching clean AwsUsersUcenter instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}