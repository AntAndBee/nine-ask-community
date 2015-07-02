package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsReceivingEmailConfig;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsReceivingEmailConfig entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsReceivingEmailConfig
 * @author MyEclipse Persistence Tools
 */
public class AwsReceivingEmailConfigDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsReceivingEmailConfigDAO.class);
	// property constants
	public static final String PROTOCOL = "protocol";
	public static final String SERVER = "server";
	public static final String SSL = "ssl";
	public static final String PORT = "port";
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String UID = "uid";
	public static final String ACCESS_KEY = "accessKey";
	public static final String HAS_ATTACH = "hasAttach";

	public void save(AwsReceivingEmailConfig transientInstance) {
		log.debug("saving AwsReceivingEmailConfig instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsReceivingEmailConfig persistentInstance) {
		log.debug("deleting AwsReceivingEmailConfig instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsReceivingEmailConfig findById(java.lang.Integer id) {
		log.debug("getting AwsReceivingEmailConfig instance with id: " + id);
		try {
			AwsReceivingEmailConfig instance = (AwsReceivingEmailConfig) getSession()
					.get("com.world.wen.AwsReceivingEmailConfig", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsReceivingEmailConfig instance) {
		log.debug("finding AwsReceivingEmailConfig instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsReceivingEmailConfig")
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
		log.debug("finding AwsReceivingEmailConfig instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsReceivingEmailConfig as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProtocol(Object protocol) {
		return findByProperty(PROTOCOL, protocol);
	}

	public List findByServer(Object server) {
		return findByProperty(SERVER, server);
	}

	public List findBySsl(Object ssl) {
		return findByProperty(SSL, ssl);
	}

	public List findByPort(Object port) {
		return findByProperty(PORT, port);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByAccessKey(Object accessKey) {
		return findByProperty(ACCESS_KEY, accessKey);
	}

	public List findByHasAttach(Object hasAttach) {
		return findByProperty(HAS_ATTACH, hasAttach);
	}

	public List findAll() {
		log.debug("finding all AwsReceivingEmailConfig instances");
		try {
			String queryString = "from AwsReceivingEmailConfig";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsReceivingEmailConfig merge(
			AwsReceivingEmailConfig detachedInstance) {
		log.debug("merging AwsReceivingEmailConfig instance");
		try {
			AwsReceivingEmailConfig result = (AwsReceivingEmailConfig) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsReceivingEmailConfig instance) {
		log.debug("attaching dirty AwsReceivingEmailConfig instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsReceivingEmailConfig instance) {
		log.debug("attaching clean AwsReceivingEmailConfig instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}