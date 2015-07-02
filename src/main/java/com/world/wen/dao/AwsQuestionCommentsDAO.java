package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsQuestionComments;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsQuestionComments entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsQuestionComments
 * @author MyEclipse Persistence Tools
 */
public class AwsQuestionCommentsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsQuestionCommentsDAO.class);
	// property constants
	public static final String QUESTION_ID = "questionId";
	public static final String UID = "uid";
	public static final String MESSAGE = "message";
	public static final String TIME = "time";

	public void save(AwsQuestionComments transientInstance) {
		log.debug("saving AwsQuestionComments instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsQuestionComments persistentInstance) {
		log.debug("deleting AwsQuestionComments instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsQuestionComments findById(java.lang.Integer id) {
		log.debug("getting AwsQuestionComments instance with id: " + id);
		try {
			AwsQuestionComments instance = (AwsQuestionComments) getSession()
					.get("com.world.wen.AwsQuestionComments", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsQuestionComments instance) {
		log.debug("finding AwsQuestionComments instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsQuestionComments")
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
		log.debug("finding AwsQuestionComments instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsQuestionComments as model where model."
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

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findByTime(Object time) {
		return findByProperty(TIME, time);
	}

	public List findAll() {
		log.debug("finding all AwsQuestionComments instances");
		try {
			String queryString = "from AwsQuestionComments";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsQuestionComments merge(AwsQuestionComments detachedInstance) {
		log.debug("merging AwsQuestionComments instance");
		try {
			AwsQuestionComments result = (AwsQuestionComments) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsQuestionComments instance) {
		log.debug("attaching dirty AwsQuestionComments instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsQuestionComments instance) {
		log.debug("attaching clean AwsQuestionComments instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}