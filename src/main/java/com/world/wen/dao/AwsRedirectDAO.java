package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsRedirect;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsRedirect entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsRedirect
 * @author MyEclipse Persistence Tools
 */
public class AwsRedirectDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsRedirectDAO.class);
	// property constants
	public static final String ITEM_ID = "itemId";
	public static final String TARGET_ID = "targetId";
	public static final String TIME = "time";
	public static final String UID = "uid";

	public void save(AwsRedirect transientInstance) {
		log.debug("saving AwsRedirect instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsRedirect persistentInstance) {
		log.debug("deleting AwsRedirect instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsRedirect findById(java.lang.Integer id) {
		log.debug("getting AwsRedirect instance with id: " + id);
		try {
			AwsRedirect instance = (AwsRedirect) getSession().get(
					"com.world.wen.AwsRedirect", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsRedirect instance) {
		log.debug("finding AwsRedirect instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsRedirect")
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
		log.debug("finding AwsRedirect instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AwsRedirect as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByItemId(Object itemId) {
		return findByProperty(ITEM_ID, itemId);
	}

	public List findByTargetId(Object targetId) {
		return findByProperty(TARGET_ID, targetId);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findAll() {
		log.debug("finding all AwsRedirect instances");
		try {
			String queryString = "from AwsRedirect";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsRedirect merge(AwsRedirect detachedInstance) {
		log.debug("merging AwsRedirect instance");
		try {
			AwsRedirect result = (AwsRedirect) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsRedirect instance) {
		log.debug("attaching dirty AwsRedirect instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsRedirect instance) {
		log.debug("attaching clean AwsRedirect instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}