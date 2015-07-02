package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsMailQueue;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsMailQueue entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsMailQueue
 * @author MyEclipse Persistence Tools
 */
public class AwsMailQueueDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsMailQueueDAO.class);
	// property constants
	public static final String SEND_TO = "sendTo";
	public static final String SUBJECT = "subject";
	public static final String MESSAGE = "message";
	public static final String IS_ERROR = "isError";
	public static final String ERROR_MESSAGE = "errorMessage";

	public void save(AwsMailQueue transientInstance) {
		log.debug("saving AwsMailQueue instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsMailQueue persistentInstance) {
		log.debug("deleting AwsMailQueue instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsMailQueue findById(java.lang.Integer id) {
		log.debug("getting AwsMailQueue instance with id: " + id);
		try {
			AwsMailQueue instance = (AwsMailQueue) getSession().get(
					"com.world.wen.AwsMailQueue", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsMailQueue instance) {
		log.debug("finding AwsMailQueue instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsMailQueue")
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
		log.debug("finding AwsMailQueue instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsMailQueue as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySendTo(Object sendTo) {
		return findByProperty(SEND_TO, sendTo);
	}

	public List findBySubject(Object subject) {
		return findByProperty(SUBJECT, subject);
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByIsError(Object isError) {
		return findByProperty(IS_ERROR, isError);
	}

	public List findByErrorMessage(Object errorMessage) {
		return findByProperty(ERROR_MESSAGE, errorMessage);
	}

	public List findAll() {
		log.debug("finding all AwsMailQueue instances");
		try {
			String queryString = "from AwsMailQueue";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsMailQueue merge(AwsMailQueue detachedInstance) {
		log.debug("merging AwsMailQueue instance");
		try {
			AwsMailQueue result = (AwsMailQueue) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsMailQueue instance) {
		log.debug("attaching dirty AwsMailQueue instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsMailQueue instance) {
		log.debug("attaching clean AwsMailQueue instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}