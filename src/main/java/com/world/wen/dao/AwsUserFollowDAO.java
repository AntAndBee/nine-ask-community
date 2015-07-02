package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsUserFollow;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsUserFollow entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsUserFollow
 * @author MyEclipse Persistence Tools
 */
public class AwsUserFollowDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsUserFollowDAO.class);
	// property constants
	public static final String FANS_UID = "fansUid";
	public static final String FRIEND_UID = "friendUid";
	public static final String ADD_TIME = "addTime";

	public void save(AwsUserFollow transientInstance) {
		log.debug("saving AwsUserFollow instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsUserFollow persistentInstance) {
		log.debug("deleting AwsUserFollow instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsUserFollow findById(java.lang.Integer id) {
		log.debug("getting AwsUserFollow instance with id: " + id);
		try {
			AwsUserFollow instance = (AwsUserFollow) getSession().get(
					"com.world.wen.AwsUserFollow", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsUserFollow instance) {
		log.debug("finding AwsUserFollow instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsUserFollow")
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
		log.debug("finding AwsUserFollow instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsUserFollow as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByFansUid(Object fansUid) {
		return findByProperty(FANS_UID, fansUid);
	}

	public List findByFriendUid(Object friendUid) {
		return findByProperty(FRIEND_UID, friendUid);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsUserFollow instances");
		try {
			String queryString = "from AwsUserFollow";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsUserFollow merge(AwsUserFollow detachedInstance) {
		log.debug("merging AwsUserFollow instance");
		try {
			AwsUserFollow result = (AwsUserFollow) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsUserFollow instance) {
		log.debug("attaching dirty AwsUserFollow instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsUserFollow instance) {
		log.debug("attaching clean AwsUserFollow instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}