package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.world.wen.model.AwsActiveData;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsActiveData entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsActiveData
 * @author MyEclipse Persistence Tools
 */
@Repository
public class AwsActiveDataDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsActiveDataDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String EXPIRE_TIME = "expireTime";
	public static final String ACTIVE_CODE = "activeCode";
	public static final String ACTIVE_TYPE_CODE = "activeTypeCode";
	public static final String ADD_TIME = "addTime";
	public static final String ADD_IP = "addIp";
	public static final String ACTIVE_TIME = "activeTime";
	public static final String ACTIVE_IP = "activeIp";

	public void save(AwsActiveData transientInstance) {
		log.debug("saving AwsActiveData instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsActiveData persistentInstance) {
		log.debug("deleting AwsActiveData instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsActiveData findById(java.lang.Integer id) {
		log.debug("getting AwsActiveData instance with id: " + id);
		try {
			AwsActiveData instance = (AwsActiveData) getSession().get(
					"com.world.wen.AwsActiveData", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsActiveData instance) {
		log.debug("finding AwsActiveData instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsActiveData")
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
		log.debug("finding AwsActiveData instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsActiveData as model where model."
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

	public List findByExpireTime(Object expireTime) {
		return findByProperty(EXPIRE_TIME, expireTime);
	}

	public List findByActiveCode(Object activeCode) {
		return findByProperty(ACTIVE_CODE, activeCode);
	}

	public List findByActiveTypeCode(Object activeTypeCode) {
		return findByProperty(ACTIVE_TYPE_CODE, activeTypeCode);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findByAddIp(Object addIp) {
		return findByProperty(ADD_IP, addIp);
	}

	public List findByActiveTime(Object activeTime) {
		return findByProperty(ACTIVE_TIME, activeTime);
	}

	public List findByActiveIp(Object activeIp) {
		return findByProperty(ACTIVE_IP, activeIp);
	}

	public List findAll() {
		log.debug("finding all AwsActiveData instances");
		try {
			String queryString = "from AwsActiveData";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsActiveData merge(AwsActiveData detachedInstance) {
		log.debug("merging AwsActiveData instance");
		try {
			AwsActiveData result = (AwsActiveData) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsActiveData instance) {
		log.debug("attaching dirty AwsActiveData instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsActiveData instance) {
		log.debug("attaching clean AwsActiveData instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}