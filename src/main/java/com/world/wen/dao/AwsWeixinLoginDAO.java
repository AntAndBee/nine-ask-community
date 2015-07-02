package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinLogin;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinLogin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinLogin
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinLoginDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinLoginDAO.class);
	// property constants
	public static final String TOKEN = "token";
	public static final String UID = "uid";
	public static final String SESSION_ID = "sessionId";
	public static final String EXPIRE = "expire";

	public void save(AwsWeixinLogin transientInstance) {
		log.debug("saving AwsWeixinLogin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinLogin persistentInstance) {
		log.debug("deleting AwsWeixinLogin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinLogin findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinLogin instance with id: " + id);
		try {
			AwsWeixinLogin instance = (AwsWeixinLogin) getSession().get(
					"com.world.wen.AwsWeixinLogin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinLogin instance) {
		log.debug("finding AwsWeixinLogin instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinLogin")
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
		log.debug("finding AwsWeixinLogin instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinLogin as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByToken(Object token) {
		return findByProperty(TOKEN, token);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findBySessionId(Object sessionId) {
		return findByProperty(SESSION_ID, sessionId);
	}

	public List findByExpire(Object expire) {
		return findByProperty(EXPIRE, expire);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinLogin instances");
		try {
			String queryString = "from AwsWeixinLogin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinLogin merge(AwsWeixinLogin detachedInstance) {
		log.debug("merging AwsWeixinLogin instance");
		try {
			AwsWeixinLogin result = (AwsWeixinLogin) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinLogin instance) {
		log.debug("attaching dirty AwsWeixinLogin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinLogin instance) {
		log.debug("attaching clean AwsWeixinLogin instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}