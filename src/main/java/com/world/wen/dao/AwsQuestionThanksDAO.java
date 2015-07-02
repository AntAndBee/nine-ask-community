package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsQuestionThanks;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsQuestionThanks entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsQuestionThanks
 * @author MyEclipse Persistence Tools
 */
public class AwsQuestionThanksDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsQuestionThanksDAO.class);
	// property constants
	public static final String UID = "uid";
	public static final String QUESTION_ID = "questionId";
	public static final String USER_NAME = "userName";
	public static final String TIME = "time";

	public void save(AwsQuestionThanks transientInstance) {
		log.debug("saving AwsQuestionThanks instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsQuestionThanks persistentInstance) {
		log.debug("deleting AwsQuestionThanks instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsQuestionThanks findById(java.lang.Integer id) {
		log.debug("getting AwsQuestionThanks instance with id: " + id);
		try {
			AwsQuestionThanks instance = (AwsQuestionThanks) getSession().get(
					"com.world.wen.AwsQuestionThanks", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsQuestionThanks instance) {
		log.debug("finding AwsQuestionThanks instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsQuestionThanks")
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
		log.debug("finding AwsQuestionThanks instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsQuestionThanks as model where model."
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

	public List findByQuestionId(Object questionId) {
		return findByProperty(QUESTION_ID, questionId);
	}

	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsQuestionThanks instances");
		try {
			String queryString = "from AwsQuestionThanks";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsQuestionThanks merge(AwsQuestionThanks detachedInstance) {
		log.debug("merging AwsQuestionThanks instance");
		try {
			AwsQuestionThanks result = (AwsQuestionThanks) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsQuestionThanks instance) {
		log.debug("attaching dirty AwsQuestionThanks instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsQuestionThanks instance) {
		log.debug("attaching clean AwsQuestionThanks instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}