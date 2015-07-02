package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsVerifyApply;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsVerifyApply entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsVerifyApply
 * @author MyEclipse Persistence Tools
 */
public class AwsVerifyApplyDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsVerifyApplyDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String REASON = "reason";
	public static final String ATTACH = "attach";
	public static final String TIME = "time";
	public static final String NAME = "name";
	public static final String DATA = "data";
	public static final String STATUS = "status";
	public static final String TYPE = "type";

	public void save(AwsVerifyApply transientInstance) {
		log.debug("saving AwsVerifyApply instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsVerifyApply persistentInstance) {
		log.debug("deleting AwsVerifyApply instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsVerifyApply findById(java.lang.Integer id) {
		log.debug("getting AwsVerifyApply instance with id: " + id);
		try {
			AwsVerifyApply instance = (AwsVerifyApply) getSession().get(
					"com.world.wen.AwsVerifyApply", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsVerifyApply instance) {
		log.debug("finding AwsVerifyApply instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsVerifyApply")
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
		log.debug("finding AwsVerifyApply instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsVerifyApply as model where model."
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

	public List findByReason(Object reason) {
		return findByProperty(REASON, reason);
	}

	public List findByAttach(Object attach) {
		return findByProperty(ATTACH, attach);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByData(Object data) {
		return findByProperty(DATA, data);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findAll() {
		log.debug("finding all AwsVerifyApply instances");
		try {
			String queryString = "from AwsVerifyApply";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsVerifyApply merge(AwsVerifyApply detachedInstance) {
		log.debug("merging AwsVerifyApply instance");
		try {
			AwsVerifyApply result = (AwsVerifyApply) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsVerifyApply instance) {
		log.debug("attaching dirty AwsVerifyApply instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsVerifyApply instance) {
		log.debug("attaching clean AwsVerifyApply instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}