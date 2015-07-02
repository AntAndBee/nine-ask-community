package com.world.wen.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.world.wen.model.AwsQuestionUninterested;

/**
 * A data access object (DAO) providing persistence and search support for
 * AwsQuestionUninterested entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.world.wen.model.AwsQuestionUninterested
 * @author MyEclipse Persistence Tools
 */
public class AwsQuestionUninterestedDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AwsQuestionUninterestedDAO.class);
	// property constants
	public static final String QUESTION_ID = "questionId";
	public static final String UID = "uid";
	public static final String ADD_TIME = "addTime";

	public void save(AwsQuestionUninterested transientInstance) {
		log.debug("saving AwsQuestionUninterested instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AwsQuestionUninterested persistentInstance) {
		log.debug("deleting AwsQuestionUninterested instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AwsQuestionUninterested findById(java.lang.Integer id) {
		log.debug("getting AwsQuestionUninterested instance with id: " + id);
		try {
			AwsQuestionUninterested instance = (AwsQuestionUninterested) getSession()
					.get("com.world.wen.AwsQuestionUninterested", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AwsQuestionUninterested instance) {
		log.debug("finding AwsQuestionUninterested instance by example");
		try {
			List results = getSession()
					.createCriteria("com.world.wen.AwsQuestionUninterested")
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
		log.debug("finding AwsQuestionUninterested instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from AwsQuestionUninterested as model where model."
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
		log.debug("finding all AwsQuestionUninterested instances");
		try {
			String queryString = "from AwsQuestionUninterested";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AwsQuestionUninterested merge(
			AwsQuestionUninterested detachedInstance) {
		log.debug("merging AwsQuestionUninterested instance");
		try {
			AwsQuestionUninterested result = (AwsQuestionUninterested) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AwsQuestionUninterested instance) {
		log.debug("attaching dirty AwsQuestionUninterested instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AwsQuestionUninterested instance) {
		log.debug("attaching clean AwsQuestionUninterested instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}