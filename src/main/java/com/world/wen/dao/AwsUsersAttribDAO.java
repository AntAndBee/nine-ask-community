package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUsersAttrib;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUsersAttrib entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUsersAttrib
 * @author MyEclipse Persistence Tools
 */
public class AwsUsersAttribDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUsersAttribDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String INTRODUCTION = "introduction";
	public static final String SIGNATURE = "signature";
	public static final String QQ = "qq";
	public static final String HOMEPAGE = "homepage";

	public void save(AwsUsersAttrib transientInstance) {
		log.debug("saving AwsUsersAttrib instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUsersAttrib persistentInstance) {
		log.debug("deleting AwsUsersAttrib instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUsersAttrib findById(java.lang.Integer id) {
		log.debug("getting AwsUsersAttrib instance with id: " + id);
		try {
			AwsUsersAttrib instance = (AwsUsersAttrib) getSession().get(
					"com.world.wen.AwsUsersAttrib", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUsersAttrib instance) {
		log.debug("finding AwsUsersAttrib instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUsersAttrib")
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
		log.debug("finding AwsUsersAttrib instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUsersAttrib as model where model."
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

	public List findByIntroduction(Object introduction) {
		return findByProperty(INTRODUCTION, introduction);
	}

	public List findBySignature(Object signature) {
		return findByProperty(SIGNATURE, signature);
	}

	public List findByQq(Object qq) {
		return findByProperty(QQ, qq);
	}

	public List findByHomepage(Object homepage) {
		return findByProperty(HOMEPAGE, homepage);
	}

	public List findAll() {
		log.debug("finding all AwsUsersAttrib instances");
		try {
			String queryString = "from AwsUsersAttrib";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUsersAttrib merge(AwsUsersAttrib detachedInstance) {
		log.debug("merging AwsUsersAttrib instance");
		try {
			AwsUsersAttrib result = (AwsUsersAttrib) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUsersAttrib instance) {
		log.debug("attaching dirty AwsUsersAttrib instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUsersAttrib instance) {
		log.debug("attaching clean AwsUsersAttrib instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}