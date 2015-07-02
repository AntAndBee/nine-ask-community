package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsWeixinQrCode;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsWeixinQrCode entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsWeixinQrCode
 * @author MyEclipse Persistence Tools
 */
public class AwsWeixinQrCodeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsWeixinQrCodeDAO.class);
	// property constants
	public static final String TICKET = "ticket";
	public static final String DESCRIPTION = "description";
	public static final String SUBSCRIBE_NUM = "subscribeNum";

	public void save(AwsWeixinQrCode transientInstance) {
		log.debug("saving AwsWeixinQrCode instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsWeixinQrCode persistentInstance) {
		log.debug("deleting AwsWeixinQrCode instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsWeixinQrCode findById(java.lang.Integer id) {
		log.debug("getting AwsWeixinQrCode instance with id: " + id);
		try {
			AwsWeixinQrCode instance = (AwsWeixinQrCode) getSession().get(
					"com.world.wen.AwsWeixinQrCode", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsWeixinQrCode instance) {
		log.debug("finding AwsWeixinQrCode instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsWeixinQrCode")
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
		log.debug("finding AwsWeixinQrCode instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsWeixinQrCode as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTicket(Object ticket) {
		return findByProperty(TICKET, ticket);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findBySubscribeNum(Object subscribeNum) {
		return findByProperty(SUBSCRIBE_NUM, subscribeNum);
	}

	public List findAll() {
		log.debug("finding all AwsWeixinQrCode instances");
		try {
			String queryString = "from AwsWeixinQrCode";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsWeixinQrCode merge(AwsWeixinQrCode detachedInstance) {
		log.debug("merging AwsWeixinQrCode instance");
		try {
			AwsWeixinQrCode result = (AwsWeixinQrCode) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsWeixinQrCode instance) {
		log.debug("attaching dirty AwsWeixinQrCode instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsWeixinQrCode instance) {
		log.debug("attaching clean AwsWeixinQrCode instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}