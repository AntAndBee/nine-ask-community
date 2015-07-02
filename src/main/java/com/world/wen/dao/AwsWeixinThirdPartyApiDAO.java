package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinThirdPartyApi;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinThirdPartyApi entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinThirdPartyApi
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinThirdPartyApiDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinThirdPartyApiDAO.class);
	// property constants
	public static final String ACCOUNT_ID = "accountId";
	public static final String URL = "url";
	public static final String TOKEN = "token";
	public static final String ENABLED = "enabled";
	public static final String RANK = "rank";

	public void save(AwsWeixinThirdPartyApi transientInstance) {
		log.debug("saving AwsWeixinThirdPartyApi instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinThirdPartyApi persistentInstance) {
		log.debug("deleting AwsWeixinThirdPartyApi instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinThirdPartyApi findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinThirdPartyApi instance with id: " + id);
		try {
			AwsWeixinThirdPartyApi instance = (AwsWeixinThirdPartyApi) getSession()
					.get("com.world.wen.AwsWeixinThirdPartyApi", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinThirdPartyApi instance) {
		log.debug("finding AwsWeixinThirdPartyApi instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinThirdPartyApi")
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
		log.debug("finding AwsWeixinThirdPartyApi instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinThirdPartyApi as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAccountId(Object accountId) {
		return findByProperty(ACCOUNT_ID, accountId);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByToken(Object token) {
		return findByProperty(TOKEN, token);
	}

	public List findByEnabled(Object enabled) {
		return findByProperty(ENABLED, enabled);
	}

	public List findByRank(Object rank) {
		return findByProperty(RANK, rank);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinThirdPartyApi instances");
		try {
			String queryString = "from AwsWeixinThirdPartyApi";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinThirdPartyApi merge(AwsWeixinThirdPartyApi detachedInstance) {
		log.debug("merging AwsWeixinThirdPartyApi instance");
		try {
			AwsWeixinThirdPartyApi result = (AwsWeixinThirdPartyApi) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinThirdPartyApi instance) {
		log.debug("attaching dirty AwsWeixinThirdPartyApi instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinThirdPartyApi instance) {
		log.debug("attaching clean AwsWeixinThirdPartyApi instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}