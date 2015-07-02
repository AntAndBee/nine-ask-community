package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsQuestionFocus;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsQuestionFocus entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsQuestionFocus
 * @author MyEclipse Persistence Tools
 */
public class AwsQuestionFocusDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsQuestionFocusDAO.class);
	// property constants
	public static final String QUESTION_ID = "questionId";
	public static final String UID = "uid";
	public static final String ADD_TIME = "addTime";

	public void save(AwsQuestionFocus transientInstance) {
		log.debug("saving AwsQuestionFocus instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsQuestionFocus persistentInstance) {
		log.debug("deleting AwsQuestionFocus instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsQuestionFocus findById(java.lang.Integer id) {
		log.debug("getting AwsQuestionFocus instance with id: " + id);
		try {
			AwsQuestionFocus instance = (AwsQuestionFocus) getSession().get(
					"com.world.wen.AwsQuestionFocus", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsQuestionFocus instance) {
		log.debug("finding AwsQuestionFocus instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsQuestionFocus")
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
		log.debug("finding AwsQuestionFocus instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsQuestionFocus as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByQuestionId(Object questionId) {
		return findByProperty(QUESTION_ID, questionId);
	}

	public List findByUid(Object uid) {
		return findByProperty(UID, uid);
	}

	public List findByAddTime(Object addTime) {
		return findByProperty(ADD_TIME, addTime);
	}

	public List findAll() {
		log.debug("finding all AwsQuestionFocus instances");
		try {
			String queryString = "from AwsQuestionFocus";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsQuestionFocus merge(AwsQuestionFocus detachedInstance) {
		log.debug("merging AwsQuestionFocus instance");
		try {
			AwsQuestionFocus result = (AwsQuestionFocus) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsQuestionFocus instance) {
		log.debug("attaching dirty AwsQuestionFocus instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsQuestionFocus instance) {
		log.debug("attaching clean AwsQuestionFocus instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}