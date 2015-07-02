package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinMessage;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinMessage entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinMessage
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinMessageDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinMessageDAO.class);
	// property constants
	public static final String WEIXIN_ID = "weixinId";
	public static final String CONTENT = "content";
	public static final String ACTION = "action";
	public static final String TIME = "time";

	public void save(AwsWeixinMessage transientInstance) {
		log.debug("saving AwsWeixinMessage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinMessage persistentInstance) {
		log.debug("deleting AwsWeixinMessage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinMessage findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinMessage instance with id: " + id);
		try {
			AwsWeixinMessage instance = (AwsWeixinMessage) getSession().get(
					"com.world.wen.AwsWeixinMessage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinMessage instance) {
		log.debug("finding AwsWeixinMessage instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinMessage")
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
		log.debug("finding AwsWeixinMessage instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinMessage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByWeixinId(Object weixinId) {
		return findByProperty(WEIXIN_ID, weixinId);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByAction(Object action) {
		return findByProperty(ACTION, action);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinMessage instances");
		try {
			String queryString = "from AwsWeixinMessage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinMessage merge(AwsWeixinMessage detachedInstance) {
		log.debug("merging AwsWeixinMessage instance");
		try {
			AwsWeixinMessage result = (AwsWeixinMessage) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinMessage instance) {
		log.debug("attaching dirty AwsWeixinMessage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinMessage instance) {
		log.debug("attaching clean AwsWeixinMessage instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}